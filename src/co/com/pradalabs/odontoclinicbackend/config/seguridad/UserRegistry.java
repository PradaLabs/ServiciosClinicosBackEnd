package co.com.pradalabs.odontoclinicbackend.config.seguridad;

public interface UserRegistry {
	  GaeUser findUser(String userId);
	  void registerUser(GaeUser newUser);
	  void removeUser(String userId);
	}