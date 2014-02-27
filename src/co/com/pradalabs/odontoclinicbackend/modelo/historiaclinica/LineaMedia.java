package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class LineaMedia {
	
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

	@Persistent
    private int cdSuperior;

	@Persistent
    private int cdInferior;

    public LineaMedia () {
    }

    public int getCdInferior () {
        return cdInferior;
    }

    public void setCdInferior (int val) {
        this.cdInferior = val;
    }

    public int getCdSuperior () {
        return cdSuperior;
    }

    public void setCdSuperior (int val) {
        this.cdSuperior = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
}

