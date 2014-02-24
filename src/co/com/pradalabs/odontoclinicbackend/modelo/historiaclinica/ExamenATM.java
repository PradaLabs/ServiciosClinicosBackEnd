package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

public class ExamenATM {

    private RuidosArticulares dsRuidosArticualres;

    private Localizacion dsLocalizacion;

    private DesviacionMandibular dsDesviacionMandibular;

    public ExamenATM () {
    }

    public DesviacionMandibular getDsDesviacionMandibular () {
        return dsDesviacionMandibular;
    }

    public void setDsDesviacionMandibular (DesviacionMandibular val) {
        this.dsDesviacionMandibular = val;
    }

    public Localizacion getDsLocalizacion () {
        return dsLocalizacion;
    }

    public void setDsLocalizacion (Localizacion val) {
        this.dsLocalizacion = val;
    }

    public RuidosArticulares getDsRuidosArticualres () {
        return dsRuidosArticualres;
    }

    public void setDsRuidosArticualres (RuidosArticulares val) {
        this.dsRuidosArticualres = val;
    }

}

