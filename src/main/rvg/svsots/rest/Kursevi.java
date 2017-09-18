package rvg.svsots.rest;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import rvg.Defaults;
import rvg.sots.AttachmentsFrontEntity;
import rvg.sots.CoursesEntity;
import rvg.sots.util.Packager;
import rvg.sv.LOM;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by charmingc0d3r on 29.11.16..
 */
@Path("/course")
public class Kursevi {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public static CoursesEntity getOneById(@PathParam("id") long id) {
        return CoursesEntity.getById(id);
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public static List<CoursesEntity> getAll() {
        return CoursesEntity.getAll();
    }

    @POST
    @Path("/generate")
    public Response getExport(@FormParam("ids") String ids, @FormParam("name") String name) throws IOException {
        Response.ResponseBuilder response;
        if (ids == null)
            response = Response.noContent();
        else if (ids.trim().equals(""))
            response = Response.noContent();
        else {
            String[] idi = ids.split(",");
            ArrayList<AttachmentsFrontEntity> afes = new ArrayList<>();
            for (String id :
                    idi) {
                AttachmentsFrontEntity afe = AttachmentsFrontEntity.getById(Long.parseLong(id));
                if (afe != null)
                    afes.add(afe);
            }
            if (afes.isEmpty())
                response = Response.noContent();
            else {

                response = Response.ok();
            }
        }
        return response.build();
    }

    public static String makeCourse(String courseName) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost request = new HttpPost("http://localhost:3000/api/v1/accounts/3/courses");
            request.addHeader("Authorization", getAuthorizationString());
            ArrayList<NameValuePair> postParameters = new ArrayList<>();
            postParameters.add(new BasicNameValuePair("course[name]", courseName));
            request.setEntity(new UrlEncodedFormEntity(postParameters, "UTF-8"));
            JsonObject accept;
            try (CloseableHttpResponse res = httpClient.execute(request)) {
                try (JsonReader reader = Json.createReader(new BufferedReader(new InputStreamReader(res.getEntity().getContent(), "UTF-8")))) {
                    accept = reader.readObject();
                } catch (Exception e) {
                    return null;
                }
            } catch (Exception e) {
                return null;
            }
            return Integer.toString(accept.getInt("id"));
        } catch (IOException e) {
            return null;
        }
    }

    public static void uploadFileToCourse(String courseId, AttachmentsFrontEntity afe) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost request = new HttpPost("http://localhost:3000/api/v1/courses/"+courseId+"/files");
            request.addHeader("Authorization", getAuthorizationString());
            ArrayList<NameValuePair> postParameters = new ArrayList<NameValuePair>();
            postParameters.add(new BasicNameValuePair("name", afe.getCore().getDisplayName()));
            request.setEntity(new UrlEncodedFormEntity(postParameters, "UTF-8"));
            JsonObject accept;
            try (CloseableHttpResponse response = httpClient.execute(request)) {
                try (JsonReader reader = Json.createReader(new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "UTF-8")))) {
                    accept = reader.readObject();
                }
            }
            if (accept == null)
                return;
            if (!accept.containsKey("upload_url")) {
                System.out.println("Иницијализација није прошла како треба. Штета.");
                return;
            }
            request = new HttpPost(accept.getString("upload_url"));
            request.addHeader("Authorization", getAuthorizationString());
            JsonObject upload_params = accept.getJsonObject("upload_params");
            MultipartEntityBuilder meb = MultipartEntityBuilder.create();
            for (String pkey :
                    upload_params.keySet()) {
                meb.addTextBody(pkey, upload_params.getString(pkey));
            }

            HttpEntity requestEntity = meb
                    .addBinaryBody("file", new File(getFilePathForRealNow(Defaults.getProps22().getProperty("canvasAttachmentsPath")+String.format("%04d", afe.getCore().getId())+"/"+afe.getCore().getFilename())))
                    .build();
            request.setEntity(requestEntity);
            String location;
            try (CloseableHttpResponse response = httpClient.execute(request)) {
                if (response.getStatusLine().getStatusCode() > 399 || response.getStatusLine().getStatusCode() < 200) {
                    System.out.println("Похрана није прошла како треба. Штета.");
                    return;
                }
                location = response.getFirstHeader("Location").getValue();
            }
            if (location == null)
                return;
            request = new HttpPost(location);
            request.addHeader("Authorization", getAuthorizationString());
            try (CloseableHttpResponse response = httpClient.execute(request)) {
                if (response.getStatusLine().getStatusCode() > 399 || response.getStatusLine().getStatusCode() < 200) {
                    System.out.println("Све је прошло до краја, али кад неоће хтело да ради... Штета.");
                    return;
                }
            }
            System.out.println("Радиииииииииииииииииииииии!!! <3 :-)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getFilePathForRealNow(String canvasAttachmentsPath) {
        int first_slash = canvasAttachmentsPath.indexOf("/");
        String first = canvasAttachmentsPath.substring(0,first_slash);
        String second = canvasAttachmentsPath.substring(first_slash);
        if (first.startsWith("$")) {
            first = System.getenv(first.substring(1));
        }
        return first + second;
    }

    private static String getAuthorizationString() {
        return "Bearer VJ9w5dtL31g55XU7y16SWkLdMBHeTh8yyzi0VckidTWUYqRGb4vCsZXYOsZmTW7R";
    }

    public static void main(String[] args) {
        String courseId = makeCourse("ллл");
        String ids = "2,20";
        String[] idi = ids.split(",");
        ArrayList<AttachmentsFrontEntity> afes = new ArrayList<>();
        for (String id :
                idi) {
            AttachmentsFrontEntity afe = AttachmentsFrontEntity.getById(Long.parseLong(id));
            if (afe != null) {
                if (afe.getCore().getFileState().equals("available")) {
                    System.out.println("afe.getCore().getRootAttachmentId() = " + afe.getCore().getRootAttachmentId());
                    if (afe.getCore().getRootAttachmentId() == null)
                        afes.add(afe);
                    else {
                        afe = AttachmentsFrontEntity.getById(afe.getCore().getRootAttachmentId());
                        if (afe != null)
                            afes.add(afe);
                    }
                }
            }
        }
        if (afes.isEmpty())
            System.out.println("Трт Милојка");
        else {
            for (AttachmentsFrontEntity afe :
                    afes) {
                uploadFileToCourse(courseId, afe);
            }
        }
    }
}
