package co.com.pradalabs.odontoclinicbackend.rest.seguridad;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.authentication.AuthenticationDetailsSource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;

import co.com.pradalabs.odontoclinicbackend.config.seguridad.GoogleAccountsAuthenticationProvider;
import co.com.pradalabs.odontoclinicbackend.domain.dtoservicios.UsuarioAutenticacion;
import co.com.pradalabs.odontoclinicbackend.utils.ConstantesOdonto;



@Path("/Autenticacion")
public class ServicioAutenticacion {
	@SuppressWarnings("rawtypes")
	private AuthenticationDetailsSource ads = new WebAuthenticationDetailsSource();
	
	@POST
	@Path("/AutenticacionUserPass")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public String AutenticacionGoogle(UsuarioAutenticacion usuarioAutenticacion,@Context HttpServletRequest request,@Context HttpServletResponse response)  
	{
		String respuesta=" ";
		AbstractAuthenticationToken authToken = null;
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		try {
			authToken=(AbstractAuthenticationToken) request.getSession().getAttribute(ConstantesOdonto.TOKEN);
		if(authentication != null  && authToken != null){
			
			respuesta = authToken.getCredentials().toString();
		}
		} catch (Exception e) {
			e.printStackTrace();
			respuesta="No se ha podido ejecutar el servicio de autenticacion correctamente.";
			System.out.println("Problemas en la Autenticacion");
			return respuesta;
		}
	    return respuesta;
    }

	
}
