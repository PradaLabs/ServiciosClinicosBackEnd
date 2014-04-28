package co.com.pradalabs.odontoclinicbackend.modelo.paciente;

import java.util.Calendar;
import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

import co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica.Diagnostico;
import co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica.Diente;
import co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica.EnfermedadPaciente;
import co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica.ExamenFisico;
import co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica.PlanTratamientoIdeal;
import co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica.Protesis;

@PersistenceCapable
public class HistoriaClinicaOdonto {

	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private String DNI;

	@Persistent
    private String dsAlertaMedica;

	@Persistent
    private Calendar FeHistoriaClinica;

	@Persistent
    private int Hora;

	@Persistent
    private String dsMotivoConsulta;

	@Persistent
    private EnfermedadPaciente dsEnfermedadPaciente;

	@Persistent
    private String dsUltimaVisita;

	@Persistent
    private String dsMotivoUltimaVisita;

	@Persistent
    private int cdHigieneOral;

	@Persistent
    private Boolean snCepilloDental;

	@Persistent
    private String dsNmVecesCepillada;

	@Persistent
    private Boolean snSedaDental;

	@Persistent
    private Boolean snEnjuagueBucal;

	@Persistent
    private ExamenFisico dsExamenFisico;

	@Persistent
    private PlanTratamientoIdeal dsTratamientoIdeal;

	@Persistent
    private Diagnostico dsDiagnostico;

	@Persistent
    private String dsPlanTratamientoAcordado;

	@Persistent
    private List<Diente> dsDientes;

	@Persistent
    private Protesis dsProtesis;

	@Persistent
    private String dsOdontograma;

	@Persistent
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

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    

}

