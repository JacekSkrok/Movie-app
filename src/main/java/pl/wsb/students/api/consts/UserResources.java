package pl.wsb.students.api.consts;

import pl.wsb.students.api.model.RegisterUserRequest;
import pl.wsb.students.api.model.UserDeactivateRequest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(ApiEndpoints.USER)
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)


public class UserResources {
    @POST
    public Response postUser(RegisterUserRequest body) {

        return Response.status(Response.Status.OK).entity("zalogowano").build();
    }

    @PUT
    public Response putUser(UserDeactivateRequest body) {
        return Response.status(Response.Status.OK).entity("dezaktywowano").build();
    }

    @POST
    @Path(ApiEndpoints.USER_LOGOUT)
    public Response postUserLogout() {
        return Response.status(Response.Status.OK).entity("wylogowano").build();
    }


}
