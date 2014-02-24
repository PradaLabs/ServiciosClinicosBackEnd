package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;


public class Acompanante {

    private String dsNombre;

    private String dsApellido;

    private String dsTelefono;

    private String dsCelular;

    private Boolean snResponsable;

    private String dsParentesco;

    private String DNI;

    public Acompanante () {
    }

    public String getDNI () {
        return DNI;
    }

    public void setDNI (String val) {
        this.DNI = val;
    }

    public String getDsApellido () {
        return dsApellido;
    }

    public void setDsApellido (String val) {
        this.dsApellido = val;
    }

    public String getDsCelular () {
        return dsCelular;
    }

    public void setDsCelular (String val) {
        this.dsCelular = val;
    }

    public String getDsNombre () {
        return dsNombre;
    }

    public void setDsNombre (String val) {
        this.dsNombre = val;
    }

    public String getDsParentesco () {
        return dsParentesco;
    }

    public void setDsParentesco (String val) {
        this.dsParentesco = val;
    }

    public String getDsTelefono () {
        return dsTelefono;
    }

    public void setDsTelefono (String val) {
        this.dsTelefono = val;
    }

    public Boolean getSnResponsable () {
        return snResponsable;
    }

    public void setSnResponsable (Boolean val) {
        this.snResponsable = val;
    }

}

