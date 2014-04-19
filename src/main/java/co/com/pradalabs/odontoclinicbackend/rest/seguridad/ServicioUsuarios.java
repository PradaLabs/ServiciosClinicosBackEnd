package co.com.pradalabs.odontoclinicbackend.rest.seguridad;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.com.pradalabs.odontoclinicbackend.config.seguridad.GaeDatastoreUserRegistry;
import co.com.pradalabs.odontoclinicbackend.config.seguridad.UserRegistry;
import co.com.pradalabs.odontoclinicbackend.config.seguridad.utilidades.UtilidadesSeguridad;
import co.com.pradalabs.odontoclinicbackend.modelo.seguridad.UsuariosClinica;




@Path("/Usuario")
public class ServicioUsuarios {
	private UserRegistry userRegistry;
	
	
	@POST
	@Path("/insertarUsuario")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean  insertarUsuario(UsuariosClinica usuarioClinica){
		boolean resultado= false;
		try{
			UtilidadesSeguridad utilidadesSeguridad = new UtilidadesSeguridad();
			//String password = utilidadesSeguridad.convertirString2MDA5("PlsChgMe!");
			userRegistry = new GaeDatastoreUserRegistry();
			userRegistry.registerUser(usuarioClinica);
		}catch(Exception e){
			resultado =false;
		}
		return resultado;
		
	}
	
	
}
