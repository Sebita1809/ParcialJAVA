package Parcial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;
    private String dni;
    private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();

    public Usuario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    public void agregarPrestamo(Date fechaDevolucion, Libro libro){
        Prestamo prestamo = new Prestamo(new Date(), fechaDevolucion);
        prestamos.add(prestamo);
    }
    public void mostrarHistorialPrestamos(){
        System.out.println(prestamos);
    }
}