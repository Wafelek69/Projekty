package klasy;
import static klasy.Lot.getWszyscyPasażerowie;
import static klasy.Lot.resetWszyscyPasażerowie;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        //Lot ktwToSfc = new Lot();
        //Lot nycToWaw = new Lot();


//        ktwToSfc.dodajPasażera();
//        //ktwToSfc = nycToWaw;
//        //System.out.println(ktwToSfc.getLiczbaPasazerow());
//
//        nycToWaw.setLiczbaPasazerow(200);
//        //System.out.println(nycToWaw.getLiczbaPasazerow());
//        Pasażer jasiek = new Pasażer();
//        jasiek.setPodrecznyBagaż(2);
//        jasiek.setRejestrowanyBagaż(1);
//
//        System.out.println(jasiek.getPodrecznyBagaż());
//        System.out.println(jasiek.getRejestrowanyBagaż());
//
//        Pasażer kasia = new Pasażer(2);
//        System.out.println(kasia.getPodrecznyBagaż());
//        Pasażer Marcin = new Pasażer(2,2);
//        System.out.println(Marcin.getPodrecznyBagaż());
//        System.out.println(Marcin.getRejestrowanyBagaż());
//
//        //prywatny Pasażer Tomek = new Pasażer(12.5);
//        Pasażer Grzes = new Pasażer(2);
//        System.out.println(Grzes.getPodrecznyBagaż());
//        System.out.println(Grzes.getOplataZaBagaż());


//        Pasażer pasażer = new Pasażer(2, 3);
//        Pasażer pasażer1 = new Pasażer(3, 1);
//        Pasażer pasażer2 = new Pasażer(2, 2);

//        ktwToSfc.dodajPasażera();
//        ktwToSfc.dodajPasażera(2);
//        ktwToSfc.dodajPasażera(pasażer);
//
//        System.out.println(ktwToSfc.getLiczbaPasazerow());
//        System.out.println(ktwToSfc.getRejestrowanyBagaż());
//
//        ktwToSfc.dodajPasażerów(pasażer, pasażer1, pasażer2);
//
//        System.out.println(ktwToSfc.getLiczbaPasazerow());
//        System.out.println(ktwToSfc.getRejestrowanyBagaż());


//        LotCargo lotCargo = new LotCargo();
//
//        lotCargo.dodajPaczkę(3,4,10);
//        lotCargo.dodajPasażera();
//
//        System.out.println(lotCargo.getUżywaPrzesrzeńCargo());
//        System.out.println(lotCargo.getLiczbaPasazerow());
//
//
//        Lot lot =new LotCargo();
//        lot.dodajPasażera();
//
//        Lot [] tablicaLotow = new Lot [1];
//        tablicaLotow[0] = new Lot();
//        tablicaLotow[1]= new LotCargo();
//

//        Lot lot = new Lot ();
//        System.out.println(lot.getSiedzenia());

        //LotCargo lotCargo = new LotCargo();
       // System.out.println(lotCargo.getSiedzenia());


//        Lot lotMix = new LotCargo();
//        System.out.println(lotMix.getSiedzenia());
//
//        Pasażer pasażer = new Pasażer(5,5);
//
//        System.out.println(pasażer);
//        System.out.println(pasażer.getClass());
//
//        System.out.println("============");
//
//        Lot lot5 = new Lot (175);
//
//        String lokalizacja = "Barcelona";
//
//        StringBuilder sb =  new StringBuilder(40);
//        sb.append("Lecę do: ");
//        sb.append(lokalizacja);
//        sb.append(" na pokładzie ");
//        sb.append(lot5);
//
//
//        int czas = 8;
//
//        int indeks = sb.length() - " na pokładzie ".length() - lot5.toString().length();
//
//        sb.insert(indeks, " o ");
//        sb.insert(indeks +0, czas);
//
//
//        String wiadomość  = sb.toString();
//        System.out.println(wiadomość);
//
//
//        ////////////////////////////////////////
//        int a = 100;
//        Integer b = Integer.valueOf(a); // boxing
//        int c = b.intValue(); // unboxing
//
//        String liczba = "87.44";
//        double d  = Double.parseDouble(liczba);
//        Double dl = Double.valueOf(liczba);
//
//
//        System.out.println("000000000000000000000000");
//
//        CzłonekZałogi członekZałogi = new CzłonekZałogi(Stanowisko.CoPilot);
//        członekZałogi.setStanowisko(Stanowisko.Pilot);



                                //##sortowanie##
//        Pasażer kasia = new Pasażer();
//        kasia.setPoziomCzłonkowstwaIDniCzłonkowstwa(3,800);
//
//        Pasażer jaś = new Pasażer();
//        jaś.setPoziomCzłonkowstwaIDniCzłonkowstwa(2, 340);
//
//        Pasażer stefan = new Pasażer();
//        stefan.setPoziomCzłonkowstwaIDniCzłonkowstwa(1,190);
//
//        Pasażer zofia = new Pasażer();
//        zofia.setPoziomCzłonkowstwaIDniCzłonkowstwa(1,20);
//
//        Pasażer[] pasażerowie = {kasia, jaś, stefan, zofia};
//
//        Arrays.sort(pasażerowie);
//
//        for (Pasażer p : pasażerowie){
//        System.out.println(p);}
                                    //////////sortowanie####

//        resetWszyscyPasażerowie();
//        System.out.println(Lot.getWszyscyPasażerowie());
//
//        Lot lot1 = new Lot();
//        lot1.dodajPasażera();
//        System.out.println(lot1.getLiczbaPasazerow()+" all "+ Lot.getWszyscyPasażerowie());
//        lot1.dodajPasażera();
//        System.out.println(lot1.getLiczbaPasazerow()+" all "+ Lot.getWszyscyPasażerowie());
//
//        Lot lot2 = new Lot();
//        lot2.dodajPasażera();
//        System.out.println(lot2.getLiczbaPasazerow()+" all "+ Lot.getWszyscyPasażerowie());



Pasażer stefan = new Pasażer();
stefan.setImie("Stefan");

stefan.getProgramLojalnościowy().setDniCzłonkowstwa(180);
stefan.getProgramLojalnościowy().setPoziomCzłonkowstwa(3);

        Pasażer.ProgramLojalnościowy platynowy = new Pasażer.ProgramLojalnościowy();

        platynowy.setPoziomCzłonkowstwa(3);

        if (stefan.getProgramLojalnościowy().getPoziomCzłonkowstwa()== platynowy.getPoziomCzłonkowstwa()){
            System.out.println("Stefan jest platynowy");
        }
























    }
}
