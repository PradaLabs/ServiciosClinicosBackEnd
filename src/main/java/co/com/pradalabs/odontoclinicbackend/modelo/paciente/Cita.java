package co.com.pradalabs.odontoclinicbackend.modelo.paciente;

import java.util.Calendar;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;


@PersistenceCapable
public class Cita {

	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;
	
	@Persistent
    private int cdCodigo;

	@Persistent
    private Calendar feFecha;

	@Persistent
    private int feHora;

	@Persistent
    private Boolean snConfirmacion;

	@Persistent
    private Boolean snAsistencia;

	@Persistent
    private Boolean snCancelado;

	@Persistent
    private String DNI;

    public Cita () {
    }

    public String getDNI () {
        return DNI;
    }

    public void setDNI (String val) {
        this.DNI = val;
    }

    public int getCdCodigo () {
        return cdCodigo;
    }

    public void setCdCodigo (int val) {
        this.cdCodigo = val;
    }

    public Calendar getFeFecha () {
        return feFecha;
    }

    public void setFeFecha (Calendar val) {
        this.feFecha = val;
    }

    public int getFeHora () {
        return feHora;
    }

    public void setFeHora (int val) {
        this.feHora = val;
    }

    public Boolean getSnAsistencia () {
        return snAsistencia;
    }

    public void setSnAsistencia (Boolean val) {
        this.snAsistencia = val;
    }

    public Boolean getSnCancelado () {
        return snCancelado;
    }

    public void setSnCancelado (Boolean val) {
        this.snCancelado = val;
    }

    public Boolean getSnConfirmacion () {
        return snConfirmacion;
    }

    public void setSnConfirmacion (Boolean val) {
        this.snConfirmacion = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
    
}

