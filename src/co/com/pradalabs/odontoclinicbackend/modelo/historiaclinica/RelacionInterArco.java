package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

public class RelacionInterArco {

    private MordidaCruzadaPosterior dsMordidaCruzadaPosterior;

    private Boolean snMordidaCruzadaAnterior;

    private Boolean snMordidaAbiertaAnterior;

    private MordidaAbiertaPosterior dsMordidaAbiertaPosterior;

    public RelacionInterArco () {
    }

    public MordidaAbiertaPosterior getDsMordidaAbiertaPosterior () {
        return dsMordidaAbiertaPosterior;
    }

    public void setDsMordidaAbiertaPosterior (MordidaAbiertaPosterior val) {
        this.dsMordidaAbiertaPosterior = val;
    }

    public MordidaCruzadaPosterior getDsMordidaCruzadaPosterior () {
        return dsMordidaCruzadaPosterior;
    }

    public void setDsMordidaCruzadaPosterior (MordidaCruzadaPosterior val) {
        this.dsMordidaCruzadaPosterior = val;
    }

    public Boolean getSnMordidaAbiertaAnterior () {
        return snMordidaAbiertaAnterior;
    }

    public void setSnMordidaAbiertaAnterior (Boolean val) {
        this.snMordidaAbiertaAnterior = val;
    }

    public Boolean getSnMordidaCruzadaAnterior () {
        return snMordidaCruzadaAnterior;
    }

    public void setSnMordidaCruzadaAnterior (Boolean val) {
        this.snMordidaCruzadaAnterior = val;
    }

}

