package rvg.svsots.rest;

import rvg.Defaults;
import rvg.Interchange;
import rvg.sots.AttachmentsEntity;
import rvg.sots.AttachmentsFrontEntity;
import rvg.sv.LangString;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by charmingc0d3r on 26.11.16..
 */
@Path("/learningObject")
public class NastavniResursi {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public static AttachmentsFrontEntity getOneById(@PathParam("id") long id) {
        return AttachmentsFrontEntity.getById(id);
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public static List<AttachmentsFrontEntity> getAll() {
        return AttachmentsFrontEntity.getAll();
    }

    @POST
    @Path("/{id}/type")
    //@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public static void setType(@PathParam("id") Long id, @FormParam("type") String type) {
        AttachmentsFrontEntity afe = new AttachmentsFrontEntity();
        afe.setCore(AttachmentsEntity.getById(id));
        afe.setAttachmentType(type);
        Interchange.LearningObjectPostgresToVirtuoso(afe);
    }

    @POST
    @Path("/{id}/competencies")
    //@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public static void setCompetencies(@PathParam("id") Long id, @FormParam("competencies") List<String> competencies) {
        AttachmentsFrontEntity afe = new AttachmentsFrontEntity();
        afe.setCore(AttachmentsEntity.getById(id));
        afe.getCompetencies().addAll(competencies);
        Interchange.LearningObjectPostgresToVirtuoso(afe);
    }

    @POST
    @Path("/{id}/typeandcompetencies")
    //@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public static void setTypeAndCompetencies(@PathParam("id") Long id,@FormParam("type") String type, @FormParam("competencies") List<String> competencies) {
        AttachmentsFrontEntity afe = new AttachmentsFrontEntity();
        afe.setCore(AttachmentsEntity.getById(id));
        afe.setAttachmentType(type);
        afe.getCompetencies().addAll(competencies);
        Interchange.LearningObjectPostgresToVirtuoso(afe);
    }

    @POST
    @Path("/find")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public static List<AttachmentsFrontEntity> find(
            @FormParam("name") String name,
            @FormParam("types") String types,
            @FormParam("competencies") String competencies
    ) {
        ArrayList<AttachmentsFrontEntity> temp = new ArrayList<>(), all = AttachmentsFrontEntity.getAll();
        if (name != null) {
            if (!name.trim().equals("")) {
                String[] sname = name.split(" ");
                for (AttachmentsFrontEntity afe :
                        all) {
                    boolean exi = true;
                    for (String si :
                            sname) {
                        if (!afe.getCore().getDisplayName().contains(si)) {
                            exi = false;
                            break;
                        }
                    }
                    if (exi)
                        temp.add(afe);
                }
                all = temp;
                temp = new ArrayList<>();
            }
        }
        if (types != null) {
            if (!types.trim().equals("")) {
                String[] sname = types.split(" ");
                for (AttachmentsFrontEntity afe :
                        all) {
                    boolean exi = false;
                    for (String si :
                            sname) {
                        if (afe.getAttachmentType().contains(si)) {
                            exi = true;
                            break;
                        }
                    }
                    if (exi)
                        temp.add(afe);
                }
                all = temp;
                temp = new ArrayList<>();
            }
        }
        if (competencies != null) {
            if (!competencies.trim().equals("")) {
                String[] sname = competencies.split(" ");
                for (AttachmentsFrontEntity afe :
                        all) {
                    boolean exi = false;
                    for (String si :
                            sname) {
                        if (afe.getCompetencies().contains(si)) {
                            exi = true;
                            break;
                        }
                    }
                    if (exi)
                        temp.add(afe);
                }
                all = temp;
            }
        }
        return all;
    }

    @GET
    @Path("/download")
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    public Response getFiles(@FormParam("id") String id) throws IOException {
        Response.ResponseBuilder response;
        if (id == null)
            response = Response.noContent();
        else if (id.trim().equals(""))
            response = Response.noContent();
        else {
            String newPath = "/tmp/download"+ new Random(new Date().getTime()).nextDouble()+".zip";
            FileOutputStream fos = new FileOutputStream(newPath);
            ZipOutputStream zos = new ZipOutputStream(fos);
            String[] ids = id.split(" ");
            byte[] buffer = new byte[1024];
            for (String pid :
                    ids) {
                try {
                    AttachmentsFrontEntity afe = AttachmentsFrontEntity.getById(Long.parseLong(pid));
                    ZipEntry ze = new ZipEntry(afe.getCore().getFilename());
                    zos.putNextEntry(ze);
                    FileInputStream in = new FileInputStream(Defaults.getFullPath(afe));
                    int len;
                    while ((len = in.read(buffer)) > 0) {
                        zos.write(buffer, 0, len);
                    }

                    in.close();
                    zos.closeEntry();
                } catch (NumberFormatException nfe) {}
            }
            zos.close();
            File file = new File(newPath);
            response = Response.ok((Object) file);
            response.header("Content-Disposition", "attachment; filename=download.zip");
        }
        return response.build();
    }
}
