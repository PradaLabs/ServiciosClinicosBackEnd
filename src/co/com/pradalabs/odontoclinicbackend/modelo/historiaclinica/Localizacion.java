package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Localizacion {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private Boolean Inicial;
	
	@Persistent
    private Boolean Intermedio;

	@Persistent
    private Boolean snIFinal;

	@Persistent
    private int nnAperturaMaxima;

	@Persistent
    private int nmLateralDerecha;

	@Persistent
    private int nmLateralizquierda;

    public Localizacion () {
    }

    public Boolean getInicial () {
        return Inicial;
    }

    public void setInicial (Boolean val) {
        this.Inicial = val;
    }

    public Boolean getIntermedio () {
        return Intermedio;
    }

    public void setIntermedio (Boolean val) {
        this.Intermedio = val;
    }

    public int getNmLateralDerecha () {
        return nmLateralDerecha;
    }

    public void setNmLateralDerecha (int val) {
        this.nmLateralDerecha = val;
    }

    public int getNmLateralizquierda () {
        return nmLateralizquierda;
    }

    public void setNmLateralizquierda (int val) {
        this.nmLateralizquierda = val;
    }

    public int getNnAperturaMaxima () {
        return nnAperturaMaxima;
    }

    public void setNnAperturaMaxima (int val) {
        this.nnAperturaMaxima = val;
    }

    public Boolean getSnIFinal () {
        return snIFinal;
    }

    public void setSnIFinal (Boolean val) {
        this.snIFinal = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    

}

