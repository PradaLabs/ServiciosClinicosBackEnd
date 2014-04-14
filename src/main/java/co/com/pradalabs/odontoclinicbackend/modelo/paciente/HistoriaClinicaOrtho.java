package co.com.pradalabs.odontoclinicbackend.modelo.paciente;

import java.util.Calendar;
import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

import co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica.AnalisisDental;
import co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica.AnalisisFacial;
import co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica.AnalisisFuncional;
import co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica.DiagnosticoOrtho;


@PersistenceCapable
public class HistoriaClinicaOrtho {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;


	@Persistent
    private String DNI;


	@Persistent
    private String dsEps;


	@Persistent
    private String dsTipoVinculacion;


	@Persistent
    private String dsAlertaMedica;


	@Persistent
    private Calendar feHistoriaClinica;


	@Persistent
    private int feHora;


	@Persistent
    private String dsMotivoConsulta;


	@Persistent
    private AnalisisFacial dsAnalisisFacial;


	@Persistent
    private AnalisisFuncional dsAnalisisFuncional;


	@Persistent
    private String dsAnalisisRadiografico;


	@Persistent
    private AnalisisDental dsAnalisisDental;


	@Persistent
    private DiagnosticoOrtho dsDiagnosticoOrtho;


	@Persistent
    private String dsPlanTratamiento;


	@Persistent
    private Boolean snExtraciones;


	@Persistent
    private List<Integer> nmExtraciones;


	@Persistent
    private String dsAparologiaComplementaria;


	@Persistent
    private int nmHistoriaClinica;

    public HistoriaClinicaOrtho () {
    }

    public String getDNI () {
        return DNI;
    }

    public void setDNI (String val) {
        this.DNI = val;
    }

    public String getDsAlertaMedica () {
        return dsAlertaMedica;
    }

    public void setDsAlertaMedica (String val) {
        this.dsAlertaMedica = val;
    }

    public AnalisisDental getDsAnalisisDental () {
        return dsAnalisisDental;
    }

    public void setDsAnalisisDental (AnalisisDental val) {
        this.dsAnalisisDental = val;
    }

    public AnalisisFacial getDsAnalisisFacial () {
        return dsAnalisisFacial;
    }

    public void setDsAnalisisFacial (AnalisisFacial val) {
        this.dsAnalisisFacial = val;
    }

    public AnalisisFuncional getDsAnalisisFuncional () {
        return dsAnalisisFuncional;
    }

    public void setDsAnalisisFuncional (AnalisisFuncional val) {
        this.dsAnalisisFuncional = val;
    }

    public String getDsAnalisisRadiografico () {
        return dsAnalisisRadiografico;
    }

    public void setDsAnalisisRadiografico (String val) {
        this.dsAnalisisRadiografico = val;
    }

    public String getDsAparologiaComplementaria () {
        return dsAparologiaComplementaria;
    }

    public void setDsAparologiaComplementaria (String val) {
        this.dsAparologiaComplementaria = val;
    }

    public DiagnosticoOrtho getDsDiagnosticoOrtho () {
        return dsDiagnosticoOrtho;
    }

    public void setDsDiagnosticoOrtho (DiagnosticoOrtho val) {
        this.dsDiagnosticoOrtho = val;
    }

    public String getDsEps () {
        return dsEps;
    }

    public void setDsEps (String val) {
        this.dsEps = val;
    }

    public String getDsMotivoConsulta () {
        return dsMotivoConsulta;
    }

    public void setDsMotivoConsulta (String val) {
        this.dsMotivoConsulta = val;
    }

    public String getDsPlanTratamiento () {
        return dsPlanTratamiento;
    }

    public void setDsPlanTratamiento (String val) {
        this.dsPlanTratamiento = val;
    }

    public String getDsTipoVinculacion () {
        return dsTipoVinculacion;
    }

    public void setDsTipoVinculacion (String val) {
        this.dsTipoVinculacion = val;
    }

    public Calendar getFeHistoriaClinica () {
        return feHistoriaClinica;
    }

    public void setFeHistoriaClinica (Calendar val) {
        this.feHistoriaClinica = val;
    }

    public int getFeHora () {
        return feHora;
    }

    public void setFeHora (int val) {
        this.feHora = val;
    }

    public List<Integer> getNmExtraciones () {
        return nmExtraciones;
    }

    public void setNmExtraciones (List<Integer> val) {
        this.nmExtraciones = val;
    }

    public int getNmHistoriaClinica () {
        return nmHistoriaClinica;
    }

    public void setNmHistoriaClinica (int val) {
        this.nmHistoriaClinica = val;
    }

    public Boolean getSnExtraciones () {
        return snExtraciones;
    }

    public void setSnExtraciones (Boolean val) {
        this.snExtraciones = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

}

