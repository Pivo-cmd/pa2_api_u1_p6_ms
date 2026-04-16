package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.inject.spi.CDI;

@QuarkusMain
public class Main {
    public static void main(String... args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {
        //Modelos IoC

        //1.DI
        //@Inject
        //private PedidoService pedidoService;

        //2. Service Locator
        //private PedidoService pedidoService = CDI.current().select(PedidoService.class).get();

        @Override
        public int run(String... args) {

            PedidoService pedidoService = CDI.current().select(PedidoService.class).get();

            // Caso 1 (montos mayores a 120))
            Pedido pedido = new Pedido("Miguel Soria", "Coca Cola", 120.0, "miguel_soria@temporal0.com");
            pedidoService.registrar(pedido);
            System.out.println();

            // Caso 2 (montos entre 50 y 120)
            Pedido pedido2 = new Pedido("Juan Lopez", "Pepsi", 65.0, "ana_lopez@temporal0.com");
            pedidoService.registrar(pedido2);
            System.out.println();

            // Caso 3 (montos menores a 50)
            Pedido pedido3 = new Pedido("Ana Ramirez", "Pineapple Juice", 30.0, "ana_ramirez@temporal0.com");
            pedidoService.registrar(pedido3);
            System.out.println();

            return 0;
        }
    }
}
