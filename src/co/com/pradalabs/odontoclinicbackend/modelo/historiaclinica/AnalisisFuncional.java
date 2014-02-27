package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class AnalisisFuncional {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private Habito dsHabitos;

	@Persistent
    private ExamenATM dsExamenATM;

	@Persistent
    private PalpitacionArticular dsPalpitacionArticular;

    public AnalisisFuncional () {
    }

    public ExamenATM getDsExamenATM () {
        return dsExamenATM;
    }

    public void setDsExamenATM (ExamenATM val) {
        this.dsExamenATM = val;
    }

    public Habito getDsHabitos () {
        return dsHabitos;
    }

    public void setDsHabitos (Habito val) {
        this.dsHabitos = val;
    }

    public PalpitacionArticular getDsPalpitacionArticular () {
        return dsPalpitacionArticular;
    }

    public void setDsPalpitacionArticular (PalpitacionArticular val) {
        this.dsPalpitacionArticular = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
}

