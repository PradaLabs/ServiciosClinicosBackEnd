package co.com.pradalabs.odontoclinicbackend.modelo.paciente;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class TratamientoAcordadoOrtho {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private TratamientoAcordado dsTratamientoAcordadoOrtho;

    public TratamientoAcordadoOrtho () {
    }

    public TratamientoAcordado getDsTratamientoAcordadoOrtho () {
        return dsTratamientoAcordadoOrtho;
    }

    public void setDsTratamientoAcordadoOrtho (TratamientoAcordado val) {
        this.dsTratamientoAcordadoOrtho = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
}

