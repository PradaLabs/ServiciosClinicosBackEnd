package co.com.pradalabs.odontoclinicbackend.config.seguridad;

import co.com.pradalabs.odontoclinicbackend.modelo.seguridad.UsuariosClinica;

public interface UserRegistry {
	  UsuariosClinica findUser(String userId);
	  void registerUser(UsuariosClinica newUser);
	  void removeUser(String userId);
	}