package rvg.svsots.rest;

import rvg.sots.AttachmentsEntity;
import rvg.sots.AttachmentsFrontEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by charmingc0d3r on 26.11.16..
 */
@Path("/nastavniResursi")
public class NastavniResursi {

    @GET
    @Path("/onebyid/{id}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public static AttachmentsEntity getOneById(@PathParam("id") long id) {
        return AttachmentsEntity.getById(id);
    }

    public static void main(String[] args) {
        NastavniResursi.getOneById(1L);
    }
}
