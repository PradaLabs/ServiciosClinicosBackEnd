package co.com.pradalabs.odontoclinicbackend.modelo;

public class Admin {

    private int cdClinica;

    private String dsNombre;

    private String dsApellido;

    private int dsTelefono;

    private int dsCelular;

    private String Email;

    public Admin () {
    }

    public String getEmail () {
        return Email;
    }

    public void setEmail (String val) {
        this.Email = val;
    }

    public int getCdClinica () {
        return cdClinica;
    }

    public void setCdClinica (int val) {
        this.cdClinica = val;
    }

    public String getDsApellido () {
        return dsApellido;
    }

    public void setDsApellido (String val) {
        this.dsApellido = val;
    }

    public int getDsCelular () {
        return dsCelular;
    }

    public void setDsCelular (int val) {
        this.dsCelular = val;
    }

    public String getDsNombre () {
        return dsNombre;
    }

    public void setDsNombre (String val) {
        this.dsNombre = val;
    }

    public int getDsTelefono () {
        return dsTelefono;
    }

    public void setDsTelefono (int val) {
        this.dsTelefono = val;
    }

}

