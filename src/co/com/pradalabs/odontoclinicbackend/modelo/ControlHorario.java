package co.com.pradalabs.odontoclinicbackend.modelo;

import java.util.Calendar;


public class ControlHorario {

    private int dsHoraApertura;

    private int nmHoraCierre;

    private Calendar FeControl;

    public ControlHorario () {
    }

    public Calendar getFeControl () {
        return FeControl;
    }

    public void setFeControl (Calendar val) {
        this.FeControl = val;
    }

    public int getDsHoraApertura () {
        return dsHoraApertura;
    }

    public void setDsHoraApertura (int val) {
        this.dsHoraApertura = val;
    }

    public int getNmHoraCierre () {
        return nmHoraCierre;
    }

    public void setNmHoraCierre (int val) {
        this.nmHoraCierre = val;
    }

}

