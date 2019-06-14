package Kolekcje.biblioteka;


import java.util.List;

public class Biblioteka{



    public void dodajNaPółke(Półka półka, Książka książka){
        półka.getListaKsiążek().add(książka);
    }

    public void wypiszZawartość(Półka półka){
    //zmiana void na String//    return półka.toString();
        List<Książka> lista = półka.getListaKsiążek();
        System.out.println("Zawartosc polki: " + półka.getNumerPółki());
        for (Książka książka : lista){
            System.out.println(książka);
        }

    }

    public void przełóżKsiążkę(Półka staraPółka, Książka książka, Półka nowaPółka){
        if (staraPółka.getListaKsiążek().contains(książka)){
            staraPółka.getListaKsiążek().remove(książka);
            nowaPółka.getListaKsiążek().add(książka);
        }else {
            System.out.println("Podanej ksiazki nie ma na wskazanej półce");
        }
    }


    public void zdejmnijKsiążki(Półka półka, int indeksOd, int indeksDo) {

        List<Książka> listaKsiążek = półka.getListaKsiążek();
        if (indeksOd < listaKsiążek.size() && indeksDo <= listaKsiążek.size() && indeksOd < indeksDo) {
            List<Książka> subListaKsiążek = listaKsiążek.subList(indeksOd, indeksDo);
            listaKsiążek.removeAll(subListaKsiążek);
        } else {
            System.out.println("Błędne wartosci indeksow");
        }

    }

    public void opróżnijPółkę(Półka półka){
        półka.getListaKsiążek().clear();

    }

    public int liczbaPozycjiNaPółce(Półka półka){

        return półka.getListaKsiążek().size();

    }

    public int numerPozycjiNaPółce(Książka książka,Półka półka){

        return półka.getListaKsiążek().indexOf(książka);
    }

}
