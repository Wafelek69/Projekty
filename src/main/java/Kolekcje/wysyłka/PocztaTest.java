package Kolekcje.wysyłka;

import Kolekcje.Produkt;

public class PocztaTest {

    Produkt drzwi = new Produkt("drzwi dębowe",30);
    Produkt okno = new Produkt("okno dębowe",40);
    Produkt panel = new Produkt("panel dębowy",20);
    Produkt deska = new Produkt("deska sosnowa",20);

    private Poczta poczta = new Poczta();

    public void dodanieProduktu(){
        poczta.dodaj(drzwi);
        poczta.dodaj(okno);
        System.out.println("1 test " + "\n" + poczta);
    }
        public void zamianaProduktu(){
        poczta.zamień(okno, panel);
            System.out.println("II test" + "\n" + poczta);
        }
public void zamianaNieistniejącegoProduktu(){
        poczta.zamień(okno, deska);
    System.out.println("III test"+ "\n" + poczta);
}

public void podziałNaVany(){
        Poczta pocztaVany = new Poczta();
        pocztaVany.dodaj(okno);
        pocztaVany.dodaj(drzwi);
        pocztaVany.dodaj(panel);
        pocztaVany.dodaj(deska);

        pocztaVany.przygotujPrzesyłke();
    System.out.println("IV test"+"\n"+"zawartosc malego vana: " + pocztaVany.getMałyVanProdukty());
    System.out.println("zawartość duzego vana: "+ pocztaVany.getDużyVanProdukty());
}



    public static void main(String[] args) {

        PocztaTest pocztatest = new PocztaTest();
        pocztatest.dodanieProduktu();
        pocztatest.zamianaProduktu();
        pocztatest.zamianaNieistniejącegoProduktu();
        pocztatest.podziałNaVany();

    }
}
