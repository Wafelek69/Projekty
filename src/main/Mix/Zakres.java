package klasy;

public class Zakres {

    public static void main(String[] args) {

        int wartosc1 = 10;
        int wartosc2 = 20;

        System.out.println(wartosc1);
        System.out.println(wartosc2);

        zamien(wartosc1,wartosc2);

        System.out.println("----");
        System.out.println(wartosc1);
        System.out.println(wartosc2);
    }

    public static void zamien (int i, int j){
        int temp = i;
        i = j;
        j = temp;
        System.out.println("----");
        System.out.println(i);
        System.out.println(j);
    }















}
