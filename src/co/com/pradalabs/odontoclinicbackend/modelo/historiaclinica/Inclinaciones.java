package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;


@PersistenceCapable
public class Inclinaciones {

	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;
	
	@Persistent
    private List<Integer> dsSuperiorDerecho;
	
	@Persistent
    private List<Integer> dsInferiorDerecho;

	@Persistent
    private List<Integer> dsInferiorIzquierdo;

	@Persistent
    private List<Integer> dsSuperiorIzquierdo;

	
    public Inclinaciones () {
    }

    public List<Integer> getDsInferiorDerecho () {
        return dsInferiorDerecho;
    }

    public void setDsInferiorDerecho (List<Integer> val) {
        this.dsInferiorDerecho = val;
    }

    public List<Integer> getDsInferiorIzquierdo () {
        return dsInferiorIzquierdo;
    }

    public void setDsInferiorIzquierdo (List<Integer> val) {
        this.dsInferiorIzquierdo = val;
    }

    public List<Integer> getDsSuperiorDerecho () {
        return dsSuperiorDerecho;
    }

    public void setDsSuperiorDerecho (List<Integer> val) {
        this.dsSuperiorDerecho = val;
    }

    public List<Integer> getDsSuperiorIzquierdo () {
        return dsSuperiorIzquierdo;
    }

    public void setDsSuperiorIzquierdo (List<Integer> val) {
        this.dsSuperiorIzquierdo = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
}

