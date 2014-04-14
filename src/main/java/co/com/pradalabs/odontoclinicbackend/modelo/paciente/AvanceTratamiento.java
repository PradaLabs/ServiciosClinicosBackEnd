package co.com.pradalabs.odontoclinicbackend.modelo.paciente;

import java.util.Calendar;
import java.util.List;

import co.com.pradalabs.odontoclinicbackend.modelo.RegistroFoto;

public class AvanceTratamiento {

    private Calendar feTratamiento;

    private String dsTratamiento;

    private List<RegistroFoto> dsFotos;

    private int cdDoctor;

    private String dsDoctor;

    private int nmHistoriaClinica;

    private String dsTipoHistoriaClinica;

    private int nmTratamiento;

    private List<String> Insumos;

    public AvanceTratamiento () {
    }

    public List<String> getInsumos () {
        return Insumos;
    }

    public void setInsumos (List<String> val) {
        this.Insumos = val;
    }

    public int getCdDoctor () {
        return cdDoctor;
    }

    public void setCdDoctor (int val) {
        this.cdDoctor = val;
    }

    public String getDsDoctor () {
        return dsDoctor;
    }

    public void setDsDoctor (String val) {
        this.dsDoctor = val;
    }

    public List<RegistroFoto> getDsFotos () {
        return dsFotos;
    }

    public void setDsFotos (List<RegistroFoto> val) {
        this.dsFotos = val;
    }

    public String getDsTipoHistoriaClinica () {
        return dsTipoHistoriaClinica;
    }

    public void setDsTipoHistoriaClinica (String val) {
        this.dsTipoHistoriaClinica = val;
    }

    public String getDsTratamiento () {
        return dsTratamiento;
    }

    public void setDsTratamiento (String val) {
        this.dsTratamiento = val;
    }

    public Calendar getFeTratamiento () {
        return feTratamiento;
    }

    public void setFeTratamiento (Calendar val) {
        this.feTratamiento = val;
    }

    public int getNmHistoriaClinica () {
        return nmHistoriaClinica;
    }

    public void setNmHistoriaClinica (int val) {
        this.nmHistoriaClinica = val;
    }

    public int getNmTratamiento () {
        return nmTratamiento;
    }

    public void setNmTratamiento (int val) {
        this.nmTratamiento = val;
    }

}

