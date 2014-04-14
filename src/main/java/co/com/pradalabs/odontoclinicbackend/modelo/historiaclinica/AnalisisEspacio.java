package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;


@PersistenceCapable
public class AnalisisEspacio {
	
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;
	
	@Persistent
    private int nmSuperiorDisponible;

	@Persistent
    private int nmInferiorDisponible;

	@Persistent
    private int nmSuperiorReuqerido;

	@Persistent
    private int nmInferiorRquerido;

	@Persistent
    private int nmSuperiorDiferencia;

	@Persistent
    private int nmInferiorDiferencia;

	@Persistent
    private Boolean Apinamiento;

	@Persistent
    private int cdApinamiento;

	@Persistent
    private Boolean snEspaciamiento;

	@Persistent
    private int cdEspacioamiento;

    public AnalisisEspacio () {
    }

    public Boolean getApinamiento () {
        return Apinamiento;
    }

    public void setApinamiento (Boolean val) {
        this.Apinamiento = val;
    }

    public int getCdApinamiento () {
        return cdApinamiento;
    }

    public void setCdApinamiento (int val) {
        this.cdApinamiento = val;
    }

    public int getCdEspacioamiento () {
        return cdEspacioamiento;
    }

    public void setCdEspacioamiento (int val) {
        this.cdEspacioamiento = val;
    }

    public int getNmInferiorDiferencia () {
        return nmInferiorDiferencia;
    }

    public void setNmInferiorDiferencia (int val) {
        this.nmInferiorDiferencia = val;
    }

    public int getNmInferiorDisponible () {
        return nmInferiorDisponible;
    }

    public void setNmInferiorDisponible (int val) {
        this.nmInferiorDisponible = val;
    }

    public int getNmInferiorRquerido () {
        return nmInferiorRquerido;
    }

    public void setNmInferiorRquerido (int val) {
        this.nmInferiorRquerido = val;
    }

    public int getNmSuperiorDiferencia () {
        return nmSuperiorDiferencia;
    }

    public void setNmSuperiorDiferencia (int val) {
        this.nmSuperiorDiferencia = val;
    }

    public int getNmSuperiorDisponible () {
        return nmSuperiorDisponible;
    }

    public void setNmSuperiorDisponible (int val) {
        this.nmSuperiorDisponible = val;
    }

    public int getNmSuperiorReuqerido () {
        return nmSuperiorReuqerido;
    }

    public void setNmSuperiorReuqerido (int val) {
        this.nmSuperiorReuqerido = val;
    }

    public Boolean getSnEspaciamiento () {
        return snEspaciamiento;
    }

    public void setSnEspaciamiento (Boolean val) {
        this.snEspaciamiento = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
}

