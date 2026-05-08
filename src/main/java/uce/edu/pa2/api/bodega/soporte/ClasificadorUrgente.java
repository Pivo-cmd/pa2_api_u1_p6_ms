package uce.edu.pa2.api.bodega.soporte;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(1)
public class ClasificadorUrgente implements ClasificadorTicket {
    @Override
    public void clasificar(Ticket ticket) {
        String texto = (ticket.getAsunto() + " " + ticket.getDescripcion()).toLowerCase();
        if (texto.contains("caido") || texto.contains("error critico") || texto.contains("no funciona")) {
            System.out.println("Marcando como URGENTE");
            ticket.setCategoria(CategoriaTicket.URGENTE);
        }
    }
}
