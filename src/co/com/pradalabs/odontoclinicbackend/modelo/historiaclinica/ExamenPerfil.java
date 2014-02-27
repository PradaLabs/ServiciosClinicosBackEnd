package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;


@PersistenceCapable
public class ExamenPerfil {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
 
	@Persistent
    private String dsPerfil;

	@Persistent
    private int cdPerfil;

	@Persistent
    private HipertoniaLabial dsHipertoniaLabial;

	@Persistent
    private String dsPosicionLabial;

	@Persistent
    private int cdPosicionLabial;

	@Persistent
    private String dsLabiosReposo;

	@Persistent
    private int cdLabiosReposo;

	@Persistent
    private String dsHipotoniaLabial;

	@Persistent
    private int cdHipotoniaLabial;

	@Persistent
    private FrenilloSobreInsertado dsFrenilloSobreInsertado;

    public ExamenPerfil () {
    }

    public int getCdHipotoniaLabial () {
        return cdHipotoniaLabial;
    }

    public void setCdHipotoniaLabial (int val) {
        this.cdHipotoniaLabial = val;
    }

    public int getCdLabiosReposo () {
        return cdLabiosReposo;
    }

    public void setCdLabiosReposo (int val) {
        this.cdLabiosReposo = val;
    }

    public int getCdPerfil () {
        return cdPerfil;
    }

    public void setCdPerfil (int val) {
        this.cdPerfil = val;
    }

    public int getCdPosicionLabial () {
        return cdPosicionLabial;
    }

    public void setCdPosicionLabial (int val) {
        this.cdPosicionLabial = val;
    }

    public FrenilloSobreInsertado getDsFrenilloSobreInsertado () {
        return dsFrenilloSobreInsertado;
    }

    public void setDsFrenilloSobreInsertado (FrenilloSobreInsertado val) {
        this.dsFrenilloSobreInsertado = val;
    }

    public HipertoniaLabial getDsHipertoniaLabial () {
        return dsHipertoniaLabial;
    }

    public void setDsHipertoniaLabial (HipertoniaLabial val) {
        this.dsHipertoniaLabial = val;
    }

    public String getDsHipotoniaLabial () {
        return dsHipotoniaLabial;
    }

    public void setDsHipotoniaLabial (String val) {
        this.dsHipotoniaLabial = val;
    }

    public String getDsLabiosReposo () {
        return dsLabiosReposo;
    }

    public void setDsLabiosReposo (String val) {
        this.dsLabiosReposo = val;
    }

    public String getDsPerfil () {
        return dsPerfil;
    }

    public void setDsPerfil (String val) {
        this.dsPerfil = val;
    }

    public String getDsPosicionLabial () {
        return dsPosicionLabial;
    }

    public void setDsPosicionLabial (String val) {
        this.dsPosicionLabial = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
}

