package Kolekcje.błędy.błędy;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Wyjątki2 {

    public void wyjątek2() throws IOException { //// z throws IOException

        BufferedReader reader = null;
        int wynik = 0;
        {
            reader = new BufferedReader(new FileReader("C:\\Users\\Samsung\\Desktop\\liczby.txt"));

            String linia = null;
            while ((linia = reader.readLine()) != null) {
                wynik += Integer.valueOf(linia);
            }
            System.out.println("Wynik " + wynik);

            if (reader != null) {
                reader.close();
            }

        }
    }






    public static void main(String[] args) {


        Wyjątki2 wyjątki2 = new Wyjątki2();
        try {
            wyjątki2.wyjątek2();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }









}
