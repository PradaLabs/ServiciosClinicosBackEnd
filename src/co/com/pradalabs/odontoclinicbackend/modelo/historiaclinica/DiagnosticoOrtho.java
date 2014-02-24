package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

public class DiagnosticoOrtho {

    private String dsFacial;

    private String dsFuncional;

    private String dsEsqueletico;

    private String dsDental;

    private Boolean snTratamientoComplicado;

    private String dsTratamientoComplicado;

    public DiagnosticoOrtho () {
    }

    public String getDsDental () {
        return dsDental;
    }

    public void setDsDental (String val) {
        this.dsDental = val;
    }

    public String getDsEsqueletico () {
        return dsEsqueletico;
    }

    public void setDsEsqueletico (String val) {
        this.dsEsqueletico = val;
    }

    public String getDsFacial () {
        return dsFacial;
    }

    public void setDsFacial (String val) {
        this.dsFacial = val;
    }

    public String getDsFuncional () {
        return dsFuncional;
    }

    public void setDsFuncional (String val) {
        this.dsFuncional = val;
    }

    public String getDsTratamientoComplicado () {
        return dsTratamientoComplicado;
    }

    public void setDsTratamientoComplicado (String val) {
        this.dsTratamientoComplicado = val;
    }

    public Boolean getSnTratamientoComplicado () {
        return snTratamientoComplicado;
    }

    public void setSnTratamientoComplicado (Boolean val) {
        this.snTratamientoComplicado = val;
    }

}

