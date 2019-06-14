package klasy;


import java.util.Iterator;

public class Lot implements Comparable<Lot>, Iterable<Człowiek> {

    private static final int MAX_LICZBA_SIEDZEN = 550;


    private int liczbaPasazerow;
    private int siedzenia = 150;
    private char klasaLotu;
    private int numerLotu;
    private int rejestrowanyBagaż;
    private int czasLotu;

    private CzłonekZałogi[] załoga;
    private Pasażer[] pasażerowie;

    private static int wszyscyPasażerowie;


    public CzłonekZałogi[] getZałoga() {
        return załoga;
    }

    public void setZałoga(CzłonekZałogi[] załoga) {
        this.załoga = załoga;
    }

    public Pasażer[] getPasażerowie() {
        return pasażerowie;
    }

    public void setPasażerowie(Pasażer[] pasażerowie) {
        this.pasażerowie = pasażerowie;
    }

    private boolean[] wolneMiejsca;

    public static int getWszyscyPasażerowie() {
        return wszyscyPasażerowie;
    }

    public static void resetWszyscyPasażerowie() {
        wszyscyPasażerowie = 0;
    }


    {
        wolneMiejsca = new boolean[siedzenia];
        for (int i = 0; i < siedzenia; i++) {
            wolneMiejsca[i] = true;
        }
    }

    public Lot() {
    }

    public int getCzasLotu() {
        return czasLotu;
    }

    public void setCzasLotu(int czasLotu) {
        this.czasLotu = czasLotu;
    }

    public Lot(int numerLotu) {
        this.numerLotu = numerLotu;
    }

    public Lot(char klasaLotu) {
        this.klasaLotu = klasaLotu;
    }

    public int getSiedzenia() {
        return 150; //wczesniej siedzenia;
    }

    public void setSiedzenia(int siedzenia) {
        if (siedzenia <= MAX_LICZBA_SIEDZEN) {
            this.siedzenia = siedzenia;
        } else {
            System.out.println("Takie liczby siedzeń nei można ustawić ");
        }

    }

    public int getLiczbaPasazerow() {
        return liczbaPasazerow;
    }

    public void setLiczbaPasazerow(int liczbaPasazerow) {
        this.liczbaPasazerow = liczbaPasazerow;
    }


    public int getNumerLotu() {
        return numerLotu;
    }

    public void setNumerLotu(int numerLotu) {
        this.numerLotu = numerLotu;
    }

    public int getRejestrowanyBagaż() {
        return rejestrowanyBagaż;
    }

    public void setRejestrowanyBagaż(int rejestrowanyBagaż) {
        this.rejestrowanyBagaż = rejestrowanyBagaż;
    }


    public void dodajPasażera() {
        if (czyDodacPasazera()) {
            liczbaPasazerow += 1;
            wszyscyPasażerowie += 1;
        } else {
            zaDużoPasażerów();
        }
    }


    public void dodajPasażera(int bagaż) {
        if (czyDodacPasazera()) {
            dodajPasażera();
            rejestrowanyBagaż += bagaż;
        } else {
            zaDużoPasażerów();
        }
    }

    public void dodajPasażerów(Pasażer... listaPasażerów) {
        if (czyMaMiejsce(listaPasażerów.length)) {
            liczbaPasazerow += listaPasażerów.length;
            wszyscyPasażerowie += listaPasażerów.length;
            for (Pasażer pasażer : listaPasażerów) {
                rejestrowanyBagaż += pasażer.getRejestrowanyBagaż();
            }

        } else {
            zaDużoPasażerów();
        }
    }


    public boolean czyMaMiejsce(int liczbaPasażerów) {
        return (this.liczbaPasazerow + liczbaPasażerów) < siedzenia;
    }

    public void dodajPasażera(Pasażer pasażer) {
        dodajPasażera(pasażer.getRejestrowanyBagaż());
    }


    public boolean czyDodacPasazera() {
        return liczbaPasazerow <= siedzenia;


    }

    public boolean czyMaMiejsce(Lot lot2) {
        int sumaPasazerow = this.liczbaPasazerow + lot2.liczbaPasazerow;
        return sumaPasazerow <= this.siedzenia;
//            if (sumaPasazerow< siedzenia){
//                return true;
//            }
//            return false;
    }

    public Lot stworzNowyZObu(Lot lot2) {
        Lot nowyLot = new Lot();
        nowyLot.siedzenia = this.siedzenia;
        nowyLot.liczbaPasazerow = this.liczbaPasazerow + lot2.liczbaPasazerow;
        return nowyLot;
    }

    private void zaDużoPasażerów() {
        System.out.println("Pasażerów jest za dużo ");


    }

    public static void main(String[] args) {
        Lot lot1 = new Lot();
        Lot lot2 = new Lot();
        Lot nowyLot = null;

        for (int i = 0; i < 20; i++) {
            lot1.dodajPasażera();
            lot2.dodajPasażera();
        }

        if (lot1.czyMaMiejsce(lot2)) {
            nowyLot = lot1.stworzNowyZObu(lot2);
        }
        System.out.println(nowyLot.liczbaPasazerow);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Lot)) {
            return false;
        }
        Lot inny = (Lot) o;
        return liczbaPasazerow == inny.liczbaPasazerow && siedzenia == inny.siedzenia && klasaLotu == inny.klasaLotu;
    }

    @Override
    public String toString() {
//        if (numerLotu > 0) {
//            return "Lot# " + numerLotu;
//        } else {
//            return "Klasa lotu: " + klasaLotu;
//        }
        return "Lot " +
                "czasLotu: " + czasLotu;

    }


    @Override
    public int compareTo(Lot lot) {
        return czasLotu - lot.czasLotu;

//        if (czasLotu < lot.czasLotu){
//            return -1;
//    }       else if (czasLotu > lot.czasLotu){
//            return 1;
//        }   else {
//            return 0;
//        }
//    }
    }

    @Override
    public Iterator<Człowiek> iterator() {

        //return new LotIterator (załoga, pasażerowie);
        return new Iterator<Człowiek>() {
            private int indeks = 0;


            @Override
            public boolean hasNext() {
                return indeks < (załoga.length + pasażerowie.length);
            }

            @Override
            public Człowiek next() {
                Człowiek cz = indeks < załoga.length ? załoga[indeks]
                        : pasażerowie[indeks - załoga.length];
                indeks++;
                return cz;
            }
        };


    }
}















