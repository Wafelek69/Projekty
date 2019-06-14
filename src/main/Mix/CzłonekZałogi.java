package klasy;

public class CzłonekZałogi extends Człowiek {

    private Stanowisko stanowisko;

    public CzłonekZałogi(Stanowisko stanowisko) {
        this.stanowisko = stanowisko;
    }

    public CzłonekZałogi(){}


    public Stanowisko getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(Stanowisko stanowisko) {
        this.stanowisko = stanowisko;
    }





}
