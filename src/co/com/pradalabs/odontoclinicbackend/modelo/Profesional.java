package co.com.pradalabs.odontoclinicbackend.modelo;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Profesional {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private int cdProfesional;
	
	@Persistent
    private String dsNombreProfesional;

	@Persistent
    private String dsApellidosProfesional;

	@Persistent
    private String Profesion;

	@Persistent
    private int nmTelefono;

	@Persistent
    private String dsEmail;

	@Persistent
    private int nmRegistro;

	@Persistent
    private String dsIdentificacion;

	@Persistent
    private int nmIdentificacion;

	
    public Profesional () {
    }

    public String getProfesion () {
        return Profesion;
    }

    public void setProfesion (String val) {
        this.Profesion = val;
    }

    public int getCdProfesional () {
        return cdProfesional;
    }

    public void setCdProfesional (int val) {
        this.cdProfesional = val;
    }

    public String getDsApellidosProfesional () {
        return dsApellidosProfesional;
    }

    public void setDsApellidosProfesional (String val) {
        this.dsApellidosProfesional = val;
    }

    public String getDsEmail () {
        return dsEmail;
    }

    public void setDsEmail (String val) {
        this.dsEmail = val;
    }

    public String getDsIdentificacion () {
        return dsIdentificacion;
    }

    public void setDsIdentificacion (String val) {
        this.dsIdentificacion = val;
    }

    public String getDsNombreProfesional () {
        return dsNombreProfesional;
    }

    public void setDsNombreProfesional (String val) {
        this.dsNombreProfesional = val;
    }

    public int getNmIdentificacion () {
        return nmIdentificacion;
    }

    public void setNmIdentificacion (int val) {
        this.nmIdentificacion = val;
    }

    public int getNmRegistro () {
        return nmRegistro;
    }

    public void setNmRegistro (int val) {
        this.nmRegistro = val;
    }

    public int getNmTelefono () {
        return nmTelefono;
    }

    public void setNmTelefono (int val) {
        this.nmTelefono = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
}

