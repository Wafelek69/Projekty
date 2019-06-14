package Kolekcje.katalog;

import Kolekcje.Produkt;

public class KatalogProduktówTest {

    public static Produkt drzwi = new Produkt("Drzwi dębowe", 30);
    public static Produkt okno = new Produkt("Okno dębowe", 40);
    public static Produkt panel = new Produkt("panel dębowy", 5);
    public static Produkt deska = new Produkt("deska", 5);


    public static Dostawca jan = new Dostawca("U Jana");
    public static Dostawca zosia = new Dostawca("Drewno Zosi");

    static {
        jan.getListaProdutków().add(drzwi);
        jan.getListaProdutków().add(drzwi);
        jan.getListaProdutków().add(drzwi);
        jan.getListaProdutków().add(okno);
        jan.getListaProdutków().add(okno);
        jan.getListaProdutków().add(panel);
        jan.getListaProdutków().add(new Produkt("Drzwi dębowe",30));
        jan.getListaProdutków().add(deska);

        zosia.getListaProdutków().add(panel);
        zosia.getListaProdutków().add(panel);
        zosia.getListaProdutków().add(deska);
        zosia.getListaProdutków().add(deska);
        zosia.getListaProdutków().add(deska);

        }

    public static void main(String[] args) {

        KatalogProduktów katalogProduktów = new KatalogProduktów();

        katalogProduktów.zapewnianyPrzez(jan);
        System.out.println("lista" + katalogProduktów.listaProduktów);
        System.out.println("set"+ katalogProduktów.setProduktów);

        if (drzwi.equals(new Produkt("Drzwi dębowe", 30))){
            System.out.println("równe ");

        }else {
            System.out.println("inne ");
        }

        System.out.println(katalogProduktów.produktyMałyVan());
        System.out.println(katalogProduktów.produktyDuzyVan());




    }
}
