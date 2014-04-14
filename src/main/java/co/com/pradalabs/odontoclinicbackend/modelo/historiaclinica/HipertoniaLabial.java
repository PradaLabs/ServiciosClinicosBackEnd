package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class HipertoniaLabial {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	
	@Persistent
    private Boolean snHipertoniaLabial;

	@Persistent
    private Boolean snSuperior;

	@Persistent
    private Boolean snInferior;

    public HipertoniaLabial () {
    }

    public Boolean getSnHipertoniaLabial () {
        return snHipertoniaLabial;
    }

    public void setSnHipertoniaLabial (Boolean val) {
        this.snHipertoniaLabial = val;
    }

    public Boolean getSnInferior () {
        return snInferior;
    }

    public void setSnInferior (Boolean val) {
        this.snInferior = val;
    }

    public Boolean getSnSuperior () {
        return snSuperior;
    }

    public void setSnSuperior (Boolean val) {
        this.snSuperior = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
}

