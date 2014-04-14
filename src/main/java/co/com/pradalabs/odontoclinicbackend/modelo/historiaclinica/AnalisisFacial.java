package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class AnalisisFacial {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private ExamenFrente dsExamenFrente;

	@Persistent
    private AsimetriaFrente dsAsimetriaFrente;

	@Persistent
    private ExamenPerfil dsExamenPerfil;

    public AnalisisFacial () {
    }

    public AsimetriaFrente getDsAsimetriaFrente () {
        return dsAsimetriaFrente;
    }

    public void setDsAsimetriaFrente (AsimetriaFrente val) {
        this.dsAsimetriaFrente = val;
    }

    public ExamenFrente getDsExamenFrente () {
        return dsExamenFrente;
    }

    public void setDsExamenFrente (ExamenFrente val) {
        this.dsExamenFrente = val;
    }

    public ExamenPerfil getDsExamenPerfil () {
        return dsExamenPerfil;
    }

    public void setDsExamenPerfil (ExamenPerfil val) {
        this.dsExamenPerfil = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

}

