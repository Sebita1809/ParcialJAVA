package Parcial;

import java.util.List;

public class Libro extends Publicacion{
    private String isbn;
    private List<Autor> autores;
    private Editorial editorial;

    public Libro(String tirulo, int anio, List<Ejemplar> ejemplares, Genero genero, String isbn, List<Autor> autores, Editorial editorial) {
        super(tirulo, anio, ejemplares, genero);
        this.isbn = isbn;
        this.autores = autores;
        this.editorial = editorial;
    }

}
