package uce.edu.pa2.api.bodega.soporte;

import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ClasificadorTicketService {
    @Inject
    private Instance<ClasificadorTicket> clasificadores;

    public void procesar(Ticket ticket) {
        for (ClasificadorTicket clasificador : clasificadores) {
            clasificador.clasificar(ticket);
        }

        System.out.println("Categoria final: " + ticket.getCategoria());
    }
}
