package klasy;

public class PilotCargo extends Pilot{


    @Override
    public boolean możeZaakceptować(Lot lot) {
        return lot.getLiczbaPasazerow()== 0;
    }
}
