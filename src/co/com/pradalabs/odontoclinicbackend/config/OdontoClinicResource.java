package co.com.pradalabs.odontoclinicbackend.config;





import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import co.com.pradalabs.odontoclinicbackend.modelo.Admin;
import co.com.pradalabs.odontoclinicbackend.modelo.Clinica;
import co.com.pradalabs.odontoclinicbackend.modelo.Contabilidad;
import co.com.pradalabs.odontoclinicbackend.modelo.Horario;
import co.com.pradalabs.odontoclinicbackend.modelo.Paciente;
import co.com.pradalabs.odontoclinicbackend.modelo.Precios;
import co.com.pradalabs.odontoclinicbackend.modelo.Profesional;
import co.com.pradalabs.odontoclinicbackend.modelo.prueba.Prueba;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;


@Path("/OdontoClinic")
public class OdontoClinicResource {

	@GET
	  @Path("/{name}")
	  public Response getMessage(@PathParam("name") String name)
	  {
		try
		{
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Key key = KeyFactory.createKey(Clinica.class.getSimpleName(), "orthodental_belen@gmail.com");
		Clinica clinica = new Clinica();
		clinica.setId(key);
		clinica.setCdClinica(1);
		clinica.setDsClinica("Ortho Dental");
		
		Contabilidad contabilidad = new Contabilidad();
		contabilidad.setCdClinica(1);
		contabilidad.setDsEgreso("asdad");
		List<Contabilidad> listaContabilidad = new  Collections(contabilidad).ge; 
		listaContabilidad.add(contabilidad);
		clinica.setDsContabilidad(listaContabilidad );
		clinica.setDsHorario(new Horario());
		//clinica.setDsProfesionales(new ArrayList<Profesional>());
		//clinica.setPacientes(new ArrayList<Paciente>());
		//clinica.setDsAdmin(new ArrayList<Admin>());
		//clinica.setListaPrecios(new ArrayList<Precios>());
		
		pm.makePersistent(clinica);
	    String outMsg = "Se guardo con exito la clinica  " + name +"!";
	    return Response.status(200).entity(outMsg).build();
		}catch(Exception e){
			e.printStackTrace();
			String outMsg = "No se logro guardar la clinica viejo  " + name + "!";
			 return Response.status(200).entity(outMsg).build();
		}
	  }
}
