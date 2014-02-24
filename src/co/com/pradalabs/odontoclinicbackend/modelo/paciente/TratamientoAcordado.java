package co.com.pradalabs.odontoclinicbackend.modelo.paciente;

public class TratamientoAcordado {

    private int cdCodigo;

    private String cdTratamiento;

    private String dsTratamiento;

    private Double vrPrecio;

    private Boolean snDescuento;

    private int nmDescuento;

    private int cdAutorizador;

    private Boolean snEfectivo;

    private int cdDoctor;

    private String dsDoctor;

    private int nmTratamiento;

    private String dsFirmaPaciente;

    private String dsFrimaProfesional;

    public TratamientoAcordado () {
    }

    public int getCdAutorizador () {
        return cdAutorizador;
    }

    public void setCdAutorizador (int val) {
        this.cdAutorizador = val;
    }

    public int getCdCodigo () {
        return cdCodigo;
    }

    public void setCdCodigo (int val) {
        this.cdCodigo = val;
    }

    public int getCdDoctor () {
        return cdDoctor;
    }

    public void setCdDoctor (int val) {
        this.cdDoctor = val;
    }

    public String getCdTratamiento () {
        return cdTratamiento;
    }

    public void setCdTratamiento (String val) {
        this.cdTratamiento = val;
    }

    public String getDsDoctor () {
        return dsDoctor;
    }

    public void setDsDoctor (String val) {
        this.dsDoctor = val;
    }

    public String getDsFirmaPaciente () {
        return dsFirmaPaciente;
    }

    public void setDsFirmaPaciente (String val) {
        this.dsFirmaPaciente = val;
    }

    public String getDsFrimaProfesional () {
        return dsFrimaProfesional;
    }

    public void setDsFrimaProfesional (String val) {
        this.dsFrimaProfesional = val;
    }

    public String getDsTratamiento () {
        return dsTratamiento;
    }

    public void setDsTratamiento (String val) {
        this.dsTratamiento = val;
    }

    public int getNmDescuento () {
        return nmDescuento;
    }

    public void setNmDescuento (int val) {
        this.nmDescuento = val;
    }

    public int getNmTratamiento () {
        return nmTratamiento;
    }

    public void setNmTratamiento (int val) {
        this.nmTratamiento = val;
    }

    public Boolean getSnDescuento () {
        return snDescuento;
    }

    public void setSnDescuento (Boolean val) {
        this.snDescuento = val;
    }

    public Boolean getSnEfectivo () {
        return snEfectivo;
    }

    public void setSnEfectivo (Boolean val) {
        this.snEfectivo = val;
    }

    public Double getVrPrecio () {
        return vrPrecio;
    }

    public void setVrPrecio (Double val) {
        this.vrPrecio = val;
    }

}

