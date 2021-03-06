package com.rjrks;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/aliens")
public class AlienResource {

    AlienRepository repo = new AlienRepository();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Alien> getAliens(){
        System.out.println("getAlien called");
        return repo.getAliens();
    }

    @GET
    @Path("alien/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Alien getAlien(@PathParam("id") int id) {
        return repo.getAlien(id);
    }

    @POST
    @Path("alien")
    public Alien createAlien(Alien a1) {
        System.out.println(a1);
        repo.create(a1);
        return a1;
    }
}
