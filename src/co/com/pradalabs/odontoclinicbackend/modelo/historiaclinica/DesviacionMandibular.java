package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;



public class DesviacionMandibular {

    private Boolean snDesviacionMandibular;

    private int cdApertura;

    private int cdCierre;

    public DesviacionMandibular () {
    }

    public int getCdApertura () {
        return cdApertura;
    }

    public void setCdApertura (int val) {
        this.cdApertura = val;
    }

    public int getCdCierre () {
        return cdCierre;
    }

    public void setCdCierre (int val) {
        this.cdCierre = val;
    }

    public Boolean getSnDesviacionMandibular () {
        return snDesviacionMandibular;
    }

    public void setSnDesviacionMandibular (Boolean val) {
        this.snDesviacionMandibular = val;
    }

}

