package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVentaService {
    @Inject
    private EstadisticasVentasGlobales estadisticas;
    @Inject
    private TrakingVenta trakingVenta;

    public void procesar(Venta venta) {
        // inicia la venta
        this.trakingVenta.iniciar();
        System.out.println("-----Procesando pedido-----");
        // consultando en stock de cada item
        // consultando en la bd
        // finaliza
        //simular un proceso lento
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.trakingVenta.finalizar();

        // registrar estadisticas
        this.estadisticas.registarVenta(venta.getTotal());
    }
}
