package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {
    public static void main(String... args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {
        @Inject
        private ProcesadorVentaService procesadorVentaService;
        @Inject
        private EstadisticasVentasGlobales estadisticas;
        @Override
        public int run(String... args) throws Exception {
            Venta venta1 = new Venta("Miguel Soria", 100.0);
            procesadorVentaService.procesar(venta1);
            
            Venta venta2 = new Venta("Pedro Perez", 20.0);
            procesadorVentaService.procesar(venta2);
            
            Venta venta3 = new Venta("Mario Martinez", 5.0);
            procesadorVentaService.procesar(venta3);

            this.estadisticas.mostrarEstadisticasGlobales();
            return 0;
        }
    }
}
