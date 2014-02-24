package co.com.pradalabs.odontoclinicbackend.modelo.paciente;

import java.util.List;

import co.com.pradalabs.odontoclinicbackend.modelo.Abono;


public class Cuenta {

    private int vlrTratamiento;

    private String Observacion;

    private List<Abono> dsabono;

    private int nmTratamiento;

    public Cuenta () {
    }

    public String getObservacion () {
        return Observacion;
    }

    public void setObservacion (String val) {
        this.Observacion = val;
    }

    public int getVlrTratamiento () {
        return vlrTratamiento;
    }

    public void setVlrTratamiento (int val) {
        this.vlrTratamiento = val;
    }

    public int getNmDescuento () {
        return 0;
    }

    public void setNmDescuento (int val) {
    }

    public String getDsAutorizacion () {
        return null;
    }

    public void setDsAutorizacion (String val) {
    }

    public List<Abono> getDsabono () {
        return dsabono;
    }

    public void setDsabono (List<Abono> val) {
        this.dsabono = val;
    }

    public int getNmTratamiento () {
        return nmTratamiento;
    }

    public void setNmTratamiento (int val) {
        this.nmTratamiento = val;
    }

}

