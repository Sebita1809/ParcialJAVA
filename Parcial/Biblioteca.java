package Parcial;


import java.util.List;

public class Biblioteca {
    private List<Publicacion> publicaciones;
    private List<Usuario> usuarios;

    public Biblioteca(List<Publicacion> publicaciones, List<Usuario> usuarios) {
        this.publicaciones = publicaciones;
        this.usuarios = usuarios;
    }
}
