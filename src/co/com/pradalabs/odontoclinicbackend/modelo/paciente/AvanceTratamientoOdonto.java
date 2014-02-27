package co.com.pradalabs.odontoclinicbackend.modelo.paciente;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;


@PersistenceCapable
public class AvanceTratamientoOdonto  {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private  AvanceTratamiento avanceTratamiento;
	
	
	public AvanceTratamiento getAvanceTratamiento() {
		return avanceTratamiento;
	}


	public void setAvanceTratamiento(AvanceTratamiento avanceTratamiento) {
		this.avanceTratamiento = avanceTratamiento;
	}


	public AvanceTratamientoOdonto() {
	}


	public Key getKey() {
		return key;
	}


	public void setKey(Key key) {
		this.key = key;
	}
	
	

}

