package java8;

public class Obliczenia {

    public static void oblicz(Działanie działanie){
        System.out.println(działanie.działaj(3,4));

    }


    public static void main(String[] args) {


        oblicz((a, b)-> a + b);
        oblicz((a, b)-> a - b);
        oblicz((a, b)-> a * b);
        oblicz((a, b)-> b!=0 ? a/b :0);




    }
}
