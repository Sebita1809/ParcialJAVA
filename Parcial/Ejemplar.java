package Parcial;

public class Ejemplar {
    private String codigo;
    private EstadoEjemplar estado;
    private Publicacion publicacion;

    public Ejemplar(String codigo, EstadoEjemplar estado) {
        this.codigo = codigo;
        this.estado = estado;
    }
    public Boolean estaDisponible(){
        return estado == EstadoEjemplar.DISPONIBLE;
    }

    public EstadoEjemplar getEstado() {
        return estado;
    }
}
