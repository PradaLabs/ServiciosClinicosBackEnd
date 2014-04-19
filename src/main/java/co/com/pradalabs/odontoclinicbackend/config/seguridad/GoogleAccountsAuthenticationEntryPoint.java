package co.com.pradalabs.odontoclinicbackend.config.seguridad;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import co.com.pradalabs.odontoclinicbackend.utils.ConstantesOdonto;


/*
 * El aplicativo entra a esta clase cuando se hace un request y no existe un loggeo  el redirecciona a la pagina del login.
 * */
public class GoogleAccountsAuthenticationEntryPoint implements AuthenticationEntryPoint {
	  public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException)
	      throws IOException, ServletException {
	    response.sendRedirect(request.getContextPath()+ ConstantesOdonto.PATH_LOGIN);
	  }
}


