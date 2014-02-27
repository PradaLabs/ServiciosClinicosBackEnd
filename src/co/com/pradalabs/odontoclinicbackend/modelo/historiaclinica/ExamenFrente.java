package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class ExamenFrente {

	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private String dsTipoCara;

	@Persistent
    private int cdTipoCara;

	@Persistent
    private Boolean snAsimetriaFrente;

	@Persistent
    private String dsAsimetriaFrente;

	@Persistent
    private String dsLeptoprosopo;

	@Persistent
    private int cdLeptoprosopo;

	@Persistent
    private String dsTipoSonrisa;

	@Persistent
    private int cdTipoSonrisa;

    public ExamenFrente () {
    }

    public int getCdLeptoprosopo () {
        return cdLeptoprosopo;
    }

    public void setCdLeptoprosopo (int val) {
        this.cdLeptoprosopo = val;
    }

    public int getCdTipoCara () {
        return cdTipoCara;
    }

    public void setCdTipoCara (int val) {
        this.cdTipoCara = val;
    }

    public int getCdTipoSonrisa () {
        return cdTipoSonrisa;
    }

    public void setCdTipoSonrisa (int val) {
        this.cdTipoSonrisa = val;
    }

    public String getDsAsimetriaFrente () {
        return dsAsimetriaFrente;
    }

    public void setDsAsimetriaFrente (String val) {
        this.dsAsimetriaFrente = val;
    }

    public String getDsLeptoprosopo () {
        return dsLeptoprosopo;
    }

    public void setDsLeptoprosopo (String val) {
        this.dsLeptoprosopo = val;
    }

    public String getDsTipoCara () {
        return dsTipoCara;
    }

    public void setDsTipoCara (String val) {
        this.dsTipoCara = val;
    }

    public String getDsTipoSonrisa () {
        return dsTipoSonrisa;
    }

    public void setDsTipoSonrisa (String val) {
        this.dsTipoSonrisa = val;
    }

    public Boolean getSnAsimetriaFrente () {
        return snAsimetriaFrente;
    }

    public void setSnAsimetriaFrente (Boolean val) {
        this.snAsimetriaFrente = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
}

