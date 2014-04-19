package co.com.pradalabs.odontoclinicbackend.rest.generales;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;

import co.com.pradalabs.odontoclinicbackend.utils.ConstantesOdonto;


@Controller
@Path("/ListaValores")
public class ServicioListaValores {
	@Autowired
    private UserDetailsManager userDetailsManager;
	
	@POST
	@Path("/InformacionClinica")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public String informacionclinica(String  tokenId,@Context HttpServletRequest request,@Context HttpServletResponse response)  
	{
		String respuesta="";
		String token=request.getParameter(ConstantesOdonto.TOKEN);
		 
		
		
		return respuesta;
		
	}
}
