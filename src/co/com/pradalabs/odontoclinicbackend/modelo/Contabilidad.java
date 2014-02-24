package co.com.pradalabs.odontoclinicbackend.modelo;

import java.util.Calendar;


public class Contabilidad {

    private int nmEgreso;

    private String dsEgreso;

    private double vlrEgreso;

    private Calendar feEgreso;

    private boolean snNotificado;

    private int cdClinica;

    public Contabilidad () {
    }

    public int getCdClinica () {
        return cdClinica;
    }

    public void setCdClinica (int val) {
        this.cdClinica = val;
    }

    public String getDsEgreso () {
        return dsEgreso;
    }

    public void setDsEgreso (String val) {
        this.dsEgreso = val;
    }

    public Calendar getFeEgreso () {
        return feEgreso;
    }

    public void setFeEgreso (Calendar val) {
        this.feEgreso = val;
    }

    public int getNmEgreso () {
        return nmEgreso;
    }

    public void setNmEgreso (int val) {
        this.nmEgreso = val;
    }

    public boolean getSnNotificado () {
        return snNotificado;
    }

    public void setSnNotificado (boolean val) {
        this.snNotificado = val;
    }

    public double getVlrEgreso () {
        return vlrEgreso;
    }

    public void setVlrEgreso (double val) {
        this.vlrEgreso = val;
    }

}

