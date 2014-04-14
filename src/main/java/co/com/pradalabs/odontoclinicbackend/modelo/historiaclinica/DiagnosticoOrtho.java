package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;


@PersistenceCapable
public class DiagnosticoOrtho {
	
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;
	
	@Persistent
    private String dsFacial;
	
	@Persistent
    private String dsFuncional;

	@Persistent
    private String dsEsqueletico;

	@Persistent
    private String dsDental;

	@Persistent
    private Boolean snTratamientoComplicado;

	@Persistent
    private String dsTratamientoComplicado;

    public DiagnosticoOrtho () {
    }

    public String getDsDental () {
        return dsDental;
    }

    public void setDsDental (String val) {
        this.dsDental = val;
    }

    public String getDsEsqueletico () {
        return dsEsqueletico;
    }

    public void setDsEsqueletico (String val) {
        this.dsEsqueletico = val;
    }

    public String getDsFacial () {
        return dsFacial;
    }

    public void setDsFacial (String val) {
        this.dsFacial = val;
    }

    public String getDsFuncional () {
        return dsFuncional;
    }

    public void setDsFuncional (String val) {
        this.dsFuncional = val;
    }

    public String getDsTratamientoComplicado () {
        return dsTratamientoComplicado;
    }

    public void setDsTratamientoComplicado (String val) {
        this.dsTratamientoComplicado = val;
    }

    public Boolean getSnTratamientoComplicado () {
        return snTratamientoComplicado;
    }

    public void setSnTratamientoComplicado (Boolean val) {
        this.snTratamientoComplicado = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

}

