package co.com.pradalabs.odontoclinicbackend.modelo;

import java.util.List;

public class Horario {

    private String dsHorarioHabil;

    private String dsHorarioEspecial;

    private List<ControlHorario> dsControlHorario;

    private int cdClinica;

    public Horario () {
    }

    public int getCdClinica () {
        return cdClinica;
    }

    public void setCdClinica (int val) {
        this.cdClinica = val;
    }

    public List<ControlHorario> getDsControlHorario () {
        return dsControlHorario;
    }

    public void setDsControlHorario (List<ControlHorario> val) {
        this.dsControlHorario = val;
    }

    public String getDsHorarioEspecial () {
        return dsHorarioEspecial;
    }

    public void setDsHorarioEspecial (String val) {
        this.dsHorarioEspecial = val;
    }

    public String getDsHorarioHabil () {
        return dsHorarioHabil;
    }

    public void setDsHorarioHabil (String val) {
        this.dsHorarioHabil = val;
    }

}

