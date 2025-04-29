package Parcial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("José Montiel", "Europeo", LocalDate.of(1980,8, 15));
        Autor autor2 = new Autor("Mariano Moreno", "Americano", LocalDate.of(1978, 3, 30));
        List<Autor> autores = new ArrayList<>();
        autores.add(autor1);
        autores.add(autor2);
        Direccion direccion1 = new Direccion("Lamadrid", 550, "Las Herass", "5539");
        Editorial editorial1 = new Editorial("Oxford", "www.Oxford.com", direccion1);
        Genero terror = new Genero("terror", "textos que dan miedo");
        Genero informacion = new Genero("informacion", "textos informativos");
        Ejemplar ejemplar1 = new Ejemplar("EJ1", EstadoEjemplar.DISPONIBLE);
        Ejemplar ejemplar2 = new Ejemplar("EJ2", EstadoEjemplar.DISPONIBLE);
        List<Ejemplar> ejemplares = new ArrayList<>();
        ejemplares.add(ejemplar1);
        ejemplares.add(ejemplar2);
        Libro libro1 = new Libro("la llorona", 1990, ejemplares, terror, "si", autores, editorial1);
        ejemplares.clear();
        ejemplares.add(ejemplar1);
        Revista revista1 = new Revista("Las mejores opciones para tu cocina", 2005, ejemplares, informacion, 2, 4);
        Usuario usuario1 = new Usuario("Matias", "Morales", "45257656");
        usuario1.agregarPrestamo(new Date(2025, 8, 28), libro1);
        List<Publicacion> publicaciones = new ArrayList<>();
        publicaciones.add((Publicacion) libro1);
        publicaciones.add((Publicacion) revista1);
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario1);
        Biblioteca biblioteca = new Biblioteca(publicaciones, usuarios);
    }
}