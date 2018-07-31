package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/home")
public class SimpleService {

	@GET
	@Path("{message}")
	public Response publishMessage(@PathParam("message") String msg) {
		String responseStr = "Received message: "+msg;
		return Response.status(200).entity(responseStr).build();
	}
	
	@GET
	public Response showMessage() {
		String msg = "Welcome to deployed version";
		return Response.status(200).entity(msg).build();
	}

}
