package klasy;

public class LotCargo extends Lot{

    private float używaPrzesrzeńCargo;
    private float maxPrzestrzeńCargo=1000;

    public LotCargo(int numerLotu){
        super(numerLotu);
    }

    public LotCargo (int numerLotu, int maxPrzestrzeńCargo){
        this(numerLotu);
        this.maxPrzestrzeńCargo = maxPrzestrzeńCargo;
    }

    public LotCargo(){}

@Override
public int getSiedzenia(){
    return 10;
}


    public float getUżywaPrzesrzeńCargo() {
        return używaPrzesrzeńCargo;
    }

    public void setUżywaPrzesrzeńCargo(float używaPrzesrzeńCargo) {
        this.używaPrzesrzeńCargo = używaPrzesrzeńCargo;
    }

    public float getMaxPrzestrzeńCargo() {
        return maxPrzestrzeńCargo;
    }

    public void setMaxPrzestrzeńCargo(float maxPrzestrzeńCargo) {
        this.maxPrzestrzeńCargo = maxPrzestrzeńCargo;
    }


    public void dodajPaczkę (float wysokość, float długość, float szerokość){
        float objętość = wysokość * długość * szerokość;
        if (czyCargoMaMiejsce(objętość)){
            używaPrzesrzeńCargo += objętość;

        }else{
            zaMałoMiejsca();
        }

    }
    public void zaMałoMiejsca(){
        System.out.println("Za mało miejsca na przesyłkę ");
    }



    public boolean czyCargoMaMiejsce (float objętość){
        return używaPrzesrzeńCargo + objętość < maxPrzestrzeńCargo;
    }










}
