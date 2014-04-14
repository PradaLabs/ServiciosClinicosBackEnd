package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;


@PersistenceCapable
public class PlanTratamientoIdeal {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private String dsperiodoncia;
	
	@Persistent
    private String dsoperatoria;

	@Persistent
    private String dsendodoncia;

	@Persistent
    private String dsrehabilitacion;

	@Persistent
    private String dscirugia;

	@Persistent
    private String dsortodoncia;

    public PlanTratamientoIdeal () {
    }

    public String getDscirugia () {
        return dscirugia;
    }

    public void setDscirugia (String val) {
        this.dscirugia = val;
    }

    public String getDsendodoncia () {
        return dsendodoncia;
    }

    public void setDsendodoncia (String val) {
        this.dsendodoncia = val;
    }

    public String getDsoperatoria () {
        return dsoperatoria;
    }

    public void setDsoperatoria (String val) {
        this.dsoperatoria = val;
    }

    public String getDsortodoncia () {
        return dsortodoncia;
    }

    public void setDsortodoncia (String val) {
        this.dsortodoncia = val;
    }

    public String getDsperiodoncia () {
        return dsperiodoncia;
    }

    public void setDsperiodoncia (String val) {
        this.dsperiodoncia = val;
    }

    public String getDsrehabilitacion () {
        return dsrehabilitacion;
    }

    public void setDsrehabilitacion (String val) {
        this.dsrehabilitacion = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
}

