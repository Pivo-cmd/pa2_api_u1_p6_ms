package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;

@Dependent
public class TrakingVenta {
    private long tiempoInicio = 0;
    private long tiempoFin = 0;
    private long tiempoTotalAcumulado  = 0;
    private int numeroOperaciones = 0;
    public void iniciar() {
        this.tiempoInicio = System.currentTimeMillis();
    }

    public void reiniciar() {
        this.tiempoTotalAcumulado = 0;
        this.numeroOperaciones = 0;
    }

    public void finalizar() {
        this.tiempoFin = System.currentTimeMillis();
        long duracion = tiempoFin - tiempoInicio;

        this.tiempoTotalAcumulado += duracion;
        this.numeroOperaciones++;

        System.out.println("Tiempo de ejecucion: " + duracion + "ms");
        System.out.println("Tiempo de acumulado: " + this.tiempoTotalAcumulado + "ms");
        System.out.println("Cantidad de operaciones: " + this.numeroOperaciones);

    }
}
