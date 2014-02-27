package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica; 

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class FrenilloSobreInsertado {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent
    private Boolean snFrenilloSobreInsertado;

	@Persistent
    private Boolean snSuperior;

	@Persistent
    private Boolean snInferior;

	@Persistent
    private Boolean snLateral;

	@Persistent
    private Boolean snLingual;

    public FrenilloSobreInsertado () {
    }

    public Boolean getSnFrenilloSobreInsertado () {
        return snFrenilloSobreInsertado;
    }

    public void setSnFrenilloSobreInsertado (Boolean val) {
        this.snFrenilloSobreInsertado = val;
    }

    public Boolean getSnInferior () {
        return snInferior;
    }

    public void setSnInferior (Boolean val) {
        this.snInferior = val;
    }

    public Boolean getSnLateral () {
        return snLateral;
    }

    public void setSnLateral (Boolean val) {
        this.snLateral = val;
    }

    public Boolean getSnLingual () {
        return snLingual;
    }

    public void setSnLingual (Boolean val) {
        this.snLingual = val;
    }

    public Boolean getSnSuperior () {
        return snSuperior;
    }

    public void setSnSuperior (Boolean val) {
        this.snSuperior = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
}

