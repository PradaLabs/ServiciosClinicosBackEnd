package co.com.pradalabs.odontoclinicbackend.servicios;

import javax.jdo.PersistenceManager;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

import co.com.pradalabs.odontoclinicbackend.config.PMF;
import co.com.pradalabs.odontoclinicbackend.modelo.Clinica;
import co.com.pradalabs.odontoclinicbackend.utils.BussinessException;

public class ServicioGuardarClinica {

	

	public ServicioGuardarClinica() {
		
	}
	
	public boolean GuardarClinica(Clinica clinica) throws BussinessException{
		if(clinica != null && clinica.getDsClinica() != null)
		{
			
			PersistenceManager pm = PMF.get().getPersistenceManager();
			String clave = clinica.getDsClinica();
			Key key = KeyFactory.createKey(Clinica.class.getSimpleName(),clave);
			clinica.setKey(key);
			pm.makePersistent(clinica);
			return true;
		}
		return false;
	};
	
	
}
