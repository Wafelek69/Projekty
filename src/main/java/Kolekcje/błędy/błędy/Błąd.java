package Kolekcje.błędy.błędy;

public class Błąd {
    public static void main(String[] args) {

        int a = 12;
        int b = 2;

        try {
            int c = a / (b - 2);
            System.out.println(c);
            }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
                                }
        System.out.println("Dalsze działanie ");



    }
}
