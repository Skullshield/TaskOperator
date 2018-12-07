package com.noto.taskoperator;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public interface TestService {

    @Path("register/{taskId}")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response registerUser(@PathParam("taskId") String taskId, User user);


    public Response solveTaskOne();
}
