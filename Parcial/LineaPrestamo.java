package Parcial;

import java.util.ArrayList;
import java.util.Date;

public class LineaPrestamo {
    private Date fechaDevolucionEstimada;
    private Ejemplar ejemplar;

    public LineaPrestamo(Date fechaDevolucionEstimada, Ejemplar ejemplar) {
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
        this.ejemplar = ejemplar;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }
}
