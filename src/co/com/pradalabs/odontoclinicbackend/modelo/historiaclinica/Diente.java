package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import java.util.List;

public class Diente {

    private int nmDiente;

    private List<Integer> cdDsDiente;

    public Diente () {
    }

    public List<Integer> getCdDsDiente () {
        return cdDsDiente;
    }

    public void setCdDsDiente (List<Integer> val) {
        this.cdDsDiente = val;
    }

    public int getNmDiente () {
        return nmDiente;
    }

    public void setNmDiente (int val) {
        this.nmDiente = val;
    }

}

