package klasy;

public class Książka {

    private String nazwiskoAutora;
    private String tytul;


    public Książka(String nazwiskoAutora, String tytul) {
        this.nazwiskoAutora = nazwiskoAutora;
        this.tytul = tytul;
    }


    public String getNazwiskoAutora() {
        return nazwiskoAutora;
    }

    public void setNazwiskoAutora(String nazwiskoAutora) {
        this.nazwiskoAutora = nazwiskoAutora;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }


    public static void wypiszWszystkieKsiążki(String znak, Książka... listaKsiążek) {
        for (Książka książka : listaKsiążek) {
            if (książka.getNazwiskoAutora().startsWith(znak)) {
                System.out.print(książka.getNazwiskoAutora() + " ");
                System.out.println(książka.getTytul());
            }
        }
    }


    public static void wypiszWszystkieKsiążki(Książka... listaKsiążek) {

        for (Książka książka : listaKsiążek) {
            System.out.print(książka.getNazwiskoAutora() + " ");
            System.out.println(książka.getTytul());
        }
    }


    ////////////////////////MAIN///////////////////////////
    public static void main(String[] args) {

        Książka książka1 = new Książka("Sienkiewicz", "W pustyni i w puszczy");
        Książka książka2 = new Książka("Mickiewicz ", "Pan Tadeusz");
        Książka książka3 = new Książka("Tolkien", "Władca Pierścieni");
        Książka książka4 = new Książka("Sienkiewicz", "Ognien i Mieczem");


        wypiszWszystkieKsiążki(książka1, książka2, książka3);
        System.out.println("--------");
        wypiszWszystkieKsiążki("S", książka1, książka2, książka3, książka4);


    }

}
