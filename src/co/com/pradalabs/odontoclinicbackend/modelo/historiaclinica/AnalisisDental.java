package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;

public class AnalisisDental {

    private int cdRelaDereCanina;

    private int cdRelaDereMolar;

    private int cdRelaIzqCanina;

    private int cdRelaIzqMolar;

    private int cdOverjet;

    private int cdOverBite;

    private MorfologiaArcoDentario dsMorfologiaArcoDentario;

    private LineaMedia dsLineaMedia;

    private RelacionInterArco dsRelacionInterArco;

    private Rotaciones dsRotaciones;

    private Inclinaciones dsInclinaciones;

    private DientesAusentes dsDientesAusentes;

    private DientesErupcion DientesErupcion;

    private AnalisisEspacio dsAnalisisEspacio;

    public AnalisisDental () {
    }

    public int getCdOverBite () {
        return cdOverBite;
    }

    public void setCdOverBite (int val) {
        this.cdOverBite = val;
    }

    public int getCdOverjet () {
        return cdOverjet;
    }

    public void setCdOverjet (int val) {
        this.cdOverjet = val;
    }

    public int getCdRelaDereCanina () {
        return cdRelaDereCanina;
    }

    public void setCdRelaDereCanina (int val) {
        this.cdRelaDereCanina = val;
    }

    public int getCdRelaDereMolar () {
        return cdRelaDereMolar;
    }

    public void setCdRelaDereMolar (int val) {
        this.cdRelaDereMolar = val;
    }

    public int getCdRelaIzqCanina () {
        return cdRelaIzqCanina;
    }

    public void setCdRelaIzqCanina (int val) {
        this.cdRelaIzqCanina = val;
    }

    public int getCdRelaIzqMolar () {
        return cdRelaIzqMolar;
    }

    public void setCdRelaIzqMolar (int val) {
        this.cdRelaIzqMolar = val;
    }

    public int getCdSuperiorLineaMedia () {
        return 0;
    }

    public void setCdSuperiorLineaMedia (int val) {
    }

    public int getCdInferiorLineaMedia () {
        return 0;
    }

    public void setCdInferiorLineaMedia (int val) {
    }

    public DientesErupcion getDientesErupcion () {
        return DientesErupcion;
    }

    public void setDientesErupcion (DientesErupcion val) {
        this.DientesErupcion = val;
    }

    public AnalisisEspacio getDsAnalisisEspacio () {
        return dsAnalisisEspacio;
    }

    public void setDsAnalisisEspacio (AnalisisEspacio val) {
        this.dsAnalisisEspacio = val;
    }

    public DientesAusentes getDsDientesAusentes () {
        return dsDientesAusentes;
    }

    public void setDsDientesAusentes (DientesAusentes val) {
        this.dsDientesAusentes = val;
    }

    public Inclinaciones getDsInclinaciones () {
        return dsInclinaciones;
    }

    public void setDsInclinaciones (Inclinaciones val) {
        this.dsInclinaciones = val;
    }

    public LineaMedia getDsLineaMedia () {
        return dsLineaMedia;
    }

    public void setDsLineaMedia (LineaMedia val) {
        this.dsLineaMedia = val;
    }

    public MorfologiaArcoDentario getDsMorfologiaArcoDentario () {
        return dsMorfologiaArcoDentario;
    }

    public void setDsMorfologiaArcoDentario (MorfologiaArcoDentario val) {
        this.dsMorfologiaArcoDentario = val;
    }

    public RelacionInterArco getDsRelacionInterArco () {
        return dsRelacionInterArco;
    }

    public void setDsRelacionInterArco (RelacionInterArco val) {
        this.dsRelacionInterArco = val;
    }

    public Rotaciones getDsRotaciones () {
        return dsRotaciones;
    }

    public void setDsRotaciones (Rotaciones val) {
        this.dsRotaciones = val;
    }

}

