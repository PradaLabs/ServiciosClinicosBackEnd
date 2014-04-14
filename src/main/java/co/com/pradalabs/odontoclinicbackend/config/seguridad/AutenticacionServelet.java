package co.com.pradalabs.odontoclinicbackend.config.seguridad;

import java.io.IOException;
import java.util.EnumSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.com.pradalabs.odontoclinicbackend.config.seguridad.utilidades.UtilidadesSeguridad;
import co.com.pradalabs.odontoclinicbackend.modelo.seguridad.AppRole;
import co.com.pradalabs.odontoclinicbackend.modelo.seguridad.UsuariosClinica;




public class AutenticacionServelet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UserRegistry userRegistry;
	private AppRole approle;
	@Override
	    public void doGet(HttpServletRequest req, HttpServletResponse resp)
	            throws IOException {
		
		//TODO Borrar esto una vez se cree el usuraio en Produccion. ya que es un hueco en la aplicacion.
		try{
			UtilidadesSeguridad utilidadesSeguridad = new UtilidadesSeguridad();
			String password = utilidadesSeguridad.convertirString2MDA5("PlsChgMe!");
			System.out.println("Se crea el usuario Administrador de la aplicacion Master en la BD");
			 UsuariosClinica usuarioClinica=new UsuariosClinica("andres.prada.labs@gmail.com",
																 "clinicaPrueba@gmail.com",
																 "Andres",
																 "Prada", 
																 "C94542961",
																 "aprada",
																 "Master",
																 password,
																 EnumSet.of(AppRole.ADMIN_APP),
																 true);
			 userRegistry = new GaeDatastoreUserRegistry();
			 userRegistry.registerUser(usuarioClinica);
			 System.out.println("Se crea el usuario Administrador de la clinica Master en la BD");
			  usuarioClinica=new UsuariosClinica("andres209@gmail.com",
					 "clinicaPrueba@gmail.com",
					 "guillermo",
					 "Reyes", 
					 "C94542961",
					 "gReyes",
					 "Admin",
					 password,
					 EnumSet.of(AppRole.ADMIN),
					 true);
			  userRegistry.registerUser(usuarioClinica);
				
		} catch(Exception e){
			e.printStackTrace();
			System.out.println("AutenticacionServelet.doGet()");
		}
	}
	
	public void setUserRegistry(UserRegistry userRegistry) {
		this.userRegistry = userRegistry;
	}
	
}
