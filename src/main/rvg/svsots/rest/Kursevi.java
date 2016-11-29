package rvg.svsots.rest;

import rvg.sots.AttachmentsFrontEntity;
import rvg.sots.CoursesEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
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

}
