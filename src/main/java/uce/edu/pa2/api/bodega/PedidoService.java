package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped

public class PedidoService {

    @Inject
    private NotificadorMail notificadorMail;

    @Inject
    private InventarioService inventarioService;

    public void registrar(Pedido pedido) {
        System.out.println("Registrando pedido");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        // NotificadorMail n1 = new NotificadorMail(); Sin inyección
        // Con DI por el contenedor
        if (inventarioService.verificarDisponibilidad(pedido.getProduto(), 1)) {
            inventarioService.actualizarInventario(pedido.getProduto(), 1);
            notificadorMail.enviar(pedido.getCorreo(), "Se ha creado un pedido para ser atendido");
        } else {
            notificadorMail.enviar(pedido.getCorreo(), "No se puede registrar el pedido porque no hay stock");
        }
    }
}