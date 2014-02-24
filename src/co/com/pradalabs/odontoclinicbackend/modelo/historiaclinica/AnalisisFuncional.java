package co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica;


public class AnalisisFuncional {

    private Habito dsHabitos;

    private ExamenATM dsExamenATM;

    private PalpitacionArticular dsPalpitacionArticular;

    public AnalisisFuncional () {
    }

    public ExamenATM getDsExamenATM () {
        return dsExamenATM;
    }

    public void setDsExamenATM (ExamenATM val) {
        this.dsExamenATM = val;
    }

    public Habito getDsHabitos () {
        return dsHabitos;
    }

    public void setDsHabitos (Habito val) {
        this.dsHabitos = val;
    }

    public PalpitacionArticular getDsPalpitacionArticular () {
        return dsPalpitacionArticular;
    }

    public void setDsPalpitacionArticular (PalpitacionArticular val) {
        this.dsPalpitacionArticular = val;
    }

}

