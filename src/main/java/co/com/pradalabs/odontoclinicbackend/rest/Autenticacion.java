package co.com.pradalabs.odontoclinicbackend.rest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.security.authentication.AuthenticationDetailsSource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;

import co.com.pradalabs.odontoclinicbackend.domain.objetoservicios.UsuarioAutenticacion;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserServiceFactory;



@Path("/Autenticacion")
public class Autenticacion {
	private AuthenticationManager authenticationManager;
	@SuppressWarnings("rawtypes")
	private AuthenticationDetailsSource ads = new WebAuthenticationDetailsSource();
	
	@POST
	@Path("/AutenticacionUserPass")
	@Consumes(MediaType.APPLICATION_JSON)
    public String AutenticacionGoogle(UsuarioAutenticacion usuarioAutenticacion,@Context HttpServletRequest request)  
	{
		String respuesta="";
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		try {
		
	    User googleUser = new User(usuarioAutenticacion.getLogin(), usuarioAutenticacion.getPassword(), usuarioAutenticacion.getLogin());//UserServiceFactory.getUserService().getCurrentUser();
	    if (googleUser != null) {
	    	PreAuthenticatedAuthenticationToken token = new PreAuthenticatedAuthenticationToken(googleUser, null);
	        token.setDetails(ads.buildDetails(request));
	        authentication = authenticationManager.authenticate(token);
	        SecurityContextHolder.getContext().setAuthentication(authentication);
	        respuesta = token.getName();
	    }
//	    else
//	    {
//	    	respuesta="El usuario no tiene una contraseña valida";
//	    }
		} catch (Exception e) {
			e.printStackTrace();
			respuesta="No se ha podido ejecutar el servicio de autenticacion correctamente.";
			return respuesta;
		}
	
	    return respuesta;
    }

	
}
