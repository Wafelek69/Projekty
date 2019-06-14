package java8;

import java.util.function.Consumer;

public class Pozdrawiacz {

    public void pozdrów (){
        System.out.println("Witaj świecie");
    }

    public void pozdrów(Pozdrowienia pozdrowienie){
        pozdrowienie.działaj();
    }

    public static void main(String[] args) {

        Pozdrawiacz pozdrawiacz = new Pozdrawiacz();
        pozdrawiacz.pozdrów(new WitajŚwieciePozdrowienia());

        Pozdrowienia mojaLamda = ()-> System.out.println("witaj swiecie");
        Pozdrowienia mojaLamda2 =()-> System.out.println("Hejka ");
        Działanie dodawanie = (int a , int b)-> a+b;
        System.out.println(dodawanie.działaj(4,3));
        Działanie odejmowanie = (int a, int b)-> a-b;
        System.out.println(odejmowanie.działaj(4,3));

        Consumer<String> powitaj = (String s)-> System.out.println("Witaj "+ s);

        powitaj.accept("Marcin ");








    }
}
