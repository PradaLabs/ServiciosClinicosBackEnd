package co.com.pradalabs.odontoclinicbackend.servicios.adapters;

import java.util.Map;

import co.com.pradalabs.odontoclinicbackend.persistencia.adapter.EjecutorActualizarAdapter;
import co.com.pradalabs.odontoclinicbackend.utils.BussinessException;

public class ServicioConsultarRelacionUsuarioClinicaAdapter extends EjecutorActualizarAdapter {

	@Override
	public Object prepararActualizarDatos() throws BussinessException {
		return null;
	}

	@Override
	public Object claveBuquedaParaActualizar(Map<String, Object> datoIngresados)throws BussinessException {
		return null;
	}

}
