package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
@ApplicationScoped
public class ProcesadorVentaEnLineaService {
    @Inject
    private TrakingVenta trakingVenta;
    @Inject
    private EstadisticasVentasGlobales estadisticas;
    public void procesar(Venta venta) {
        System.out.println("-----Procesando pedido en linea-----"); 
        trakingVenta.iniciar();
        //Simulación estado de venta
         try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        trakingVenta.finalizar();
        this.estadisticas.registarVenta(venta.getTotal());
    }
}
