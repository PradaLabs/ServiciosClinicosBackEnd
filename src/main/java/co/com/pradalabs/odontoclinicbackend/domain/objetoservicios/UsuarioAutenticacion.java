package co.com.pradalabs.odontoclinicbackend.domain.objetoservicios;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
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
