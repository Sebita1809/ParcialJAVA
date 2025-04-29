package Parcial;

import java.util.List;

public class Publicacion {
    private String tirulo;
    private int anio;
    private List<Ejemplar> ejemplares;
    private Genero genero;

    public Publicacion(String tirulo, int anio, List<Ejemplar> ejemplares, Genero genero) {
        this.tirulo = tirulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.genero = genero;
    }

    public Publicacion(String tirulo, int anio, Genero genero) {
        this.tirulo = tirulo;
        this.anio = anio;
        this.genero = genero;
    }
    public void agregarEjemplar(Ejemplar ejemplar){
        ejemplares.add(ejemplar);
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

}
