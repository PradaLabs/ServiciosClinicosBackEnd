package co.com.pradalabs.odontoclinicbackend.modelo.paciente;

import java.util.Calendar;

public class Cita {

    private int cdCodigo;

    private Calendar feFecha;

    private int feHora;

    private Boolean snConfirmacion;

    private Boolean snAsistencia;

    private Boolean snCancelado;

    private String DNI;

    public Cita () {
    }

    public String getDNI () {
        return DNI;
    }

    public void setDNI (String val) {
        this.DNI = val;
    }

    public int getCdCodigo () {
        return cdCodigo;
    }

    public void setCdCodigo (int val) {
        this.cdCodigo = val;
    }

    public Calendar getFeFecha () {
        return feFecha;
    }

    public void setFeFecha (Calendar val) {
        this.feFecha = val;
    }

    public int getFeHora () {
        return feHora;
    }

    public void setFeHora (int val) {
        this.feHora = val;
    }

    public Boolean getSnAsistencia () {
        return snAsistencia;
    }

    public void setSnAsistencia (Boolean val) {
        this.snAsistencia = val;
    }

    public Boolean getSnCancelado () {
        return snCancelado;
    }

    public void setSnCancelado (Boolean val) {
        this.snCancelado = val;
    }

    public Boolean getSnConfirmacion () {
        return snConfirmacion;
    }

    public void setSnConfirmacion (Boolean val) {
        this.snConfirmacion = val;
    }

}

