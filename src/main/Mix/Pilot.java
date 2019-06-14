package klasy;

public abstract class Pilot {

    private Lot obecnyLot;


    public void leć (Lot lot){
        if (możeZaakceptować(lot)){
            this.obecnyLot = lot;
        }else
        {
            obsłużNiemożność();
        }
    }
    public abstract boolean możeZaakceptować (Lot lot);

    public void obsłużNiemożność (){
        System.out.println("Pilot nie może obsłużyć tego lotu ");
    }


}
