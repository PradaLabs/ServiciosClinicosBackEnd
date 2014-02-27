package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class ExamenATM {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private RuidosArticulares dsRuidosArticualres;

	@Persistent
    private Localizacion dsLocalizacion;

	@Persistent
    private DesviacionMandibular dsDesviacionMandibular;

    public ExamenATM () {
    }

    public DesviacionMandibular getDsDesviacionMandibular () {
        return dsDesviacionMandibular;
    }

    public void setDsDesviacionMandibular (DesviacionMandibular val) {
        this.dsDesviacionMandibular = val;
    }

    public Localizacion getDsLocalizacion () {
        return dsLocalizacion;
    }

    public void setDsLocalizacion (Localizacion val) {
        this.dsLocalizacion = val;
    }

    public RuidosArticulares getDsRuidosArticualres () {
        return dsRuidosArticualres;
    }

    public void setDsRuidosArticualres (RuidosArticulares val) {
        this.dsRuidosArticualres = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

    
}

