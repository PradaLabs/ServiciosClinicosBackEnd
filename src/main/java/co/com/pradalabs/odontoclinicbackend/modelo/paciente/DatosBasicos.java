package co.com.pradalabs.odontoclinicbackend.modelo.paciente;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class DatosBasicos {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private String dsPrimerNombre;
	
	@Persistent
	private String dsSegundoNombre;
	
	@Persistent
    private String dsPrimerApellido;
	
	@Persistent
    private String dsSegundoApellido;

	
	@Persistent
    private String dsTipoDocumento;

	@Persistent
    private String dsDireccion;

	@Persistent
    private String dsTelefono;

	@Persistent
    private String dsCelular;

	@Persistent
    private String Ciudad;

	@Persistent
    private String dsDepartamento;

	@Persistent
    private String dsCorreoElectronico;

	@Persistent
    private String DNI;

    public DatosBasicos () {
    }

    public String getCiudad () {
        return Ciudad;
    }

    public void setCiudad (String val) {
        this.Ciudad = val;
    }

    public String getDNI () {
        return DNI;
    }

    public void setDNI (String val) {
        this.DNI = val;
    }

    public String getDsCelular () {
        return dsCelular;
    }

    public void setDsCelular (String val) {
        this.dsCelular = val;
    }

    public String getDsCorreoElectronico () {
        return dsCorreoElectronico;
    }

    public void setDsCorreoElectronico (String val) {
        this.dsCorreoElectronico = val;
    }

    public String getDsDepartamento () {
        return dsDepartamento;
    }

    public void setDsDepartamento (String val) {
        this.dsDepartamento = val;
    }

    public String getDsDireccion () {
        return dsDireccion;
    }

    public void setDsDireccion (String val) {
        this.dsDireccion = val;
    }

  

    public String getDsTelefono () {
        return dsTelefono;
    }

    public void setDsTelefono (String val) {
        this.dsTelefono = val;
    }

    public String getDsTipoDocumento () {
        return dsTipoDocumento;
    }

    public void setDsTipoDocumento (String val) {
        this.dsTipoDocumento = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public String getDsPrimerNombre() {
		return dsPrimerNombre;
	}

	public void setDsPrimerNombre(String dsPrimerNombre) {
		this.dsPrimerNombre = dsPrimerNombre;
	}

	public String getDsSegundoNombre() {
		return dsSegundoNombre;
	}

	public void setDsSegundoNombre(String dsSegundoNombre) {
		this.dsSegundoNombre = dsSegundoNombre;
	}

	public String getDsPrimerApellido() {
		return dsPrimerApellido;
	}

	public void setDsPrimerApellido(String dsPrimerApellido) {
		this.dsPrimerApellido = dsPrimerApellido;
	}

	public String getDsSegundoApellido() {
		return dsSegundoApellido;
	}

	public void setDsSegundoApellido(String dsSegundoApellido) {
		this.dsSegundoApellido = dsSegundoApellido;
	}
    
}

