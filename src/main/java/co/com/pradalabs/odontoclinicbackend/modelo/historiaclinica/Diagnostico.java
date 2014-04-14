package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Diagnostico {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private String cdDiagnosticoPresuntivo;

	@Persistent
    private String dsDiagnosticoPresuntivo;

	@Persistent
    private String cdDiagnosticoDefinitivo;

	@Persistent
    private String dsDiagnosticoDefinitivo;

	@Persistent
    private String dsObservacionGeneral;

    public Diagnostico () {
    }

    public String getCdDiagnosticoDefinitivo () {
        return cdDiagnosticoDefinitivo;
    }

    public void setCdDiagnosticoDefinitivo (String val) {
        this.cdDiagnosticoDefinitivo = val;
    }

    public String getCdDiagnosticoPresuntivo () {
        return cdDiagnosticoPresuntivo;
    }

    public void setCdDiagnosticoPresuntivo (String val) {
        this.cdDiagnosticoPresuntivo = val;
    }

    public String getDsDiagnosticoDefinitivo () {
        return dsDiagnosticoDefinitivo;
    }

    public void setDsDiagnosticoDefinitivo (String val) {
        this.dsDiagnosticoDefinitivo = val;
    }

    public String getDsDiagnosticoPresuntivo () {
        return dsDiagnosticoPresuntivo;
    }

    public void setDsDiagnosticoPresuntivo (String val) {
        this.dsDiagnosticoPresuntivo = val;
    }

    public String getDsObservacionGeneral () {
        return dsObservacionGeneral;
    }

    public void setDsObservacionGeneral (String val) {
        this.dsObservacionGeneral = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
}

