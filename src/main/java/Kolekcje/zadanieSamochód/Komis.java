package Kolekcje.zadanieSamochód;


import java.util.*;

public class Komis {

    List<Samochód> listaSamochodów = new ArrayList<>();
    Set<Samochód> setSamochodów = new HashSet<>();
    SortedSet<Samochód>sortSamochodow= new TreeSet<>(Samochód.BY_ROK);

  public static Samochód samochód1 = new Samochód("Audi","80",2010,12000);
  public static Samochód samochód2 = new Samochód("Peugeot","206",2005,9000);
  public static Samochód samochód3 = new Samochód("Peugeot","306",2010,10000);
  public static Samochód samochód4 = new Samochód("BMW","E46",2015,20000);
  public static Samochód samochód5 = new Samochód("BMW","E60",2016,25000);
  public static Samochód samochód6 = new Samochód("Fiat","Bravo II",2010,20000);
  public static Samochód samochód7 = new Samochód("Fiat","Bravo II",2009,18000);
  public static Samochód samochód8 = new Samochód("Ford","Fiesta",2009, 14000);
  public static Samochód samochód9 = new Samochód("Audi","A4",2010,20000);
  public static Samochód samochód10 = new Samochód("Toyota","Avensis",2019, 80000);
  public static Samochód samochód11 = new Samochód("Opel","Astra",2002,10000);
  public static Samochód samochód12 = new Samochód("Opel","Astra",2000,8000);



    public void dodajSamochód(Samochód samochód){
        listaSamochodów.add(samochód);
        sortSamochodow.add(samochód);
        setSamochodów.add(samochód);


    }

    public void kupionoSamochód(Samochód  samochód){
        if (listaSamochodów.contains(samochód)){
            listaSamochodów.remove(samochód);
            setSamochodów.remove(samochód);
            sortSamochodow.remove(samochód);
            System.out.println("Kupiono: "+samochód);

        }else {
            System.out.println("Nie ma takiego samochodu: ");
        }
    }


public List<Samochód> znajdzSamochodyMarki(String marka){
        List<Samochód> znajdzSamochodyMarki= new ArrayList<>();
        for (Samochód samochód: listaSamochodów){
            if(samochód.getMarka().equals(marka)){
                znajdzSamochodyMarki.add(samochód);
            }
        }
        if (znajdzSamochodyMarki.isEmpty()){
            System.out.println("Nie ma takiej marki w komisie: ");
        }
        return znajdzSamochodyMarki;
}

    public List<Samochód> znajdzSamochodyMarkiIModelu(String marka, String model){
        List<Samochód> znajdzSamochodyMarki= new ArrayList<>();
        for (Samochód samochód: listaSamochodów){
            if(samochód.getMarka().equals(marka)){
                znajdzSamochodyMarki.add(samochód);
            }
            if (samochód.getModel().equals(model)){
                znajdzSamochodyMarki.add(samochód);
            }
        }
        if (znajdzSamochodyMarki.isEmpty()){
            System.out.println("Brak wprowadzonej poprawnie marki lub modelu: ");
        }
        return znajdzSamochodyMarki;
    }


    public Set<Samochód> znajdzSamochodZPrzedzialuLat(int rokOd, int rokDo) {
        if (rokOd<rokDo){
            Samochód samochódod = null;
            Samochód samochóddo = null;

            for (Samochód samochód : sortSamochodow){
                if (samochód.getRokProdukcji()>= rokOd){
                    samochódod = samochód;
                    break;
                }
            }
            if (samochódod == null){
                System.out.println("Błąd ! ");
            }

            for (Samochód samochód :sortSamochodow){
                if (samochód.getRokProdukcji() <= rokDo){
                    samochóddo = samochód;
                }
            }

            Set<Samochód> set  = new TreeSet<>(Samochód.BY_ROK);
            for (Samochód samochód : sortSamochodow){
                if(samochód.getRokProdukcji()>= samochódod.getRokProdukcji()
                        &&samochód.getRokProdukcji() <= samochóddo.getRokProdukcji()){
                    set.add(samochód);
                }
            }
            return set;
        }

        else {
            System.out.println("Błędne dane wejsciowe ");
            return null;
        }

    }

    public List<Samochód> znajdzSamochodyDoKwoty(int cena){

        List<Samochód> znajdz= new ArrayList<>();
        for (Samochód samochód: sortSamochodow){
            if(samochód.getCena()<=(cena)){
                znajdz.add(samochód);
            }
        }
        if (znajdz.isEmpty()){
            System.out.println("Brak samochodów w tej cenie: ");
        }

        return znajdz;
    }

    public Set<Samochód>wypiszDostepneSamochody(){
        for(Samochód samochód :setSamochodów){
            System.out.println(samochód);
        }
     return setSamochodów;
    }



    ///////////////////////////////////////MAIN
    public static void main(String[] args) {

    Komis komis = new Komis();

    komis.dodajSamochód(samochód1);
    komis.dodajSamochód(samochód2);
    komis.dodajSamochód(samochód3);
    komis.dodajSamochód(samochód4);
    komis.dodajSamochód(samochód5);
    komis.dodajSamochód(samochód6);
    komis.dodajSamochód(samochód7);
    komis.dodajSamochód(samochód8);
    komis.dodajSamochód(samochód9);
    komis.dodajSamochód(samochód10);
    komis.dodajSamochód(samochód11);
    komis.dodajSamochód(samochód12);

//        System.out.println("Aktualna lista samochodów: " + komis.listaSamochodów);
//        komis.kupionoSamochód(samochód1);
//        System.out.println("Aktualna lista samochodów do kupienia: "+ komis.listaSamochodów);
//
//        System.out.println(komis.znajdzSamochodyMarki("Fiat"));
//        System.out.println(komis.znajdzSamochodyMarkiIModelu("Fiat","Bravo II"));
//        System.out.println(komis.znajdzSamochodZPrzedzialuLat(2000,2019));
//        System.out.println(komis.znajdzSamochodyDoKwoty(12000));
        komis.wypiszDostepneSamochody();
















    }
}
