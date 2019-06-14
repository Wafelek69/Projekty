package Kolekcje.RejestrOsób;

import java.util.*;

public class RejestrOsób {

    private List<Osoba> listaOsób = new ArrayList<>();




    public void dodajOsobe(Osoba osoba){
        listaOsób.add(osoba);
    }

    public String toString(){
        return listaOsób.toString();
    }

    public void usuńOsobe(Osoba osoba){
        if (listaOsób.contains(osoba)){
            listaOsób.remove(osoba);
        }
        else{
            System.out.println("Takiej osoby nie ma na liscie ");
        }
    }

    public void wypiszListę(){
        Iterator<Osoba> Iterator = listaOsób.iterator();
        while (Iterator.hasNext()){
            System.out.println(Iterator.next());
        }
    }
    public Osoba znajdźOsobę(String imie){
        for (Osoba osoba : listaOsób){
            if (osoba.getImie().equalsIgnoreCase(imie)){
                return osoba;
            }
        }
        System.out.println("Na liscie nie ma takiej osoby ");
        return null;
    }

    public int avg(){
        int wiek = 0;
        for (Osoba osoba : listaOsób){
            wiek += osoba.getWiek();
        }
        int średniWiek = wiek / listaOsób.size();
        return średniWiek;
    }

    public Osoba min(){

        Osoba najmłodszy = listaOsób.get(0);
        for (Osoba osoba : listaOsób){
            if (osoba.getWiek() < najmłodszy.getWiek()){
                najmłodszy = osoba;
            }
        }
        return najmłodszy;
    }
    public Osoba max(){

        Osoba najstarszy = listaOsób.get(0);
        for (Osoba osoba : listaOsób){
            if (osoba.getWiek() > najstarszy.getWiek()){
                najstarszy = osoba;
            }
        }
        return najstarszy;

    }

    public Optional<Osoba> maxJava8(){
        return listaOsób.stream().max(Comparator.comparing(osoba -> osoba.getWiek()));
    }


}
