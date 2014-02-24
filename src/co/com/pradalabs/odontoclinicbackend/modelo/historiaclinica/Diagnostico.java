package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

public class Diagnostico {

    private String cdDiagnosticoPresuntivo;

    private String dsDiagnosticoPresuntivo;

    private String cdDiagnosticoDefinitivo;

    private String dsDiagnosticoDefinitivo;

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

}

