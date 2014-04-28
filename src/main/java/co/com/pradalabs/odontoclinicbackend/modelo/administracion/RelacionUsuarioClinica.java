package co.com.pradalabs.odontoclinicbackend.modelo.administracion;

import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;



@PersistenceCapable
public class RelacionUsuarioClinica {

	/*este key esta representado por el Usuario*/
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private List<String> idClinica;

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public List<String> getIdClinica() {
		return idClinica;
	}

	public void setIdClinica(List<String> idClinica) {
		this.idClinica = idClinica;
	}
}
