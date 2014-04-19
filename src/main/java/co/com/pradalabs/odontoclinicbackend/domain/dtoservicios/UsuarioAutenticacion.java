package co.com.pradalabs.odontoclinicbackend.domain.dtoservicios;

import org.codehaus.jackson.annotate.JsonPropertyOrder;




@JsonPropertyOrder(alphabetic=true)
public class UsuarioAutenticacion {
	
private String login;
private String password;



	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

}
