package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;


public class EnfermedadPaciente {

    private String DNI;

    private EnfermedadGeneral enfermedadGeneral;

    private String dsObservacion;

    public EnfermedadPaciente () {
    }

    public String getDNI () {
        return DNI;
    }

    public void setDNI (String val) {
        this.DNI = val;
    }

    public String getDsObservacion () {
        return dsObservacion;
    }

    public void setDsObservacion (String val) {
        this.dsObservacion = val;
    }

    public EnfermedadGeneral getEnfermedadGeneral () {
        return enfermedadGeneral;
    }

    public void setEnfermedadGeneral (EnfermedadGeneral val) {
        this.enfermedadGeneral = val;
    }

}

