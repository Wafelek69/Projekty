package Kolekcje.RejestrOsób;

public class RejestrOsóbTest {


    Osoba osoba1 = new Osoba("Wawrzak",40);
    Osoba osoba2 = new Osoba("Nowak", 45);
    Osoba osoba3 = new Osoba("Warcin",30);
    Osoba osoba4 = new Osoba("Pająk",40);
    Osoba osoba5 = new Osoba("Kowalczyk",50);
    Osoba osoba6 = new Osoba("Garon",25);

    RejestrOsób rejestrOsób = new RejestrOsób();

    public void dodajOsobe(){
        rejestrOsób.dodajOsobe(osoba1);
        rejestrOsób.dodajOsobe(osoba2);
        rejestrOsób.dodajOsobe(osoba3);
        rejestrOsób.dodajOsobe(osoba4);
        rejestrOsób.dodajOsobe(osoba5);
        rejestrOsób.dodajOsobe(osoba6);
        System.out.println("I test: "+ rejestrOsób);
    }

    public void usuńOsobe(){
        rejestrOsób.usuńOsobe(osoba1);
        System.out.println("II test "+ rejestrOsób);
    }

    public void usuńOsobeBrak(){
        rejestrOsób.usuńOsobe(new Osoba("Pietrzyk",40));
        System.out.println("III test "+ rejestrOsób);
    }
    public void wypiszListę(){
        System.out.println("IV test: ");
        rejestrOsób.wypiszListę();
    }

    public void znajdźOsobę(){
        System.out.println("V test: ");
        System.out.println(rejestrOsób.znajdźOsobę("Warcin"));

    }
    public void znajdźOsobęBrak(){
        System.out.println("VI Test: ");
        System.out.println(rejestrOsób.znajdźOsobę("koko"));
    }

    public void avg(){
        System.out.println("VII test: ");
        System.out.println(rejestrOsób.avg());

    }
    public void min (){
        System.out.println("VIII test: " +rejestrOsób.min());
    }
    public void max (){
        System.out.println("IX test: "+ rejestrOsób.max());
    }



    ///////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        RejestrOsóbTest rejestrOsóbTest = new RejestrOsóbTest();
        rejestrOsóbTest.dodajOsobe();
        rejestrOsóbTest.usuńOsobe();
        rejestrOsóbTest.usuńOsobeBrak();
        rejestrOsóbTest.wypiszListę();
        rejestrOsóbTest.znajdźOsobę();
        rejestrOsóbTest.znajdźOsobęBrak();
        rejestrOsóbTest.avg();
        rejestrOsóbTest.min();
        rejestrOsóbTest.max();






    }

}
