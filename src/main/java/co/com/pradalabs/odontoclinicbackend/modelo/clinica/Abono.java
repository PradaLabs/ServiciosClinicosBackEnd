package co.com.pradalabs.odontoclinicbackend.modelo.clinica;

import java.util.Calendar;

public class Abono {

    private Calendar FeAbono;

    private double vlrAbono;

    public Abono () {
    }

    public Calendar getFeAbono () {
        return FeAbono;
    }

    public void setFeAbono (Calendar val) {
        this.FeAbono = val;
    }

    public double getVlrAbono () {
        return vlrAbono;
    }

    public void setVlrAbono (double val) {
        this.vlrAbono = val;
    }

}

