package Kolekcje.ZadanieHash;



public class HashSetLearnTest {



    Osoba osoba1 = new Osoba("Marcin","Wawrzak",40);
    Osoba osoba2 = new Osoba("Piotrk","Nowak", 45);
    Osoba osoba3 = new Osoba("Piotr","Warcin",70);
    Osoba osoba4 = new Osoba("Adam","Pajak",65);
    Osoba osoba5 = new Osoba("Piotr","Kowalczyk",50);
    Osoba osoba6 = new Osoba("Adam","Garon",25);

    HashSetLearn hashSetLearn = new HashSetLearn();

    public void dodajOsobe(){
        hashSetLearn.dodajOsobe(osoba1);
        hashSetLearn.dodajOsobe(osoba1);
        hashSetLearn.dodajOsobe(osoba2);
        hashSetLearn.dodajOsobe(osoba3);
        hashSetLearn.dodajOsobe(osoba4);
        hashSetLearn.dodajOsobe(osoba5);
        hashSetLearn.dodajOsobe(osoba6);
        hashSetLearn.dodajOsobe(osoba6);
        System.out.println("I test: "+ hashSetLearn);
    }

    public void usuńOsobe(){
        hashSetLearn.usuńOsobe(osoba2);
        System.out.println("II test" + hashSetLearn);
    }

    public void zwróćSeta(){
        System.out.println("III test: "+ hashSetLearn.zwrócSeta(40,70));

    }
    public void usuńZSeta(){

        hashSetLearn.usuńZSeta(hashSetLearn.zwrócSeta(30,70));
        System.out.println("IV test: " + hashSetLearn.setOsob);
    }



    public static void main(String[] args) {
        HashSetLearnTest hashSetLearnTest = new HashSetLearnTest();
        hashSetLearnTest.dodajOsobe();
        hashSetLearnTest.usuńOsobe();
        hashSetLearnTest.zwróćSeta();
        hashSetLearnTest.usuńZSeta();

    }




}
