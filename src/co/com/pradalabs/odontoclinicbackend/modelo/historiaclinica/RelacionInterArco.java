package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class RelacionInterArco {

	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

	@Persistent
    private MordidaCruzadaPosterior dsMordidaCruzadaPosterior;

	@Persistent
    private Boolean snMordidaCruzadaAnterior;

	@Persistent
    private Boolean snMordidaAbiertaAnterior;

	@Persistent
    private MordidaAbiertaPosterior dsMordidaAbiertaPosterior;

	
    public RelacionInterArco () {
    }

    public MordidaAbiertaPosterior getDsMordidaAbiertaPosterior () {
        return dsMordidaAbiertaPosterior;
    }

    public void setDsMordidaAbiertaPosterior (MordidaAbiertaPosterior val) {
        this.dsMordidaAbiertaPosterior = val;
    }

    public MordidaCruzadaPosterior getDsMordidaCruzadaPosterior () {
        return dsMordidaCruzadaPosterior;
    }

    public void setDsMordidaCruzadaPosterior (MordidaCruzadaPosterior val) {
        this.dsMordidaCruzadaPosterior = val;
    }

    public Boolean getSnMordidaAbiertaAnterior () {
        return snMordidaAbiertaAnterior;
    }

    public void setSnMordidaAbiertaAnterior (Boolean val) {
        this.snMordidaAbiertaAnterior = val;
    }

    public Boolean getSnMordidaCruzadaAnterior () {
        return snMordidaCruzadaAnterior;
    }

    public void setSnMordidaCruzadaAnterior (Boolean val) {
        this.snMordidaCruzadaAnterior = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
    

}

