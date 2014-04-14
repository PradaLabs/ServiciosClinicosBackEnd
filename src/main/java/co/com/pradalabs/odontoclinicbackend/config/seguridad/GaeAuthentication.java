package co.com.pradalabs.odontoclinicbackend.config.seguridad;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationDetailsSource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;

import co.com.pradalabs.odontoclinicbackend.utils.ConstantesOdonto;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserServiceFactory;

public class GaeAuthentication {
	private String pathIngresado;
	
	private static final String REGISTRATION_URL = "register.html";
	private static final String LOGIN_URL = "LoginUser.html";
	@SuppressWarnings("rawtypes")
	private AuthenticationDetailsSource ads = new WebAuthenticationDetailsSource();

	
	public void setPathIngresado(String pathIngresado) {
		this.pathIngresado = pathIngresado;
	}




	@SuppressWarnings("unchecked")
	public ServletResponse AutenticarUsuario(ServletRequest request,ServletResponse response, AuthenticationManager authenticationManager, AuthenticationFailureHandler failureHandler) throws IOException, ServletException{
		ServletResponse responseAutenticacion=response;
		 Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		   
		    
		    if (authentication == null) {
		      // User isn't authenticated. Check if there is a Google Accounts user
		      User googleUser = UserServiceFactory.getUserService().getCurrentUser();

		      if (googleUser != null) {
		        // User has returned after authenticating through GAE. Need to authenticate to Spring Security.
		        PreAuthenticatedAuthenticationToken token = new PreAuthenticatedAuthenticationToken(googleUser, null);
		        token.setDetails(ads.buildDetails(request));

		        try {
		          authentication = authenticationManager.authenticate(token);
		          // Setup the security context
		          SecurityContextHolder.getContext().setAuthentication(authentication);
		          // Send new users to the registration page.
		          if (!validarListaRecursos(pathIngresado)) {
		            ((HttpServletResponse) responseAutenticacion).sendRedirect(REGISTRATION_URL);
		              return responseAutenticacion;
		          }
		        } catch (AuthenticationException e) {
		         // Authentication information was rejected by the authentication manager
		          failureHandler.onAuthenticationFailure((HttpServletRequest)request, (HttpServletResponse)response, e);
		          return responseAutenticacion;
		        }
		      }
		    }else
		    {
		    	if( !validarListaRecursos(pathIngresado)){
		    	 ((HttpServletResponse) responseAutenticacion).sendRedirect(LOGIN_URL);
		    	 return responseAutenticacion;
		    	 }
		    }
		    return responseAutenticacion;
		
	}
	private boolean validarListaRecursos(String path){
		boolean resultado = false;
		for(String Url:ConstantesOdonto.RecursosSinSeguridad){
			if(path.contains(Url)){
				resultado = true;
				return resultado;
			}
		}
		return resultado;
	}
}
