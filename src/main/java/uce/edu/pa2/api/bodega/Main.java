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
        @Inject
        private ProcesadorVentaService1 procesadorVentaService1;
        @Inject
        private ProcesadorVentaEnLineaService procesadorVentaEnLineaService;
        @Override
        public int run(String... args) throws Exception {
            //Procesador 1
            Venta venta1 = new Venta("Miguel Soria", 100.0);
            procesadorVentaService.procesar(venta1);
            
            Venta venta2 = new Venta("Pedro Perez", 20.0);
            procesadorVentaService.procesar(venta2);

            //Procesador 2
            Venta venta4 = new Venta("Richard Santos", 5.0);
            procesadorVentaService1.procesar(venta4);
            
            Venta venta5 = new Venta("Lucas Diaz", 5.0);
            procesadorVentaService1.procesar(venta5);

            //Procesador de venta en linea
            Venta venta6 = new Venta("Serena Mendoza", 5.0);
            procesadorVentaEnLineaService.procesar(venta6);

            this.estadisticas.mostrarEstadisticasGlobales();
            return 0;
        }
    }
}
