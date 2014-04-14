package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Habito {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private Boolean snOnicofagia;

	@Persistent
    private Boolean snRespiracionOral;

	@Persistent
    private Boolean snSuccionDigital;

	@Persistent
    private Boolean snSuccionLabial;

	@Persistent
    private Boolean snIrterposicionLingual;

	@Persistent
    private Boolean snAlteracionFoniatricas;

	@Persistent
    private Boolean snEmpujeLingualS;

	@Persistent
    private Boolean _EmpujeLigualC;

	@Persistent
    private Boolean snDeglucionInfantil;

	@Persistent
    private String dsBruxismo;

	@Persistent
    private int cdBruxismo;

    public Habito () {
    }

    public Boolean get_EmpujeLigualC () {
        return _EmpujeLigualC;
    }

    public void set_EmpujeLigualC (Boolean val) {
        this._EmpujeLigualC = val;
    }

    public int getCdBruxismo () {
        return cdBruxismo;
    }

    public void setCdBruxismo (int val) {
        this.cdBruxismo = val;
    }

    public String getDsBruxismo () {
        return dsBruxismo;
    }

    public void setDsBruxismo (String val) {
        this.dsBruxismo = val;
    }

    public Boolean getSnAlteracionFoniatricas () {
        return snAlteracionFoniatricas;
    }

    public void setSnAlteracionFoniatricas (Boolean val) {
        this.snAlteracionFoniatricas = val;
    }

    public Boolean getSnDeglucionInfantil () {
        return snDeglucionInfantil;
    }

    public void setSnDeglucionInfantil (Boolean val) {
        this.snDeglucionInfantil = val;
    }

    public Boolean getSnEmpujeLingualS () {
        return snEmpujeLingualS;
    }

    public void setSnEmpujeLingualS (Boolean val) {
        this.snEmpujeLingualS = val;
    }

    public Boolean getSnIrterposicionLingual () {
        return snIrterposicionLingual;
    }

    public void setSnIrterposicionLingual (Boolean val) {
        this.snIrterposicionLingual = val;
    }

    public Boolean getSnOnicofagia () {
        return snOnicofagia;
    }

    public void setSnOnicofagia (Boolean val) {
        this.snOnicofagia = val;
    }

    public Boolean getSnRespiracionOral () {
        return snRespiracionOral;
    }

    public void setSnRespiracionOral (Boolean val) {
        this.snRespiracionOral = val;
    }

    public Boolean getSnSuccionDigital () {
        return snSuccionDigital;
    }

    public void setSnSuccionDigital (Boolean val) {
        this.snSuccionDigital = val;
    }

    public Boolean getSnSuccionLabial () {
        return snSuccionLabial;
    }

    public void setSnSuccionLabial (Boolean val) {
        this.snSuccionLabial = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
}

