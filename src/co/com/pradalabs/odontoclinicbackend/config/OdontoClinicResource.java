package co.com.pradalabs.odontoclinicbackend.config;




import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;



@Path("/OdontoClinic")
public class OdontoClinicResource {

	@GET
	  @Path("/{name}")
	  public Response getMessage(@PathParam("name") String name)
	  {
	    String outMsg = "Bueno ya tengo servicio rest o no viejo  " + name + "!";
	    return Response.status(200).entity(outMsg).build();
	  }
}
