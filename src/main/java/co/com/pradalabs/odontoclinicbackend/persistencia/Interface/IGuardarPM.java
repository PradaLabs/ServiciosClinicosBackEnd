package co.com.pradalabs.odontoclinicbackend.persistencia.Interface;

import java.util.Map;

import com.google.appengine.api.datastore.Key;
import co.com.pradalabs.odontoclinicbackend.utils.BussinessException;

public interface IGuardarPM 
{
	public Boolean guardar(Map<String,Object> datoIngresados) throws BussinessException;
	public Key preparaSesionPersistencia() throws BussinessException;

}
