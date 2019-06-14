package Kolekcje.biblioteka;

public class Książka {

    private String autor;
    private String tytuł;

    public Książka(String autor, String tytuł) {
        this.autor = autor;
        this.tytuł = tytuł;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTytuł() {
        return tytuł;
    }

    public void setTytuł(String tytuł) {
        this.tytuł = tytuł;
    }

    @Override
    public String toString() {
        return "Książka{" +
                "autor='" + autor + '\'' +
                ", tytuł='" + tytuł + '\'' +
                '}';
    }
}
