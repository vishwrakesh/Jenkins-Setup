package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/home")
public class SimpleService {

	@GET
	public Response showMessage() {
		String msg = "Welcome to deployed version";
		return Response.status(200).entity(msg).build();
	}

}
