package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

public class ExamenFrente {

    private String dsTipoCara;

    private int cdTipoCara;

    private Boolean snAsimetriaFrente;

    private String dsAsimetriaFrente;

    private String dsLeptoprosopo;

    private int cdLeptoprosopo;

    private String dsTipoSonrisa;

    private int cdTipoSonrisa;

    public ExamenFrente () {
    }

    public int getCdLeptoprosopo () {
        return cdLeptoprosopo;
    }

    public void setCdLeptoprosopo (int val) {
        this.cdLeptoprosopo = val;
    }

    public int getCdTipoCara () {
        return cdTipoCara;
    }

    public void setCdTipoCara (int val) {
        this.cdTipoCara = val;
    }

    public int getCdTipoSonrisa () {
        return cdTipoSonrisa;
    }

    public void setCdTipoSonrisa (int val) {
        this.cdTipoSonrisa = val;
    }

    public String getDsAsimetriaFrente () {
        return dsAsimetriaFrente;
    }

    public void setDsAsimetriaFrente (String val) {
        this.dsAsimetriaFrente = val;
    }

    public String getDsLeptoprosopo () {
        return dsLeptoprosopo;
    }

    public void setDsLeptoprosopo (String val) {
        this.dsLeptoprosopo = val;
    }

    public String getDsTipoCara () {
        return dsTipoCara;
    }

    public void setDsTipoCara (String val) {
        this.dsTipoCara = val;
    }

    public String getDsTipoSonrisa () {
        return dsTipoSonrisa;
    }

    public void setDsTipoSonrisa (String val) {
        this.dsTipoSonrisa = val;
    }

    public Boolean getSnAsimetriaFrente () {
        return snAsimetriaFrente;
    }

    public void setSnAsimetriaFrente (Boolean val) {
        this.snAsimetriaFrente = val;
    }

}

