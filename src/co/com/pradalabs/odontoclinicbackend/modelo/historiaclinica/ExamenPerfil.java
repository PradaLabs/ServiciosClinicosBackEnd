package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

public class ExamenPerfil {

    private String dsPerfil;

    private int cdPerfil;

    private HipertoniaLabial dsHipertoniaLabial;

    private String dsPosicionLabial;

    private int cdPosicionLabial;

    private String dsLabiosReposo;

    private int cdLabiosReposo;

    private String dsHipotoniaLabial;

    private int cdHipotoniaLabial;

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

}

