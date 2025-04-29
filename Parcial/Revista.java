package Parcial;

import java.util.List;

public class Revista extends Publicacion{
    private int volumen;
    private int numero;

    public Revista(String tirulo, int anio, List<Ejemplar> ejemplares, Genero genero, int volumen, int numero) {
        super(tirulo, anio, ejemplares, genero);
        this.volumen = volumen;
        this.numero = numero;
    }
}
