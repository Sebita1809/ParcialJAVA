package Parcial;

import java.util.ArrayList;
import java.util.Date;

public class Prestamo {
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private ArrayList<LineaPrestamo> lineas = new ArrayList<>();

    public Prestamo(Date fechaPrestamo, Date fechaDevolucion) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }
    public void agregarLineaPrestamo(Ejemplar ejemplar){
        LineaPrestamo lineaPrestamo = new LineaPrestamo(fechaDevolucion, ejemplar);
    }


    @Override
    public String toString() {
        return "Prestamo{" +
                "fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                ", lineas=" + lineas +
                '}';
    }
}
