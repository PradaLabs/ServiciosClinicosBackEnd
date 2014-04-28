package co.com.pradalabs.odontoclinicbackend.rest.serviciosClinica;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.com.pradalabs.odontoclinicbackend.modelo.clinica.Clinica;
import co.com.pradalabs.odontoclinicbackend.servicios.ServicioConsultarClinica;
import co.com.pradalabs.odontoclinicbackend.servicios.ServicioGuardarClinica;
import co.com.pradalabs.odontoclinicbackend.servicios.adapters.ServicioConsultarClinicaAdapter;
import co.com.pradalabs.odontoclinicbackend.servicios.adapters.ServicioGuardarClinicaAdapter;
import co.com.pradalabs.odontoclinicbackend.utils.BussinessException;


@Path("/Clinica")
public class ServicioRestClinica {
ServicioGuardarClinica servicioGuardarClinica;
ServicioGuardarClinicaAdapter servicioGuardarClinicaAdapter;
ServicioConsultarClinica servicioConsultarClinica;
ServicioConsultarClinicaAdapter servicioConsultarClinicaAdapter;
	@POST
	@Path("/insertarClinica")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean guardarClinica(Clinica clinica){
		boolean respuesta=false;
		servicioGuardarClinica = new ServicioGuardarClinica();
		
		try {
			if(clinica.getDatosBasicoClinica() != null &&  clinica.getDatosBasicoClinica().getEmail() != null ){
				servicioGuardarClinicaAdapter = new ServicioGuardarClinicaAdapter();
				servicioGuardarClinica.setServicioGuardarClinicaAdapter(servicioGuardarClinicaAdapter);
				respuesta=servicioGuardarClinica.GuardarClinica(clinica, clinica.getDatosBasicoClinica().getEmail());
			}
		} catch (BussinessException e) {
			respuesta = false;
			e.printStackTrace();
		}
		return respuesta;
	}
	
	
	@POST
	@Path("/consultarClinica")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Clinica ConsultarClinica(String clinicaConsultar){
		Clinica clinica=null;
		servicioConsultarClinica = new ServicioConsultarClinica();
		try {
			servicioConsultarClinicaAdapter = new ServicioConsultarClinicaAdapter();
			servicioConsultarClinica.setServicioConsultarAdapter(servicioConsultarClinicaAdapter);
			clinica = servicioConsultarClinica.ConsultarClinica(clinicaConsultar);
		}catch(BussinessException e){
			e.printStackTrace();
		}
		return clinica;
	}
}
