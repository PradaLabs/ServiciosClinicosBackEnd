package co.com.pradalabs.odontoclinicbackend.servicios.adapters;

import java.util.Map;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

import co.com.pradalabs.odontoclinicbackend.modelo.administracion.RelacionUsuarioClinica;
import co.com.pradalabs.odontoclinicbackend.modelo.seguridad.UsuariosClinica;
import co.com.pradalabs.odontoclinicbackend.persistencia.adapter.EjecutorGuardarAdapter;
import co.com.pradalabs.odontoclinicbackend.utils.BussinessException;
import co.com.pradalabs.odontoclinicbackend.utils.ConstantesOdonto;

public class ServicioGuardarRelacionUsuarioClinicaAdapter extends EjecutorGuardarAdapter {
	private RelacionUsuarioClinica relacionUsuarioClinica;
	private UsuariosClinica usuariosClinica= new UsuariosClinica();
	@Override
	public Object prepararGuardarDatos(Map<String, Object> datoIngresados)	throws BussinessException {
		relacionUsuarioClinica =(RelacionUsuarioClinica) datoIngresados.get(ConstantesOdonto.RELACION_USUARIO_CLINICA);
		Key keyUser=KeyFactory.createKey(usuariosClinica.getClass().getSimpleName(), usuariosClinica.getUserId());
		relacionUsuarioClinica.setKey(crearKeyObjetosRelacionados(keyUser, relacionUsuarioClinica.getClass().getSimpleName(), (String) datoIngresados.get(ConstantesOdonto.CLAVE_RELACION_USUARIO_CLINICA)));
		return relacionUsuarioClinica;
	}
	
	public Key crearKeyObjetosRelacionados(Key keyObjeto, String nombreClase,String claveRelacional) {
		 return KeyFactory.createKey(keyObjeto,nombreClase,claveRelacional);
	}

}
