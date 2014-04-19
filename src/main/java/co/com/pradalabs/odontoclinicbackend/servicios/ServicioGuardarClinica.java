package co.com.pradalabs.odontoclinicbackend.servicios;

import java.util.HashMap;

import javax.jdo.PersistenceManager;

import co.com.pradalabs.odontoclinicbackend.modelo.Clinica;
import co.com.pradalabs.odontoclinicbackend.modelo.paciente.DatosBasicos;
import co.com.pradalabs.odontoclinicbackend.persistencia.PMF;
import co.com.pradalabs.odontoclinicbackend.persistencia.Interface.IGuardarPM;
import co.com.pradalabs.odontoclinicbackend.utils.BussinessException;
import co.com.pradalabs.odontoclinicbackend.utils.ConstantesOdonto;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class ServicioGuardarClinica {

	private IGuardarPM servicioGuardarClinicaAdapter;

	public ServicioGuardarClinica() {
		
	}
	
	public void setServicioGuardarClinicaAdapter(IGuardarPM servicioGuardarClinicaAdapter) {
		this.servicioGuardarClinicaAdapter = servicioGuardarClinicaAdapter;
	}

	public boolean GuardarClinica(Clinica clinica,String emailClinica) throws BussinessException{
		boolean resultado = false;
		HashMap<String, Object> datoIngresados = new HashMap<>();
		datoIngresados.put(ConstantesOdonto.CLINICA, clinica);
		datoIngresados.put(ConstantesOdonto.CLAVE_CLINICA, emailClinica);
		resultado=servicioGuardarClinicaAdapter.guardar(datoIngresados);
		return resultado;
	};
	
	
}
