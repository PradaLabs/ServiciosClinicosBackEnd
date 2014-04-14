package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;


@PersistenceCapable
public class AsimetriaFrente {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private Boolean snDerecho;

	@Persistent
    private Boolean snIzquierdo;

	@Persistent
    private Boolean snTercioSuperior;

	@Persistent
    private Boolean snTercioMedio;

	@Persistent
    private Boolean snTercioInferior;

	@Persistent
    private Boolean PlanoOclusal;

    public AsimetriaFrente () {
    }

    public Boolean getPlanoOclusal () {
        return PlanoOclusal;
    }

    public void setPlanoOclusal (Boolean val) {
        this.PlanoOclusal = val;
    }

    public Boolean getSnDerecho () {
        return snDerecho;
    }

    public void setSnDerecho (Boolean val) {
        this.snDerecho = val;
    }

    public Boolean getSnIzquierdo () {
        return snIzquierdo;
    }

    public void setSnIzquierdo (Boolean val) {
        this.snIzquierdo = val;
    }

    public Boolean getSnTercioInferior () {
        return snTercioInferior;
    }

    public void setSnTercioInferior (Boolean val) {
        this.snTercioInferior = val;
    }

    public Boolean getSnTercioMedio () {
        return snTercioMedio;
    }

    public void setSnTercioMedio (Boolean val) {
        this.snTercioMedio = val;
    }

    public Boolean getSnTercioSuperior () {
        return snTercioSuperior;
    }

    public void setSnTercioSuperior (Boolean val) {
        this.snTercioSuperior = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

}

