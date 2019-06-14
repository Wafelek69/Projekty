package klasy;

public class MainZamiana {
    public static void main(String[] args) {

        Lot lot1 = new Lot(10);
        Lot lot2 = new Lot(20);


        System.out.println(lot1.getNumerLotu());
        System.out.println(lot2.getNumerLotu());
        zamienNumerLotu(lot1,lot2);
        System.out.println("----");

        System.out.println(lot1.getNumerLotu());
        System.out.println(lot2.getNumerLotu());

    }

    public static void zamienNumerLotu (Lot lot1, Lot lot2){
        int temp = lot1.getNumerLotu();
        lot1.setNumerLotu(lot2.getNumerLotu());
        lot2.setNumerLotu(temp);
        System.out.println("----");
        System.out.println(lot1.getNumerLotu());
        System.out.println(lot2.getNumerLotu());
    }

}
