package co.com.pradalabs.odontoclinicbackend.modelo.clinica;

import java.util.Date;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Contabilidad {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private int nmEgreso;
	
	@Persistent
    private String dsEgreso;

	@Persistent
    private double vlrEgreso;

	@Persistent
    private Date feEgreso;

	@Persistent
    private boolean snNotificado;

	@Persistent
    private int cdClinica;

    public Contabilidad () {
    }

    public int getCdClinica () {
        return cdClinica;
    }

    public void setCdClinica (int val) {
        this.cdClinica = val;
    }

    public String getDsEgreso () {
        return dsEgreso;
    }

    public void setDsEgreso (String val) {
        this.dsEgreso = val;
    }

    public Date getFeEgreso () {
        return feEgreso;
    }

    public void setFeEgreso (Date val) {
        this.feEgreso = val;
    }

    public int getNmEgreso () {
        return nmEgreso;
    }

    public void setNmEgreso (int val) {
        this.nmEgreso = val;
    }

    public boolean getSnNotificado () {
        return snNotificado;
    }

    public void setSnNotificado (boolean val) {
        this.snNotificado = val;
    }

    public double getVlrEgreso () {
        return vlrEgreso;
    }

    public void setVlrEgreso (double val) {
        this.vlrEgreso = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
}

