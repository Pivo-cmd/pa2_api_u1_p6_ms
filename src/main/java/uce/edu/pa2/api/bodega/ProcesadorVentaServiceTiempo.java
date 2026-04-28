package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVentaServiceTiempo {
    @Inject
    private EstadisticasVentasGlobales estadisticas;
    @MedirTiempo
    public void procesar(Venta venta) {
        // inicia la venta
        System.out.println("-----Procesando pedido-----");
        // consultando en stock de cada item
        // consultando en la bd
        // finaliza
        //simular un proceso lento
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // registrar estadisticas
        this.estadisticas.registarVenta(venta.getTotal());
        System.out.println("-----Pedido finalizado-----");
    }
    @MedirTiempo
    public void reProcesar(Venta venta) {
        // inicia la venta
        System.out.println("-----Reprocesando pedido-----");
        // consultando en stock de cada item
        // consultando en la bd
        // finaliza
        //simular un proceso lento
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // registrar estadisticas
        this.estadisticas.registarVenta(venta.getTotal());
        System.out.println("-----Reproceso finalizado-----");
    }
}
