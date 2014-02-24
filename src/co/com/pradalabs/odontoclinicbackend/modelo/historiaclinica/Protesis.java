package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import java.util.List;

public class Protesis {

    private int cdCodigo;

    private String dsDescripcion;

    private List<Diente> dsDienteProtesis;

    private boolean snProtesis;

    public Protesis () {
    }

    public int getCdCodigo () {
        return cdCodigo;
    }

    public void setCdCodigo (int val) {
        this.cdCodigo = val;
    }

    public String getDsDescripcion () {
        return dsDescripcion;
    }

    public void setDsDescripcion (String val) {
        this.dsDescripcion = val;
    }

    public List<Diente> getDsDienteProtesis () {
        return dsDienteProtesis;
    }

    public void setDsDienteProtesis (List<Diente> val) {
        this.dsDienteProtesis = val;
    }

    public boolean getSnProtesis () {
        return snProtesis;
    }

    public void setSnProtesis (boolean val) {
        this.snProtesis = val;
    }

}

