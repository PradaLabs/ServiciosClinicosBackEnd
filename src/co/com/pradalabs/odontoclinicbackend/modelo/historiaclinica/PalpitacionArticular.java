package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class PalpitacionArticular {
	
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;
	
	@Persistent
    private Boolean snDolorArticular;

	@Persistent
    private int cdDolorArticular;

	@Persistent
    private int cdLocalReposo;

	@Persistent
    private int cdLocalApertura;

	@Persistent
    private int cdLocalMovimiento;

	@Persistent
    private int cdLocalLateralidad;

	@Persistent
    private Boolean snDolorMuscular;

	@Persistent
    private int cdMusculo;

    public PalpitacionArticular () {
    }

    public int getCdDolorArticular () {
        return cdDolorArticular;
    }

    public void setCdDolorArticular (int val) {
        this.cdDolorArticular = val;
    }

    public int getCdLocalApertura () {
        return cdLocalApertura;
    }

    public void setCdLocalApertura (int val) {
        this.cdLocalApertura = val;
    }

    public int getCdLocalLateralidad () {
        return cdLocalLateralidad;
    }

    public void setCdLocalLateralidad (int val) {
        this.cdLocalLateralidad = val;
    }

    public int getCdLocalMovimiento () {
        return cdLocalMovimiento;
    }

    public void setCdLocalMovimiento (int val) {
        this.cdLocalMovimiento = val;
    }

    public int getCdLocalReposo () {
        return cdLocalReposo;
    }

    public void setCdLocalReposo (int val) {
        this.cdLocalReposo = val;
    }

    public int getCdMusculo () {
        return cdMusculo;
    }

    public void setCdMusculo (int val) {
        this.cdMusculo = val;
    }

    public Boolean getSnDolorArticular () {
        return snDolorArticular;
    }

    public void setSnDolorArticular (Boolean val) {
        this.snDolorArticular = val;
    }

    public Boolean getSnDolorMuscular () {
        return snDolorMuscular;
    }

    public void setSnDolorMuscular (Boolean val) {
        this.snDolorMuscular = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
}

