package co.com.pradalabs.odontoclinicbackend.servicios.adapters;

import java.util.Map;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

import co.com.pradalabs.odontoclinicbackend.modelo.Clinica;
import co.com.pradalabs.odontoclinicbackend.modelo.DatosBasicosClinica;
import co.com.pradalabs.odontoclinicbackend.modelo.Paciente;
import co.com.pradalabs.odontoclinicbackend.modelo.paciente.DatosBasicos;
import co.com.pradalabs.odontoclinicbackend.persistencia.adapter.EjecutorGuardarAdapter;
import co.com.pradalabs.odontoclinicbackend.utils.BussinessException;
import co.com.pradalabs.odontoclinicbackend.utils.ConstantesOdonto;



public class ServicioGuardarClinicaAdapter extends EjecutorGuardarAdapter{
	private Clinica clinica;
	
	public ServicioGuardarClinicaAdapter() {
		super();
	}


	public ServicioGuardarClinicaAdapter(String nombreClase, String clave) {
		super(nombreClase, clave);
	}


	@Override
	public Object prepararGuardarDatos(Map<String, Object> datoIngresados) throws BussinessException {
		clinica = (Clinica)datoIngresados.get(ConstantesOdonto.CLINICA);
		this.setClave((String)datoIngresados.get(ConstantesOdonto.CLAVE_CLINICA));
		this.setNombreClase(Clinica.class.getSimpleName());
		clinica.setKey(this.preparaSesionPersistencia());
		clinica.getDatosBasicoClinica().setKey(crearKeyObjetosRelacionados(clinica.getKey(),DatosBasicosClinica.class.getSimpleName(),(String)datoIngresados.get(ConstantesOdonto.CLAVE_CLINICA)));
		return clinica;
	}
	
	private Key crearKeyObjetosRelacionados(Key keyClinica,String nombreClase,String claveRelacional){
		return KeyFactory.createKey(keyClinica,nombreClase,claveRelacional);
	}

}
