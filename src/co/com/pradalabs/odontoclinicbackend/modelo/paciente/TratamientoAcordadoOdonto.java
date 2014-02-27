package co.com.pradalabs.odontoclinicbackend.modelo.paciente;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;


@PersistenceCapable
public class TratamientoAcordadoOdonto {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent
    private TratamientoAcordado dsTratamientoAcordadoOdonto;

    public TratamientoAcordadoOdonto () {
    }

    public TratamientoAcordado getDsTratamientoAcordadoOdonto () {
        return dsTratamientoAcordadoOdonto;
    }

    public void setDsTratamientoAcordadoOdonto (TratamientoAcordado val) {
        this.dsTratamientoAcordadoOdonto = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
}

