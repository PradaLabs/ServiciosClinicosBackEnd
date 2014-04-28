package co.com.pradalabs.odontoclinicbackend.rest.serviciosClinica;

import javax.jdo.PersistenceManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.com.pradalabs.odontoclinicbackend.modelo.clinica.Clinica;
import co.com.pradalabs.odontoclinicbackend.persistencia.PMF;


@Path("/Servicios")
public class ServicioIngresarClinica {

	@POST
	@Path("/ServicioCrearClinica")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public boolean AutenticacionGoogle(Clinica clinica)  {
		boolean respuesta=false;
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try{
			
		}catch(Exception e){
			respuesta=false;
		}
        return respuesta;
    }
}
