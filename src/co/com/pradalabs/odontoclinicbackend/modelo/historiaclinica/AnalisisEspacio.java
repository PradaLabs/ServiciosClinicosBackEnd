package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

public class AnalisisEspacio {

    private int nmSuperiorDisponible;

    private int nmInferiorDisponible;

    private int nmSuperiorReuqerido;

    private int nmInferiorRquerido;

    private int nmSuperiorDiferencia;

    private int nmInferiorDiferencia;

    private Boolean Apinamiento;

    private int cdApinamiento;

    private Boolean snEspaciamiento;

    private int cdEspacioamiento;

    public AnalisisEspacio () {
    }

    public Boolean getApinamiento () {
        return Apinamiento;
    }

    public void setApinamiento (Boolean val) {
        this.Apinamiento = val;
    }

    public int getCdApinamiento () {
        return cdApinamiento;
    }

    public void setCdApinamiento (int val) {
        this.cdApinamiento = val;
    }

    public int getCdEspacioamiento () {
        return cdEspacioamiento;
    }

    public void setCdEspacioamiento (int val) {
        this.cdEspacioamiento = val;
    }

    public int getNmInferiorDiferencia () {
        return nmInferiorDiferencia;
    }

    public void setNmInferiorDiferencia (int val) {
        this.nmInferiorDiferencia = val;
    }

    public int getNmInferiorDisponible () {
        return nmInferiorDisponible;
    }

    public void setNmInferiorDisponible (int val) {
        this.nmInferiorDisponible = val;
    }

    public int getNmInferiorRquerido () {
        return nmInferiorRquerido;
    }

    public void setNmInferiorRquerido (int val) {
        this.nmInferiorRquerido = val;
    }

    public int getNmSuperiorDiferencia () {
        return nmSuperiorDiferencia;
    }

    public void setNmSuperiorDiferencia (int val) {
        this.nmSuperiorDiferencia = val;
    }

    public int getNmSuperiorDisponible () {
        return nmSuperiorDisponible;
    }

    public void setNmSuperiorDisponible (int val) {
        this.nmSuperiorDisponible = val;
    }

    public int getNmSuperiorReuqerido () {
        return nmSuperiorReuqerido;
    }

    public void setNmSuperiorReuqerido (int val) {
        this.nmSuperiorReuqerido = val;
    }

    public Boolean getSnEspaciamiento () {
        return snEspaciamiento;
    }

    public void setSnEspaciamiento (Boolean val) {
        this.snEspaciamiento = val;
    }

}

