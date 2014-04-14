package co.com.pradalabs.odontoclinicbackend.modelo;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Admin {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private int cdClinica;

	@Persistent
    private String dsNombre;

	@Persistent
    private String dsApellido;

	@Persistent
    private int dsTelefono;

	@Persistent
    private int dsCelular;

	@Persistent
    private String Email;

    public Admin () {
    }

    public String getEmail () {
        return Email;
    }

    public void setEmail (String val) {
        this.Email = val;
    }

    public int getCdClinica () {
        return cdClinica;
    }

    public void setCdClinica (int val) {
        this.cdClinica = val;
    }

    public String getDsApellido () {
        return dsApellido;
    }

    public void setDsApellido (String val) {
        this.dsApellido = val;
    }

    public int getDsCelular () {
        return dsCelular;
    }

    public void setDsCelular (int val) {
        this.dsCelular = val;
    }

    public String getDsNombre () {
        return dsNombre;
    }

    public void setDsNombre (String val) {
        this.dsNombre = val;
    }

    public int getDsTelefono () {
        return dsTelefono;
    }

    public void setDsTelefono (int val) {
        this.dsTelefono = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

}

