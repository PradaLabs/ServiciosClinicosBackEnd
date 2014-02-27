package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;


@PersistenceCapable
public class DesviacionMandibular {

	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;
	
	@Persistent
    private Boolean snDesviacionMandibular;

	@Persistent
    private int cdApertura;

	@Persistent
    private int cdCierre;

    public DesviacionMandibular () {
    }

    public int getCdApertura () {
        return cdApertura;
    }

    public void setCdApertura (int val) {
        this.cdApertura = val;
    }

    public int getCdCierre () {
        return cdCierre;
    }

    public void setCdCierre (int val) {
        this.cdCierre = val;
    }

    public Boolean getSnDesviacionMandibular () {
        return snDesviacionMandibular;
    }

    public void setSnDesviacionMandibular (Boolean val) {
        this.snDesviacionMandibular = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
    
}

