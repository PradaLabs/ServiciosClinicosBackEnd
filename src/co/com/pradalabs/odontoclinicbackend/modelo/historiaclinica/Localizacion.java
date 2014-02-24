package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;


public class Localizacion {

    private Boolean Inicial;

    private Boolean Intermedio;

    private Boolean snIFinal;

    private int nnAperturaMaxima;

    private int nmLateralDerecha;

    private int nmLateralizquierda;

    public Localizacion () {
    }

    public Boolean getInicial () {
        return Inicial;
    }

    public void setInicial (Boolean val) {
        this.Inicial = val;
    }

    public Boolean getIntermedio () {
        return Intermedio;
    }

    public void setIntermedio (Boolean val) {
        this.Intermedio = val;
    }

    public int getNmLateralDerecha () {
        return nmLateralDerecha;
    }

    public void setNmLateralDerecha (int val) {
        this.nmLateralDerecha = val;
    }

    public int getNmLateralizquierda () {
        return nmLateralizquierda;
    }

    public void setNmLateralizquierda (int val) {
        this.nmLateralizquierda = val;
    }

    public int getNnAperturaMaxima () {
        return nnAperturaMaxima;
    }

    public void setNnAperturaMaxima (int val) {
        this.nnAperturaMaxima = val;
    }

    public Boolean getSnIFinal () {
        return snIFinal;
    }

    public void setSnIFinal (Boolean val) {
        this.snIFinal = val;
    }

}

