package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

public class ExamenFisico {

    private String dsExamenFisico;

    private String dsTbCarrillo;

    private String dsTbFrenillo;

    private String dsTbLengua;

    private String dsTbPaladar;

    private String dsTbEncia;

    private String dsMoColor;

    private String dsTbMoTextura;

    private String dsRecilencia;

    private String Saliva;

    public ExamenFisico () {
    }

    public String getSaliva () {
        return Saliva;
    }

    public void setSaliva (String val) {
        this.Saliva = val;
    }

    public String getDsExamenFisico () {
        return dsExamenFisico;
    }

    public void setDsExamenFisico (String val) {
        this.dsExamenFisico = val;
    }

    public String getDsMoColor () {
        return dsMoColor;
    }

    public void setDsMoColor (String val) {
        this.dsMoColor = val;
    }

    public String getDsRecilencia () {
        return dsRecilencia;
    }

    public void setDsRecilencia (String val) {
        this.dsRecilencia = val;
    }

    public String getDsTbCarrillo () {
        return dsTbCarrillo;
    }

    public void setDsTbCarrillo (String val) {
        this.dsTbCarrillo = val;
    }

    public String getDsTbEncia () {
        return dsTbEncia;
    }

    public void setDsTbEncia (String val) {
        this.dsTbEncia = val;
    }

    public String getDsTbFrenillo () {
        return dsTbFrenillo;
    }

    public void setDsTbFrenillo (String val) {
        this.dsTbFrenillo = val;
    }

    public String getDsTbLengua () {
        return dsTbLengua;
    }

    public void setDsTbLengua (String val) {
        this.dsTbLengua = val;
    }

    public String getDsTbMoTextura () {
        return dsTbMoTextura;
    }

    public void setDsTbMoTextura (String val) {
        this.dsTbMoTextura = val;
    }

    public String getDsTbPaladar () {
        return dsTbPaladar;
    }

    public void setDsTbPaladar (String val) {
        this.dsTbPaladar = val;
    }

}

