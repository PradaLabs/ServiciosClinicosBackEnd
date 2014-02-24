package co.com.pradalabs.odontoclinicbackend.modelo;

public class Profesional {

    private int cdProfesional;

    private String dsNombreProfesional;

    private String dsApellidosProfesional;

    private String Profesion;

    private int nmTelefono;

    private String dsEmail;

    private int nmRegistro;

    private String dsIdentificacion;

    private int nmIdentificacion;

    public Profesional () {
    }

    public String getProfesion () {
        return Profesion;
    }

    public void setProfesion (String val) {
        this.Profesion = val;
    }

    public int getCdProfesional () {
        return cdProfesional;
    }

    public void setCdProfesional (int val) {
        this.cdProfesional = val;
    }

    public String getDsApellidosProfesional () {
        return dsApellidosProfesional;
    }

    public void setDsApellidosProfesional (String val) {
        this.dsApellidosProfesional = val;
    }

    public String getDsEmail () {
        return dsEmail;
    }

    public void setDsEmail (String val) {
        this.dsEmail = val;
    }

    public String getDsIdentificacion () {
        return dsIdentificacion;
    }

    public void setDsIdentificacion (String val) {
        this.dsIdentificacion = val;
    }

    public String getDsNombreProfesional () {
        return dsNombreProfesional;
    }

    public void setDsNombreProfesional (String val) {
        this.dsNombreProfesional = val;
    }

    public int getNmIdentificacion () {
        return nmIdentificacion;
    }

    public void setNmIdentificacion (int val) {
        this.nmIdentificacion = val;
    }

    public int getNmRegistro () {
        return nmRegistro;
    }

    public void setNmRegistro (int val) {
        this.nmRegistro = val;
    }

    public int getNmTelefono () {
        return nmTelefono;
    }

    public void setNmTelefono (int val) {
        this.nmTelefono = val;
    }

}

