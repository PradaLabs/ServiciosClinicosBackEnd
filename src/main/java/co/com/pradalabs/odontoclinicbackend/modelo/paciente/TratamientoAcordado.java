package co.com.pradalabs.odontoclinicbackend.modelo.paciente;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;


@PersistenceCapable
public class TratamientoAcordado {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent
    private int cdCodigo;

	@Persistent
    private String cdTratamiento;

	@Persistent
    private String dsTratamiento;

	@Persistent
    private Double vrPrecio;

	@Persistent
    private Boolean snDescuento;

	@Persistent
    private int nmDescuento;

	@Persistent
    private int cdAutorizador;

	@Persistent
    private Boolean snEfectivo;

	@Persistent
    private int cdDoctor;

	@Persistent
    private String dsDoctor;

	@Persistent
    private int nmTratamiento;

	@Persistent
    private String dsFirmaPaciente;

	@Persistent
    private String dsFrimaProfesional;

    public TratamientoAcordado () {
    }

    public int getCdAutorizador () {
        return cdAutorizador;
    }

    public void setCdAutorizador (int val) {
        this.cdAutorizador = val;
    }

    public int getCdCodigo () {
        return cdCodigo;
    }

    public void setCdCodigo (int val) {
        this.cdCodigo = val;
    }

    public int getCdDoctor () {
        return cdDoctor;
    }

    public void setCdDoctor (int val) {
        this.cdDoctor = val;
    }

    public String getCdTratamiento () {
        return cdTratamiento;
    }

    public void setCdTratamiento (String val) {
        this.cdTratamiento = val;
    }

    public String getDsDoctor () {
        return dsDoctor;
    }

    public void setDsDoctor (String val) {
        this.dsDoctor = val;
    }

    public String getDsFirmaPaciente () {
        return dsFirmaPaciente;
    }

    public void setDsFirmaPaciente (String val) {
        this.dsFirmaPaciente = val;
    }

    public String getDsFrimaProfesional () {
        return dsFrimaProfesional;
    }

    public void setDsFrimaProfesional (String val) {
        this.dsFrimaProfesional = val;
    }

    public String getDsTratamiento () {
        return dsTratamiento;
    }

    public void setDsTratamiento (String val) {
        this.dsTratamiento = val;
    }

    public int getNmDescuento () {
        return nmDescuento;
    }

    public void setNmDescuento (int val) {
        this.nmDescuento = val;
    }

    public int getNmTratamiento () {
        return nmTratamiento;
    }

    public void setNmTratamiento (int val) {
        this.nmTratamiento = val;
    }

    public Boolean getSnDescuento () {
        return snDescuento;
    }

    public void setSnDescuento (Boolean val) {
        this.snDescuento = val;
    }

    public Boolean getSnEfectivo () {
        return snEfectivo;
    }

    public void setSnEfectivo (Boolean val) {
        this.snEfectivo = val;
    }

    public Double getVrPrecio () {
        return vrPrecio;
    }

    public void setVrPrecio (Double val) {
        this.vrPrecio = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
}

