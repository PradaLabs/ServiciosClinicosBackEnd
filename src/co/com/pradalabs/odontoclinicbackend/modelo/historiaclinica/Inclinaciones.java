package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import java.util.List;



public class Inclinaciones {

    private List<Integer> dsSuperiorDerecho;

    private List<Integer> dsInferiorDerecho;

    private List<Integer> dsInferiorIzquierdo;

    private List<Integer> dsSuperiorIzquierdo;

    public Inclinaciones () {
    }

    public List<Integer> getDsInferiorDerecho () {
        return dsInferiorDerecho;
    }

    public void setDsInferiorDerecho (List<Integer> val) {
        this.dsInferiorDerecho = val;
    }

    public List<Integer> getDsInferiorIzquierdo () {
        return dsInferiorIzquierdo;
    }

    public void setDsInferiorIzquierdo (List<Integer> val) {
        this.dsInferiorIzquierdo = val;
    }

    public List<Integer> getDsSuperiorDerecho () {
        return dsSuperiorDerecho;
    }

    public void setDsSuperiorDerecho (List<Integer> val) {
        this.dsSuperiorDerecho = val;
    }

    public List<Integer> getDsSuperiorIzquierdo () {
        return dsSuperiorIzquierdo;
    }

    public void setDsSuperiorIzquierdo (List<Integer> val) {
        this.dsSuperiorIzquierdo = val;
    }

}

