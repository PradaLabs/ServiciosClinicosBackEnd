package co.com.pradalabs.odontoclinicbackend.modelo.clinica;

import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;


@PersistenceCapable
public class Horario {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private String dsHorarioHabil;
	
	@Persistent
    private String dsHorarioEspecial;
	
	@Persistent
    private List<ControlHorario> dsControlHorario;
	
	@Persistent
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

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "Horario [key=" + key + ", dsHorarioHabil=" + dsHorarioHabil
				+ ", dsHorarioEspecial=" + dsHorarioEspecial
				+ ", dsControlHorario=" + dsControlHorario + ", cdClinica="
				+ cdClinica + "]";
	}
    
	
}

