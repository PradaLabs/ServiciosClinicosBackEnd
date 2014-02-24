package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;


public class PalpitacionArticular {

    private Boolean snDolorArticular;

    private int cdDolorArticular;

    private int cdLocalReposo;

    private int cdLocalApertura;

    private int cdLocalMovimiento;

    private int cdLocalLateralidad;

    private Boolean snDolorMuscular;

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

}

