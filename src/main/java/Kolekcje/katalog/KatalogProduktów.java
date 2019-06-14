package Kolekcje.katalog;

import Kolekcje.Produkt;

import java.util.*;

import static Kolekcje.Produkt.BY_WAGA;

public class KatalogProduktów implements Iterable{

    public SortedSet<Produkt> setProduktów = new TreeSet<>(BY_WAGA);
    public List <Produkt> listaProduktów = new ArrayList<>();
    public void zapewnianyPrzez(Dostawca dostawca){
        listaProduktów = dostawca.getListaProdutków();
        setProduktów.addAll(listaProduktów);

    }

    public Set <Produkt> produktyMałyVan(){
        Produkt najciezszyWMałymVanie = najciezszyWMałyVanie();
        return setProduktów.headSet(najciezszyWMałymVanie);
    }

    public Set <Produkt> produktyDuzyVan(){
        return setProduktów.tailSet(najciezszyWMałyVanie());
    }

    public Produkt najciezszyWMałyVanie (){
        for (Produkt produkt : setProduktów){
            if (produkt.getWaga()> 10 ){
                return produkt;
            }
        }
        return setProduktów.last();
    }


    @Override
    public Iterator iterator() {
        return setProduktów.iterator();
    }
}
