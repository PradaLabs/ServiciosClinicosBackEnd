package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

public class AsimetriaFrente {

    private Boolean snDerecho;

    private Boolean snIzquierdo;

    private Boolean snTercioSuperior;

    private Boolean snTercioMedio;

    private Boolean snTercioInferior;

    private Boolean PlanoOclusal;

    public AsimetriaFrente () {
    }

    public Boolean getPlanoOclusal () {
        return PlanoOclusal;
    }

    public void setPlanoOclusal (Boolean val) {
        this.PlanoOclusal = val;
    }

    public Boolean getSnDerecho () {
        return snDerecho;
    }

    public void setSnDerecho (Boolean val) {
        this.snDerecho = val;
    }

    public Boolean getSnIzquierdo () {
        return snIzquierdo;
    }

    public void setSnIzquierdo (Boolean val) {
        this.snIzquierdo = val;
    }

    public Boolean getSnTercioInferior () {
        return snTercioInferior;
    }

    public void setSnTercioInferior (Boolean val) {
        this.snTercioInferior = val;
    }

    public Boolean getSnTercioMedio () {
        return snTercioMedio;
    }

    public void setSnTercioMedio (Boolean val) {
        this.snTercioMedio = val;
    }

    public Boolean getSnTercioSuperior () {
        return snTercioSuperior;
    }

    public void setSnTercioSuperior (Boolean val) {
        this.snTercioSuperior = val;
    }

}

