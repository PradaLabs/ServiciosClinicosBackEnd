package co.com.pradalabs.odontoclinicbackend.config.seguridad;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationDetailsSource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
import org.springframework.web.filter.GenericFilterBean;

import co.com.pradalabs.odontoclinicbackend.modelo.seguridad.AppRole;
import co.com.pradalabs.odontoclinicbackend.utils.ConstantesOdonto;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserServiceFactory;

public class GaeAuthenticationFilter extends GenericFilterBean {
	private GaeAuthentication gaeAuthentication = new GaeAuthentication();
	private AuthenticationManager authenticationManager;
	private AuthenticationFailureHandler failureHandler = new SimpleUrlAuthenticationFailureHandler();

	  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		  System.out.println("entra la filtro de seguridad");
		  String pathIngresado=((HttpServletRequest) request).getRequestURI();
	    	System.out.println(pathIngresado);
	    	
	    	gaeAuthentication.setPathIngresado(pathIngresado);
	    	response=gaeAuthentication.AutenticarUsuario(request, response,authenticationManager,failureHandler);

	    chain.doFilter(request, response);
	  }

	  public void setAuthenticationManager(AuthenticationManager authenticationManager) {
	    this.authenticationManager = authenticationManager;
	  }

	  public void setFailureHandler(AuthenticationFailureHandler failureHandler) {
	    this.failureHandler = failureHandler;
	  }
	}
