package klasy;

public class Ex {


    public static void main(String[] args) {

        Object obiekt = new Pasażer();
        obiekt = new LotCargo();

        System.out.println(obiekt instanceof LotCargo);// lub Pasażer false

        LotCargo lotCargo = (LotCargo) obiekt;
        lotCargo.dodajPaczkę(2,4,4);










    }
}
