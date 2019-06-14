package klasy;

public class Pokój {
    private double wysokość;
    private double szerokość;
    private double długość;

    public Pokój (double wysokość, double szerokość, double długość){
        this.wysokość = wysokość;
        this.szerokość = szerokość;
        this.długość = długość;
    }
    public Pokój (double szerokość, double długość){
        this.długość = długość;
        this.szerokość = szerokość;
        this.wysokość = 2.4;

    }

    public double getWysokość(){
        return wysokość;
    }
    public void setWysokość(double wysokość){
        this.wysokość = wysokość;
    }
    public double getSzerokość(){
        return szerokość;
    }
    public void setSzerokość (double szerokość){
        this.szerokość = szerokość;
    }
    public double getDługość(){
        return długość;
    }
    public void setDługość(double długość){
        this.długość = długość;
    }

    public double obliczPolePowierzchni(){
        double wynik = szerokość * this.długość;
        return wynik;
    }
    // return this.szerokosc * this.wysokosc;

    public double obliczObjetosc(){
        return obliczPolePowierzchni() * this.wysokość;
    }

    public void wypiszPolePowierzchni(){
        System.out.println(obliczPolePowierzchni());
    }
    public void wypiszObjetosc(){
        System.out.println(obliczObjetosc());
    }




    public static void main(String[] args) {

        Pokój pokój1 = new Pokój(2.5,4.6);
        Pokój pokój2 = new Pokój(4.0, 5.0,3.0);
        Pokój pokój3 = new Pokój (3,3,3);


        pokój1.wypiszPolePowierzchni();
        pokój2.wypiszObjetosc();














    }

}
