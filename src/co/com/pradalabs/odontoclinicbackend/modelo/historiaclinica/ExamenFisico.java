package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;



@PersistenceCapable
public class ExamenFisico {

		
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private String dsExamenFisico;

	@Persistent
    private String dsTbCarrillo;

	@Persistent
    private String dsTbFrenillo;

	@Persistent
    private String dsTbLengua;

	@Persistent
    private String dsTbPaladar;

	@Persistent
    private String dsTbEncia;

	@Persistent
    private String dsMoColor;

	@Persistent
    private String dsTbMoTextura;

	@Persistent
    private String dsRecilencia;

	@Persistent
    private String Saliva;

    public ExamenFisico () {
    }

    public String getSaliva () {
        return Saliva;
    }

    public void setSaliva (String val) {
        this.Saliva = val;
    }

    public String getDsExamenFisico () {
        return dsExamenFisico;
    }

    public void setDsExamenFisico (String val) {
        this.dsExamenFisico = val;
    }

    public String getDsMoColor () {
        return dsMoColor;
    }

    public void setDsMoColor (String val) {
        this.dsMoColor = val;
    }

    public String getDsRecilencia () {
        return dsRecilencia;
    }

    public void setDsRecilencia (String val) {
        this.dsRecilencia = val;
    }

    public String getDsTbCarrillo () {
        return dsTbCarrillo;
    }

    public void setDsTbCarrillo (String val) {
        this.dsTbCarrillo = val;
    }

    public String getDsTbEncia () {
        return dsTbEncia;
    }

    public void setDsTbEncia (String val) {
        this.dsTbEncia = val;
    }

    public String getDsTbFrenillo () {
        return dsTbFrenillo;
    }

    public void setDsTbFrenillo (String val) {
        this.dsTbFrenillo = val;
    }

    public String getDsTbLengua () {
        return dsTbLengua;
    }

    public void setDsTbLengua (String val) {
        this.dsTbLengua = val;
    }

    public String getDsTbMoTextura () {
        return dsTbMoTextura;
    }

    public void setDsTbMoTextura (String val) {
        this.dsTbMoTextura = val;
    }

    public String getDsTbPaladar () {
        return dsTbPaladar;
    }

    public void setDsTbPaladar (String val) {
        this.dsTbPaladar = val;
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
    
}

