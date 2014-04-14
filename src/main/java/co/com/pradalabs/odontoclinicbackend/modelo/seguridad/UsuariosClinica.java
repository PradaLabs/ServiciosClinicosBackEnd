package co.com.pradalabs.odontoclinicbackend.modelo.seguridad;

import java.io.Serializable;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;



public class UsuariosClinica implements Serializable {
	
	private static final long serialVersionUID = -5119466570220708726L;
	
	
   private final String userId;
   private final String emailClinica;
   private final String nombre;
   private final String apellido;
   private final String dni;
   private final String grupo;
   private final String nickName;
   private final String password;
   private final Set<AppRole> authorities;
   private final boolean enabled;
   

   /**
     * Pre-registration constructor.
     *
    */

   public UsuariosClinica(String userId, String emailClinica,String nickName) {
	super();
	this.userId = userId;
	this.emailClinica = emailClinica;
	this.nickName = nickName;
	this.nombre = null;
	this.apellido = null;
	this.dni = null;
	this.grupo = null;
	this.password = null;
	this.authorities = EnumSet.of(AppRole.NEW_USER);
	this.enabled = true;
	}


   /**
     *  constructor cuando se registra un Usuario
    */
   public UsuariosClinica(String userId, String emailClinica, String nombre,
		String apellido, String dni,String nickName, String grupo,String password,
		Set<AppRole> authorities, boolean enabled) {
	super();
	this.userId = userId;
	this.emailClinica = emailClinica;
	this.nombre = nombre;
	this.apellido = apellido;
	this.dni = dni;
	this.nickName=nickName;
	this.grupo = grupo;
	this.password = password;
	this.authorities = authorities;
	this.enabled = enabled;
	}
   
	public String getUserId() {
	       return userId;
	}
	
	public boolean isEnabled() {
       return enabled;
	}

   	public Collection<AppRole> getAuthorities() {
       return authorities;
   	}
	
   	public String getEmailClinica() {
		return emailClinica;
   	}


	public String getNombre() {
		return nombre;
	}
		
	public String getApellido() {
		return apellido;
	}

	public String getDni() {
		return dni;
	}

	public String getGrupo() {
		return grupo;
	}


	public String getNickName() {
		return nickName;
	}

	public String getPassword() {
		return password;
	}
	
}