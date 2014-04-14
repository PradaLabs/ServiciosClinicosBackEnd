package co.com.pradalabs.odontoclinicbackend.modelo;


import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;


@PersistenceCapable
public class Clinica {
	
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;
	
	@Persistent
    private List<Paciente> Pacientes;

	@Persistent
    private int cdClinica;

	@Persistent
    private String dsClinica;

    @Persistent
    private List<Profesional> dsProfesionales;

    @Persistent
    private Horario dsHorario;

    @Persistent
    private List<Admin> dsAdmin;
    
    
    @Persistent
    private List<Contabilidad> dsContabilidad;
    

    @Persistent
    private List<Precios> listaPrecios;
    
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

	public List<Precios> getListaPrecios() {
		return listaPrecios;
	}

	public void setListaPrecios(List<Precios> listaPrecios) {
		this.listaPrecios = listaPrecios;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
}

