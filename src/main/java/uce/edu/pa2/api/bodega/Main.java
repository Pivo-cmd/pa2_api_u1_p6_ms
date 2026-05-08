package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.soporte.ClasificadorTicketService;
import uce.edu.pa2.api.bodega.soporte.Ticket;

@QuarkusMain
public class Main {
    public static void main(String... args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {
        @Inject
        private ClasificadorTicketService clasificadorService;

        @Override
        public int run(String... args) throws Exception {

            Ticket t1 = new Ticket(
                "No funciona el sistema",
                "La pantalla aparece en blanco y el sistema esta caido"
            );

            Ticket t2 = new Ticket(
                "Problema de factura",
                "Existe un error en el cobro mensual"
            );

            Ticket t3 = new Ticket(
                "Error de conexion",
                "No puedo conectarme al servidor"
            );

            System.out.println("\n====== TICKET 1 ======");
            this.clasificadorService.procesar(t1);

            System.out.println("\n====== TICKET 2 ======");
            this.clasificadorService.procesar(t2);

            System.out.println("\n====== TICKET 3 ======");
            this.clasificadorService.procesar(t3);

            return 0;
        }
    }
}