package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Acompanante {

	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private String dsNombre;

	@Persistent
    private String dsApellido;

	@Persistent
    private String dsTelefono;

	@Persistent
    private String dsCelular;

	@Persistent
    private Boolean snResponsable;

	@Persistent
    private String dsParentesco;

	@Persistent
    private String DNI;

    public Acompanante () {
    }

    public String getDNI () {
        return DNI;
    }

    public void setDNI (String val) {
        this.DNI = val;
    }

    public String getDsApellido () {
        return dsApellido;
    }

    public void setDsApellido (String val) {
        this.dsApellido = val;
    }

    public String getDsCelular () {
        return dsCelular;
    }

    public void setDsCelular (String val) {
        this.dsCelular = val;
    }

    public String getDsNombre () {
        return dsNombre;
    }

    public void setDsNombre (String val) {
        this.dsNombre = val;
    }

    public String getDsParentesco () {
        return dsParentesco;
    }

    public void setDsParentesco (String val) {
        this.dsParentesco = val;
    }

    public String getDsTelefono () {
        return dsTelefono;
    }

    public void setDsTelefono (String val) {
        this.dsTelefono = val;
    }

    public Boolean getSnResponsable () {
        return snResponsable;
    }

    public void setSnResponsable (Boolean val) {
        this.snResponsable = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
}

