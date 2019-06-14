package klasy;

public class Człowiek {


    private String imie;


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }


    @Override
    public String toString() {
        return "Człowiek{" +
                "imie='" + imie + '\'' +
                '}';
    }



}
