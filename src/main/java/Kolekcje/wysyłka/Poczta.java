package Kolekcje.wysyłka;

import Kolekcje.Produkt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Poczta implements Iterable<Produkt> {

    public static final int PRODUKT_NIE_ISTNIEJE = -1;
    public static final int MINI_VAN_MAX_WAGA = 20;
private final List<Produkt> produkty = new ArrayList<>();

private List<Produkt> małyVanProdukty;
private List<Produkt> dużyVanProdukty;

public List <Produkt> getMałyVanProdukty(){
        return małyVanProdukty;
    }
    public List <Produkt> getDużyVanProdukty(){
        return dużyVanProdukty;
    }


public void dodaj(Produkt produkt){
    produkty.add(produkt);

}
public void zamień (Produkt staryProdukt, Produkt nowyProdukt){
    int indeks = produkty.indexOf(staryProdukt);

    if(indeks != PRODUKT_NIE_ISTNIEJE){
        produkty.set(indeks, nowyProdukt);
    }else {
        System.out.println("\n" + "Nie istnieje produkt o podanym indeksie");
    }

}

public void przygotujPrzesyłke(){
    //sort według wagi
    Collections.sort(produkty, Produkt.BY_WAGA);
    //znajdz indeks produktu, ktory jako pierwszy musi byc w duzym wanie
    int indeks = znajdzIndeksPodziału();
    małyVanProdukty = produkty.subList(0, indeks);
    dużyVanProdukty = produkty.subList(indeks, produkty.size());

}
public int znajdzIndeksPodziału(){
    for (int i = 0; i <produkty.size();i++){
        if (produkty.get(i).getWaga()> MINI_VAN_MAX_WAGA){
            return i;
        }
    }
    return 0;
}
    @Override
    public Iterator<Produkt> iterator() {
        return produkty.iterator();
    }

    public String toString(){
    return produkty.toString();
    }
}
