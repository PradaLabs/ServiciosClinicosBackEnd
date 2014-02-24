package co.com.pradalabs.odontoclinicbackend.modelo.paciente;

import java.util.Calendar;
import java.util.List;

import co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica.Diagnostico;
import co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica.Diente;
import co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica.EnfermedadPaciente;
import co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica.ExamenFisico;
import co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica.PlanTratamientoIdeal;
import co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica.Protesis;

public class HistoriaClinicaOdonto {

    private String DNI;

    private String dsEps;

    private String dsTipoVinculacion;

    private String dsAlertaMedica;

    private Calendar FeHistoriaClinica;

    private int Hora;

    private String dsMotivoConsulta;

    private EnfermedadPaciente dsEnfermedadPaciente;

    private String dsUltimaVisita;

    private String dsMotivoUltimaVisita;

    private int cdHigieneOral;

    private Boolean snCepilloDental;

    private String dsNmVecesCepillada;

    private Boolean snSedaDental;

    private Boolean snEnjuagueBucal;

    private ExamenFisico dsExamenFisico;

    private PlanTratamientoIdeal dsTratamientoIdeal;

    private Diagnostico dsDiagnostico;

    private String dsPlanTratamientoAcordado;

    private List<Diente> dsDientes;

    private Protesis dsProtesis;

    private String dsOdontograma;

    private int nmHistoriaClinica;

    public HistoriaClinicaOdonto () {
    }

    public String getDNI () {
        return DNI;
    }

    public void setDNI (String val) {
        this.DNI = val;
    }

    public Calendar getFeHistoriaClinica () {
        return FeHistoriaClinica;
    }

    public void setFeHistoriaClinica (Calendar val) {
        this.FeHistoriaClinica = val;
    }

    public int getHora () {
        return Hora;
    }

    public void setHora (int val) {
        this.Hora = val;
    }

    public int getCdHigieneOral () {
        return cdHigieneOral;
    }

    public void setCdHigieneOral (int val) {
        this.cdHigieneOral = val;
    }

    public String getDsAlertaMedica () {
        return dsAlertaMedica;
    }

    public void setDsAlertaMedica (String val) {
        this.dsAlertaMedica = val;
    }

    public Diagnostico getDsDiagnostico () {
        return dsDiagnostico;
    }

    public void setDsDiagnostico (Diagnostico val) {
        this.dsDiagnostico = val;
    }

    public List<Diente> getDsDientes () {
        return dsDientes;
    }

    public void setDsDientes (List<Diente> val) {
        this.dsDientes = val;
    }

    public EnfermedadPaciente getDsEnfermedadPaciente () {
        return dsEnfermedadPaciente;
    }

    public void setDsEnfermedadPaciente (EnfermedadPaciente val) {
        this.dsEnfermedadPaciente = val;
    }

    public String getDsEps () {
        return dsEps;
    }

    public void setDsEps (String val) {
        this.dsEps = val;
    }

    public ExamenFisico getDsExamenFisico () {
        return dsExamenFisico;
    }

    public void setDsExamenFisico (ExamenFisico val) {
        this.dsExamenFisico = val;
    }

    public String getDsMotivoConsulta () {
        return dsMotivoConsulta;
    }

    public void setDsMotivoConsulta (String val) {
        this.dsMotivoConsulta = val;
    }

    public String getDsMotivoUltimaVisita () {
        return dsMotivoUltimaVisita;
    }

    public void setDsMotivoUltimaVisita (String val) {
        this.dsMotivoUltimaVisita = val;
    }

    public String getDsNmVecesCepillada () {
        return dsNmVecesCepillada;
    }

    public void setDsNmVecesCepillada (String val) {
        this.dsNmVecesCepillada = val;
    }

    public String getDsOdontograma () {
        return dsOdontograma;
    }

    public void setDsOdontograma (String val) {
        this.dsOdontograma = val;
    }

    public String getDsPlanTratamientoAcordado () {
        return dsPlanTratamientoAcordado;
    }

    public void setDsPlanTratamientoAcordado (String val) {
        this.dsPlanTratamientoAcordado = val;
    }

    public Protesis getDsProtesis () {
        return dsProtesis;
    }

    public void setDsProtesis (Protesis val) {
        this.dsProtesis = val;
    }

    public String getDsTipoVinculacion () {
        return dsTipoVinculacion;
    }

    public void setDsTipoVinculacion (String val) {
        this.dsTipoVinculacion = val;
    }

    public PlanTratamientoIdeal getDsTratamientoIdeal () {
        return dsTratamientoIdeal;
    }

    public void setDsTratamientoIdeal (PlanTratamientoIdeal val) {
        this.dsTratamientoIdeal = val;
    }

    public String getDsUltimaVisita () {
        return dsUltimaVisita;
    }

    public void setDsUltimaVisita (String val) {
        this.dsUltimaVisita = val;
    }

    public int getNmHistoriaClinica () {
        return nmHistoriaClinica;
    }

    public void setNmHistoriaClinica (int val) {
        this.nmHistoriaClinica = val;
    }

    public Boolean getSnCepilloDental () {
        return snCepilloDental;
    }

    public void setSnCepilloDental (Boolean val) {
        this.snCepilloDental = val;
    }

    public Boolean getSnEnjuagueBucal () {
        return snEnjuagueBucal;
    }

    public void setSnEnjuagueBucal (Boolean val) {
        this.snEnjuagueBucal = val;
    }

    public Boolean getSnSedaDental () {
        return snSedaDental;
    }

    public void setSnSedaDental (Boolean val) {
        this.snSedaDental = val;
    }

}

