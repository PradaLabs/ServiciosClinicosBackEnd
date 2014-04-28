package co.com.pradalabs.odontoclinicbackend.servicios.adapters;

import java.util.Map;

import co.com.pradalabs.odontoclinicbackend.modelo.clinica.Clinica;
import co.com.pradalabs.odontoclinicbackend.persistencia.adapter.EjecutorActualizarAdapter;
import co.com.pradalabs.odontoclinicbackend.utils.BussinessException;
import co.com.pradalabs.odontoclinicbackend.utils.ConstantesOdonto;


public class ServicioConsultarClinicaAdapter extends EjecutorActualizarAdapter{

	@Override
	public Object prepararActualizarDatos()throws BussinessException {
		Clinica clinica = new Clinica();
		return clinica;
	}

	@Override
	public Object claveBuquedaParaActualizar(Map<String, Object> datoIngresados) throws BussinessException {
		
		String idBusqueda=(String)datoIngresados.get(ConstantesOdonto.CLAVE_CLINICA);
		return idBusqueda;
	}

}
