import rvg.Interchange;
import rvg.sots.AttachmentsEntity;
import rvg.sots.AttachmentsFrontEntity;
import rvg.sots.CoursesEntity;
import rvg.sv.LOM;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.*;

@Startup
@Singleton
public class TimerovicVremenko{
    private static final Logger log;
    static {
        Path debuba = Paths.get("/tmp/debuba.txt");
        if (Files.notExists(debuba))
            try {
                Files.createFile(debuba);
            } catch (IOException e) {
                e.printStackTrace();
            }
        try {
            Files.setPosixFilePermissions(debuba, PosixFilePermissions.fromString("rw-rw-rw-"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        log = Logger.getLogger(TimerovicVremenko.class.getName());
        try {
            FileHandler fh = new FileHandler("/tmp/debuba.txt");
            fh.setFormatter(new SimpleFormatter());
            log.addHandler(fh);
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.info("Lepo sam ja ovo namestio.");
    }
/*
    @Init
    public void starter() {
        log.info("starter(): Inicijalizacija");
        Path demon = Paths.get("/tmp/gtrtDEMON");
        try {
            Path init = null;
            try {
                init = Files.createDirectory(demon);
            } catch (FileAlreadyExistsException ignored) {
            }
            if (init == null) init = demon;
            init = init.resolve("@init.rtg");
            if (Files.exists(init)) {
                log.info("Nasao @init.rtg datoteku.");
                try {
                    Files.delete(init);
                } catch (Exception e) {
                    log.warning("Datoteka @init.rtg nije obrisana...");
                }
                AttachmentsEntity.getAll().forEach(ae -> Interchange.LearningObjectPostgresToVirtuoso(ae));
                CoursesEntity.getAll().forEach(ce -> Interchange.CoursePostgresToVirtuoso(ce));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    @Resource
    private TimerService timerService;

    @PostConstruct
    public void createProgrammaticalTimer() {
        log.info("ProgrammaticalTimerEJB initialized");

        ScheduleExpression everyTenSeconds = new ScheduleExpression()
                .second("*/30").minute("*").hour("*");
        timerService.createCalendarTimer(everyTenSeconds, new TimerConfig(
                "passed message " + new Date(), false));

        Path demon = Paths.get("/tmp/gtrtDEMON");
        try {
            Path init = null;
            try {
                init = Files.createDirectory(demon);
            } catch (FileAlreadyExistsException ignored) {
            }
            if (init == null) init = demon;
            init = init.resolve("@init.rtg");
            if (Files.exists(init)) {
                log.info("Nasao @init.rtg datoteku.");
                try {
                    Files.delete(init);
                } catch (Exception e) {
                    log.warning("Datoteka @init.rtg nije obrisana...");
                }
                AttachmentsEntity.getAll().forEach(ae -> Interchange.LearningObjectPostgresToVirtuoso(ae));
                CoursesEntity.getAll().forEach(ce -> Interchange.CoursePostgresToVirtuoso(ce));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Timeout
    public static void nioHandleTimer(final Timer timer) {
        Path demon = Paths.get("/tmp/gtrtDEMON");
        try (DirectoryStream<Path> gtrs = Files.newDirectoryStream(demon, "@[ac]*.rtg")) {
            for (Path gtrlog : gtrs) {
                log.info("Obradjujem datoteku " + gtrlog);
                String filename = gtrlog.getFileName().toString();
                if (filename.startsWith("@c")) {
                    Files.lines(gtrlog).forEach( line -> {
                        String[] pars = line.split("\\|");
                        if (pars[0].equals("i") || pars[0].equals("u")) {
                            try {
                                Interchange.CoursePostgresToVirtuoso(CoursesEntity.getById(Long.parseLong(pars[1])));
                            } catch (Exception e) {}
                        }
                    });
                } else if (filename.startsWith("@a")) {
                    Files.lines(gtrlog).forEach( line -> {
                        String[] pars = line.split("\\|");
                        if (pars[0].equals("i") || pars[0].equals("u")) {
                            try {
                                Interchange.LearningObjectPostgresToVirtuoso(AttachmentsEntity.getById(Long.parseLong(pars[1])));
                            } catch (Exception e) {}
                        }
                    });
                }
                Files.delete(gtrlog);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}