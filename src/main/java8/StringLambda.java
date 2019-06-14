package java8;

public class StringLambda {

    public static void main(String[] args) {

//        DługośćStringa stringLambda  = (String s)-> s.length();
//
//        System.out.println(stringLambda.getDługość("hej"));
        wypiszLamde (s->s.length());




    }

    public static void wypiszLamde (DługośćStringa lamda){
        System.out.println(lamda.getDługość("hejooo"));
    }
}
