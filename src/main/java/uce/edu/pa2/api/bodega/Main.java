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
        private ProcesadorVentaServiceTiempo procesadorVentaServiceTiempo;
        @Inject
        private InventarioService inventarioService;
               @Override
        public int run(String... args) throws Exception {
            //Procesador 1
            Venta venta1 = new Venta("Miguel Soria", 100.0);
            procesadorVentaServiceTiempo.procesar(venta1);
            procesadorVentaServiceTiempo.reProcesar(venta1);
            inventarioService.registrarInventario(venta1);
            return 0;
        }
    }
}
