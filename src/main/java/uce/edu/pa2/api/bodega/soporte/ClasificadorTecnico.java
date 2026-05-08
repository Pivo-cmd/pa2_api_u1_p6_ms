package uce.edu.pa2.api.bodega.soporte;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(3)
public class ClasificadorTecnico implements ClasificadorTicket {
    @Override
    public void clasificar(Ticket ticket) {
        String texto = (ticket.getAsunto() + " " + ticket.getDescripcion()).toLowerCase();
        if (texto.contains("conexion") || texto.contains("bug") || texto.contains("pantalla")) {
            System.out.println("Marcando como TECNICO");
            ticket.setCategoria(CategoriaTicket.TECNICO);
        }
    }
}
