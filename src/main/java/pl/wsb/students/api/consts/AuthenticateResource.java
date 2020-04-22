package pl.wsb.students.api.consts;

import pl.wsb.students.api.model.AuthenticationRequest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(ApiEndpoints.AUTHENTICATE)
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)


public class AuthenticateResource {

    @POST
    public Response postAuthenticate(AuthenticationRequest body) {
        return Response.status(Response.Status.OK).entity("mock call ok...").build();
    }

}
