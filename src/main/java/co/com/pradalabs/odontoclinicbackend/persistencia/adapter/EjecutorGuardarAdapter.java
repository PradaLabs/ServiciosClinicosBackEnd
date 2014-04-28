package co.com.pradalabs.odontoclinicbackend.persistencia.adapter;

import java.util.Map;

import javax.jdo.PersistenceManager;

import co.com.pradalabs.odontoclinicbackend.persistencia.PMF;
import co.com.pradalabs.odontoclinicbackend.persistencia.Interface.IGuardarPM;
import co.com.pradalabs.odontoclinicbackend.utils.BussinessException;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public abstract class EjecutorGuardarAdapter  implements IGuardarPM{
	private String nombreClase;
	private String clave;

	
	public EjecutorGuardarAdapter() {
		super();
	}

	public void setNombreClase(String nombreClase) {
		this.nombreClase = nombreClase;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}



	public EjecutorGuardarAdapter(String nombreClase, String clave) {
		super();
		this.nombreClase = nombreClase;
		this.clave = clave;
	}


	@Override
	public Boolean guardar(Map<String, Object> datoIngresados)	throws BussinessException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Boolean resultado= false;
		try{
			pm.makePersistent(prepararGuardarDatos(datoIngresados));
		}catch(Exception e){
			e.printStackTrace();
			BussinessException bussinessException=new BussinessException("problema al guardar el objeto en la BD");
			throw bussinessException;
		}finally{
		pm.close();
		resultado=true;
		}
		return 	resultado;
	}

	@Override
	public Key preparaSesionPersistencia() throws BussinessException {
		return KeyFactory.createKey(nombreClase,clave);
	}
	
	public abstract Object prepararGuardarDatos(Map<String, Object> datoIngresados) throws BussinessException;
	public abstract Key crearKeyObjetosRelacionados(Key keyObjeto,String nombreClase,String claveRelacional);
	
}
