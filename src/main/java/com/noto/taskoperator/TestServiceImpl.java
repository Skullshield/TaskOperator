package com.noto.taskoperator;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public abstract class TestServiceImpl implements TestService {
    @Override
    public Response registerUser(String taskId,User user) {
        System.out.println("User name \t\t" + user.getName());
        System.out.println("User age \t\t" + user.getAge());

        CustomResponse response = new CustomResponse();
        response.setStatusText("User " + user.getName() + " was created!");
        return Response.ok().entity(response).build();
    }

    @Path("getTask/TaskOne")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response solveTaskOne() {
       CustomResponse response = new CustomResponse();
       response.setStatusText("Task One successfully resolved!");
       return Response.ok()
               .entity(response)
               .build();
    }
}
