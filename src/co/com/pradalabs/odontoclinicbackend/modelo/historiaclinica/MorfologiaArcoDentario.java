package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;


public class MorfologiaArcoDentario {

    private int cdSuperior;

    private int cdInferior;

    public MorfologiaArcoDentario () {
    }

    public int getCdInferior () {
        return cdInferior;
    }

    public void setCdInferior (int val) {
        this.cdInferior = val;
    }

    public int getCdSuperior () {
        return cdSuperior;
    }

    public void setCdSuperior (int val) {
        this.cdSuperior = val;
    }

}

