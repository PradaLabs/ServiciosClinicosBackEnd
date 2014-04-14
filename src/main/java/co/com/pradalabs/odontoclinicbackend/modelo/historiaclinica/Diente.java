package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;


@PersistenceCapable
public class Diente {

	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private int nmDiente;
	
	@Persistent
    private List<Integer> cdDsDiente;

    public Diente () {
    }

    public List<Integer> getCdDsDiente () {
        return cdDsDiente;
    }

    public void setCdDsDiente (List<Integer> val) {
        this.cdDsDiente = val;
    }

    public int getNmDiente () {
        return nmDiente;
    }

    public void setNmDiente (int val) {
        this.nmDiente = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
}

