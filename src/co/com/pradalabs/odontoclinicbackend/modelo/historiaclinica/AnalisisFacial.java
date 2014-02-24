package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

public class AnalisisFacial {

    private ExamenFrente dsExamenFrente;

    private AsimetriaFrente dsAsimetriaFrente;

    private ExamenPerfil dsExamenPerfil;

    public AnalisisFacial () {
    }

    public AsimetriaFrente getDsAsimetriaFrente () {
        return dsAsimetriaFrente;
    }

    public void setDsAsimetriaFrente (AsimetriaFrente val) {
        this.dsAsimetriaFrente = val;
    }

    public ExamenFrente getDsExamenFrente () {
        return dsExamenFrente;
    }

    public void setDsExamenFrente (ExamenFrente val) {
        this.dsExamenFrente = val;
    }

    public ExamenPerfil getDsExamenPerfil () {
        return dsExamenPerfil;
    }

    public void setDsExamenPerfil (ExamenPerfil val) {
        this.dsExamenPerfil = val;
    }

}

