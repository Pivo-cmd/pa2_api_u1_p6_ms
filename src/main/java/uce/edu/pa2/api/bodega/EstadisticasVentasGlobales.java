package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstadisticasVentasGlobales {
    private int totalVentas = 0;
    private double montoTotalVendido = 0.0;

    public void registarVenta(double ventaTotalIndividual) {
        this.totalVentas++;
        this.montoTotalVendido += ventaTotalIndividual;
    }

    public void mostrarEstadisticasGlobales() {
        System.out.println("--------------");
        System.out.println("Estadísticas Globales");
        System.out.println("Cantidad de ventas: " + this.totalVentas);
        System.out.println("Valor total vendido: " + this.montoTotalVendido);
        System.out.println("--------------");
    }

}
