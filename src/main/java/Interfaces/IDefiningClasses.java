package Interfaces;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;

@Path("/definingServices")
public interface IDefiningClasses {

    @Path("/{taskName}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response processTask(@PathParam("taskName") String taskId);
}
