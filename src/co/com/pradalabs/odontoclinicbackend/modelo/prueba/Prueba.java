package co.com.pradalabs.odontoclinicbackend.modelo.prueba;

import javax.jdo.annotations.Extension;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;



@PersistenceCapable
public class Prueba {

	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
    private Key key;
	
	@Persistent
    private Integer nombre1;

	@Persistent
    private String nombre2;

	public Prueba(Key key, Integer nombre1, String nombre2) {
		super();
		this.key = key;
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
	}

	
	
	
}
