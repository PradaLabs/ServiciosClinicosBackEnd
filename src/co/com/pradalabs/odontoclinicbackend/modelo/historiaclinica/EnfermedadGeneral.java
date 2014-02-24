package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

public class EnfermedadGeneral {

    private String ID_Enfermedad;

    private String DsEnfermedad;

    public EnfermedadGeneral () {
    }

    public String getDsEnfermedad () {
        return DsEnfermedad;
    }

    public void setDsEnfermedad (String val) {
        this.DsEnfermedad = val;
    }

    public String getID_Enfermedad () {
        return ID_Enfermedad;
    }

    public void setID_Enfermedad (String val) {
        this.ID_Enfermedad = val;
    }

}

