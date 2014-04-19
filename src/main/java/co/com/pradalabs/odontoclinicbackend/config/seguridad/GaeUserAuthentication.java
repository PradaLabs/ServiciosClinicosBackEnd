package co.com.pradalabs.odontoclinicbackend.config.seguridad;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import co.com.pradalabs.odontoclinicbackend.modelo.seguridad.UsuariosClinica;

import java.util.Collection;
import java.util.HashSet;

/**
 * Authentication object representing a fully-authenticated user.
 *
 * @author Luke Taylor
 * @modifique Andres.prada
 */
public class GaeUserAuthentication implements Authentication {

	private static final long serialVersionUID = 1L;
	
	private final UsuariosClinica principal;
    private final Object details;
    private boolean authenticated;

    public GaeUserAuthentication(UsuariosClinica principal, Object details) {
        this.principal = principal;
        this.details = details;
        authenticated = true;
    }

    public Collection<GrantedAuthority> getAuthorities() {
        return new HashSet<GrantedAuthority>(principal.getAuthorities());
    }

    public Object getCredentials() {
        throw new UnsupportedOperationException();
    }

    public Object getDetails() {
        return null;
    }

    public Object getPrincipal() {
        return principal;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean isAuthenticated) {
        authenticated = isAuthenticated;
    }

    public String getName() {
        return principal.getUserId();
    }

    @Override
    public String toString() {
        return "GaeUserAuthentication{" +
                "principal=" + principal +
                ", details=" + details +
                ", authenticated=" + authenticated +
                '}';
    }
}
