package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class EnfermedadPaciente {

	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private String DNI;

	@Persistent
    private EnfermedadGeneral enfermedadGeneral;

	@Persistent
    private String dsObservacion;

    public EnfermedadPaciente () {
    }

    public String getDNI () {
        return DNI;
    }

    public void setDNI (String val) {
        this.DNI = val;
    }

    public String getDsObservacion () {
        return dsObservacion;
    }

    public void setDsObservacion (String val) {
        this.dsObservacion = val;
    }

    public EnfermedadGeneral getEnfermedadGeneral () {
        return enfermedadGeneral;
    }

    public void setEnfermedadGeneral (EnfermedadGeneral val) {
        this.enfermedadGeneral = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
}

