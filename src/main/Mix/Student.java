package klasy;

public class Student {

    private String imię;
    private String nazwisko;
    private int wiek;

    public Student(String imię, String nazwisko, int wiek) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }


    public String getImię() {
        return imię;
    }

    public void setImię(String imię) {
        this.imię = imię;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }


    public static int obliczSredniWiek(Student... listaStudentów) {
        int sumaWieku = 0;
        for (Student student : listaStudentów) {
            sumaWieku += student.getWiek();

        }
        return sumaWieku / listaStudentów.length;
    }


    public static int StudenciStarsiNiz21(Student[] tablicaStudentow) {
        int licznik = 0;
        for (Student student : tablicaStudentow) {
            if (student.getWiek() > 21) {
                licznik++;
            }
        }
        return licznik;
    }






    ///////////////////Main
    public static void main(String[] args) {


        Student student1 = new Student("Jan", "Kowalski",25);
        Student student2 = new Student("Anna", "Barbara", 20);
        Student student3 = new Student("Paweł","Zelt", 24);

        Student [] tablica = {student1, student2, student3};

        System.out.println(obliczSredniWiek(student1, student2, student3));
        System.out.println(StudenciStarsiNiz21(tablica));







    }
}
