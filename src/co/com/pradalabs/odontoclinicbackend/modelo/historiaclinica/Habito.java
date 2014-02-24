package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

public class Habito {

    private Boolean snOnicofagia;

    private Boolean snRespiracionOral;

    private Boolean snSuccionDigital;

    private Boolean snSuccionLabial;

    private Boolean snIrterposicionLingual;

    private Boolean snAlteracionFoniatricas;

    private Boolean snEmpujeLingualS;

    private Boolean _EmpujeLigualC;

    private Boolean snDeglucionInfantil;

    private String dsBruxismo;

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

}

