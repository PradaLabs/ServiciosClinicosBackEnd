package co.com.pradalabs.odontoclinicbackend.servicios;

import java.util.HashMap;

import co.com.pradalabs.odontoclinicbackend.modelo.clinica.Clinica;
import co.com.pradalabs.odontoclinicbackend.persistencia.Interface.IActulizarPM;
import co.com.pradalabs.odontoclinicbackend.utils.BussinessException;
import co.com.pradalabs.odontoclinicbackend.utils.ConstantesOdonto;

public class ServicioConsultarClinica {
	private IActulizarPM servicioConsultarCLinicaAdapter;

	public void setServicioConsultarAdapter(IActulizarPM servicioConsultarClinicaAdapter) {
		this.servicioConsultarCLinicaAdapter = servicioConsultarClinicaAdapter;
	}
	/*
	 * Para actualizar solo es necesario cambiar algun campo y luego cerrar la conexion.
	 * */
	public Clinica ConsultarClinica(String idClinica) throws BussinessException{
		Clinica clinica = new Clinica();
		HashMap<String, Object> datoIngresados = new HashMap<>();
		datoIngresados.put(ConstantesOdonto.CLAVE_CLINICA, idClinica);
		clinica=(Clinica)servicioConsultarCLinicaAdapter.consultarObjeto(datoIngresados);
		servicioConsultarCLinicaAdapter.cerrarConexion();
		return clinica;
	}
}
