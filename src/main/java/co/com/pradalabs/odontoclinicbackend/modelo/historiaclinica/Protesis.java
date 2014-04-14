package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Protesis {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private int cdCodigo;
	
	@Persistent
    private String dsDescripcion;
	
	@Persistent
    private List<Diente> dsDienteProtesis;
	
	@Persistent
    private boolean snProtesis;

    public Protesis () {
    }

    public int getCdCodigo () {
        return cdCodigo;
    }

    public void setCdCodigo (int val) {
        this.cdCodigo = val;
    }

    public String getDsDescripcion () {
        return dsDescripcion;
    }

    public void setDsDescripcion (String val) {
        this.dsDescripcion = val;
    }

    public List<Diente> getDsDienteProtesis () {
        return dsDienteProtesis;
    }

    public void setDsDienteProtesis (List<Diente> val) {
        this.dsDienteProtesis = val;
    }

    public boolean getSnProtesis () {
        return snProtesis;
    }

    public void setSnProtesis (boolean val) {
        this.snProtesis = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
}

