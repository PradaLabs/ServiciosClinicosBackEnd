package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;


@PersistenceCapable
public class EnfermedadGeneral {

	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private String ID_Enfermedad;

	@Persistent
    private String DsEnfermedad;

    public EnfermedadGeneral () {
    }

    public String getDsEnfermedad () {
        return DsEnfermedad;
    }

    public void setDsEnfermedad (String val) {
        this.DsEnfermedad = val;
    }

    public String getID_Enfermedad () {
        return ID_Enfermedad;
    }

    public void setID_Enfermedad (String val) {
        this.ID_Enfermedad = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
}

