package co.com.pradalabs.odontoclinicbackend.modelo.paciente;

import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

import co.com.pradalabs.odontoclinicbackend.modelo.Abono;

@PersistenceCapable
public class Cuenta {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent
    private int vlrTratamiento;

	@Persistent
    private String Observacion;

	@Persistent
    private List<Abono> dsabono;

	@Persistent
    private int nmTratamiento;

    public Cuenta () {
    }

    public String getObservacion () {
        return Observacion;
    }

    public void setObservacion (String val) {
        this.Observacion = val;
    }

    public int getVlrTratamiento () {
        return vlrTratamiento;
    }

    public void setVlrTratamiento (int val) {
        this.vlrTratamiento = val;
    }

    public int getNmDescuento () {
        return 0;
    }

    public void setNmDescuento (int val) {
    }

    public String getDsAutorizacion () {
        return null;
    }

    public void setDsAutorizacion (String val) {
    }

    public List<Abono> getDsabono () {
        return dsabono;
    }

    public void setDsabono (List<Abono> val) {
        this.dsabono = val;
    }

    public int getNmTratamiento () {
        return nmTratamiento;
    }

    public void setNmTratamiento (int val) {
        this.nmTratamiento = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
    
}

