package Kolekcje.biblioteka;

public class BibliotekaTest {

        public final static int BRAK_KSIAŻKI_NA_PÓŁCE = -1;

        Książka książka1 = new Książka("Adam Mickiewicz", "Warcin I");
        Książka książka2 = new Książka("Adam Adamowicz", "Warcin II");
        Książka książka3 = new Książka("Adam Nijaki", "Warcin III");
        Książka książka4 = new Książka("Adam Noname", "Warcin IV");
        Książka książka5 = new Książka("Adam Noname", "Warcin V");

        Półka półka1 = new Półka(1);
        Półka półka2 = new Półka(2);
        Półka półka3 = new Półka(3);
        Półka półka4 = new Półka(4);

        private Biblioteka biblioteka = new Biblioteka();

        public void dodanieNaPółkę(){
            biblioteka.dodajNaPółke(półka1,książka1);
            biblioteka.dodajNaPółke(półka2,książka2);
            biblioteka.dodajNaPółke(półka3, książka3);
            biblioteka.dodajNaPółke(półka3,książka4);
            biblioteka.dodajNaPółke(półka2,książka3);
            biblioteka.dodajNaPółke(półka4, książka4);
            biblioteka.dodajNaPółke(półka3,książka1);
            biblioteka.dodajNaPółke(półka1,książka2);

            System.out.println("I test: "+"\n" + półka1 + "\n"+półka2+"\n"+półka3+"\n"+półka4);
        }

    public void wypiszZawartość(){
        System.out.println("II test: ");
        biblioteka.wypiszZawartość(półka3);


    }

    public void przełóżKsiążkę(){
        System.out.println("III test: ");
        biblioteka.przełóżKsiążkę(półka2,książka2,półka3);
        System.out.println(półka2);
        System.out.println(półka3);
    }

    public void przełóżKsiążkęNull(){
        System.out.println("IV test: ");
        biblioteka.przełóżKsiążkę(półka2,książka2,półka1);
        System.out.println(półka2);
        System.out.println(półka1);
    }

    public void zdejmijKsiążki(){
        System.out.println("V test: " + półka3);
        biblioteka.zdejmnijKsiążki(półka3, 1,3);
        System.out.println("V test: post " + półka3);
    }

    public void opróżnijPółkę(){
        System.out.println("VI test: "+półka3);
        biblioteka.opróżnijPółkę(półka3);
        System.out.println("VI  test: " + półka3);
    }

    public void liczbaPozycjiNaPółce(){

        System.out.println("VII test: Liczba książek na półce " + biblioteka.liczbaPozycjiNaPółce(półka4) );
    }

    public void numerPozycjiNaPółce(){
        System.out.println("VIII test ");
        int wynik = biblioteka.numerPozycjiNaPółce(książka2,półka1);
        if (wynik != BRAK_KSIAŻKI_NA_PÓŁCE){
            System.out.println(wynik);
        }else {
            System.out.println("Na wybranej półce nie ma takie pozycji");
        }

    }



    public static void main(String[] args) {

            BibliotekaTest bibliotekaTest = new BibliotekaTest();
            bibliotekaTest.dodanieNaPółkę();
            bibliotekaTest.wypiszZawartość();
            bibliotekaTest.przełóżKsiążkę();
            bibliotekaTest.przełóżKsiążkęNull();
            bibliotekaTest.zdejmijKsiążki();
            bibliotekaTest.opróżnijPółkę();
            bibliotekaTest.liczbaPozycjiNaPółce();
            bibliotekaTest.numerPozycjiNaPółce();


    }

}
