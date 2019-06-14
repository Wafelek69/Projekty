package Kolekcje.błędy.błędy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Wyjątki {

    public void wyjątek(){

    BufferedReader reader = null;
    int wynik = 0;
    try{
    reader  = new BufferedReader(new FileReader ("C:\\Users\\Samsung\\Desktop\\liczby.txt"));

    String linia  = null;
    while ((linia = reader.readLine())!= null){
        wynik += Integer.valueOf(linia);
        }
        System.out.println("Wynik "+ wynik);


    }catch (FileNotFoundException e){
        System.out.println(e.getMessage());


    } catch (IOException e){
        System.out.println(e.getMessage());
    }

    finally {
        try{
            if (reader != null){
                reader.close();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    }


    public static void main(String[] args) {


        Wyjątki wyjątki = new Wyjątki();
        wyjątki.wyjątek();

    }









}
