package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class RuidosArticulares {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent
    private Boolean snRuidosArticulares;

	@Persistent
    private Boolean snCliking;

	@Persistent
    private Boolean snCrepitacion;

	@Persistent
    private Boolean snDerecho;

	@Persistent
    private Boolean snIzquierdo;

	@Persistent
    private Boolean snBilateral;

    public RuidosArticulares () {
    }


    public Boolean getSnBilateral () {
        return snBilateral;
    }

    public void setSnBilateral (Boolean val) {
        this.snBilateral = val;
    }

    public Boolean getSnCliking () {
        return snCliking;
    }

    public void setSnCliking (Boolean val) {
        this.snCliking = val;
    }

    public Boolean getSnCrepitacion () {
        return snCrepitacion;
    }

    public void setSnCrepitacion (Boolean val) {
        this.snCrepitacion = val;
    }

    public Boolean getSnDerecho () {
        return snDerecho;
    }

    public void setSnDerecho (Boolean val) {
        this.snDerecho = val;
    }

    public Boolean getSnIzquierdo () {
        return snIzquierdo;
    }

    public void setSnIzquierdo (Boolean val) {
        this.snIzquierdo = val;
    }

    public Boolean getSnRuidosArticulares () {
        return snRuidosArticulares;
    }

    public void setSnRuidosArticulares (Boolean val) {
        this.snRuidosArticulares = val;
    }


	public Key getKey() {
		return key;
	}


	public void setKey(Key key) {
		this.key = key;
	}

}

