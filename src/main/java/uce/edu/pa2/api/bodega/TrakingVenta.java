package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;

@Dependent
public class TrakingVenta {
    private long tiempoInicio = 0;
    private long tiempoFin = 0;

    public void iniciar() {
        this.tiempoInicio = this.tiempoInicio + System.currentTimeMillis();
    }

    public void finalizar() {
        this.tiempoFin = this.tiempoFin + System.currentTimeMillis();
        long duracion = tiempoFin - this.tiempoInicio;
        System.out.println("Tiempo de ejecucion: " + duracion + "ms");
    }
}
