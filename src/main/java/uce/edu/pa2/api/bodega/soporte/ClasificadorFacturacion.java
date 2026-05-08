package uce.edu.pa2.api.bodega.soporte;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)
public class ClasificadorFacturacion implements ClasificadorTicket {
    @Override
    public void clasificar(Ticket ticket) {
        String texto = (ticket.getAsunto() + " " + ticket.getDescripcion()).toLowerCase();
        if (texto.contains("factura") || texto.contains("cobro") || texto.contains("pago")) {
            System.out.println("Marcando como FACTURACION");
            ticket.setCategoria(CategoriaTicket.FACTURACION);
        }
    }
}
