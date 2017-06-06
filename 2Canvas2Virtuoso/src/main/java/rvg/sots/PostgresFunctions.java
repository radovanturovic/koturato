package rvg.sots;

import org.postgresql.pljava.annotation.Function;
import org.postgresql.pljava.annotation.SQLType;
import org.postgresql.pljava.annotation.Trigger;
import rvg.Interchange;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.*;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;
import static org.apache.commons.codec.Charsets.UTF_8;

/**
 * Created by charmingc0d3r on 7.5.17..
 */
public class PostgresFunctions {

    @Function(trust = Function.Trust.UNSANDBOXED)
    public static void toVirt(String opera, Long id, String dispName, String fojles) {
        try{
            FileWriter osw = new FileWriter("/tmp/gtrtDEMON/"+fojles, true);
            PrintWriter writer = new PrintWriter(osw);
            writer.println(opera+"|"+id+"|"+dispName);
            writer.close();
        } catch (Exception e) {
        }
    }

    @Function(trust = Function.Trust.UNSANDBOXED)
    public static void toVirtNio(String opera, Long id, String dispName, String fojles) {
        try{
            Path logfojl = Paths.get("/tmp/gtrtDEMON/"+fojles);
            try {
                Files.createFile(logfojl);
                Files.setPosixFilePermissions(logfojl, PosixFilePermissions.fromString("rw-r--r--"));
            } catch (FileAlreadyExistsException ignored) {
            }
            PrintWriter writer = new PrintWriter(Files.newBufferedWriter(logfojl));
            writer.println(opera+"|"+id+"|"+dispName);
            writer.close();
        } catch (Exception e) {
        }
    }

    @Function(trust = Function.Trust.UNSANDBOXED)
    public static void CtoVirt(String fojles) {
        try{
            File old = new File("/tmp/gtrtDEMON/"+fojles);
            File nld = new File("/tmp/gtrtDEMON/@"+fojles);
            old.renameTo(nld);
        } catch (Exception e) {
        }
    }
/*
    @Function(trust = Function.Trust.UNSANDBOXED)
    public static String triggeredFunction(Long id) {
        try{
            List<String> string = new ArrayList<String>();
            string.add(new Date().toString() + " || id: " + id);
            //Files.write(Paths.get("/home/charmingc0d3r/sotsv.debug.txt"), string, UTF_8,APPEND, CREATE);
            AttachmentsEntity ae = AttachmentsEntity.getById(id);
            string.add(ae.toString());
            Files.write(Paths.get("/tmp/sotsv.debug.txt"), string, UTF_8,APPEND, CREATE);
            return ae.toString();
        } catch (Exception e) {
            return e.toString();
        }
    }

    @Function(trust = Function.Trust.UNSANDBOXED)
    public static String triggeredFunction(int id) {
        return triggeredFunction(new Long(id));
    }

    @Function(trust = Function.Trust.UNSANDBOXED)
    public static void smackMaPatchUp(String address, String ids) {
        executePost(address,"ids="+ids);
    }

    @Function(trust = Function.Trust.UNSANDBOXED)
    public static void triggeredFunction(@SQLType(value = "public.attachments") AttachmentsEntity entity) {
        try{
            PrintWriter writer = new PrintWriter("/tmp/debug.txt", "UTF-8");
            writer.println(new Date().toString() + " || entity: " + entity.toString());
            writer.close();
        } catch (Exception e) {
        }
    }

    public static String executePost(String targetURL, String urlParameters) {
        HttpURLConnection connection = null;

        try {
            //Create connection
            URL url = new URL(targetURL);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type",
                    "application/x-www-form-urlencoded");

            connection.setRequestProperty("Content-Length",
                    Integer.toString(urlParameters.getBytes().length));
            connection.setRequestProperty("Content-Language", "en-US");

            connection.setUseCaches(false);
            connection.setDoOutput(true);

            //Send request
            DataOutputStream wr = new DataOutputStream (
                    connection.getOutputStream());
            wr.writeBytes(urlParameters);
            wr.close();

            //Get Response
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
    */
}
