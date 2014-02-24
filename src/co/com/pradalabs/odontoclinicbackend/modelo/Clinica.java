package co.com.pradalabs.odontoclinicbackend.modelo;


import java.util.List;

public class Clinica {

    private List<Paciente> Pacientes;

    private int cdClinica;

    private String dsClinica;

    private List<Profesional> dsProfesionales;

    private Horario dsHorario;

    private List<Admin> dsAdmin;

    private List<Contabilidad> dsContabilidad;

    public Clinica () {
    }

    public List<Paciente> getPacientes () {
        return Pacientes;
    }

    public void setPacientes (List<Paciente> val) {
        this.Pacientes = val;
    }

    public int getCdClinica () {
        return cdClinica;
    }

    public void setCdClinica (int val) {
        this.cdClinica = val;
    }

    public List<Admin> getDsAdmin () {
        return dsAdmin;
    }

    public void setDsAdmin (List<Admin> val) {
        this.dsAdmin = val;
    }

    public String getDsClinica () {
        return dsClinica;
    }

    public void setDsClinica (String val) {
        this.dsClinica = val;
    }

    public List<Contabilidad> getDsContabilidad () {
        return dsContabilidad;
    }


    public void setDsContabilidad (List<Contabilidad> val) {
        this.dsContabilidad = val;
    }

    public Horario getDsHorario () {
        return dsHorario;
    }

    public void setDsHorario (Horario val) {
        this.dsHorario = val;
    }

    public List<Profesional> getDsProfesionales () {
        return dsProfesionales;
    }

    public void setDsProfesionales (List<Profesional> val) {
        this.dsProfesionales = val;
    }

}

