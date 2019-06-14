package Kolekcje.katalog;

import Kolekcje.Produkt;

import java.util.ArrayList;
import java.util.List;

public class Dostawca {

    private String nazwa;
    private List<Produkt> ListaProdutków = new ArrayList<>();

    public Dostawca(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<Produkt> getListaProdutków() {
        return ListaProdutków;
    }

    public void setListaProdutków(List<Produkt> listaProdutków) {
        ListaProdutków = listaProdutków;
    }

    @Override
    public String toString() {
        return "Dostawca{" +
                "nazwa='" + nazwa + '\'' +
                ", ListaProdutków=" + ListaProdutków +
                '}';
    }
}
