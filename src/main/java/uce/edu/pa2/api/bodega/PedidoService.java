package uce.edu.pa2.api.bodega;

import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
@Unremovable
public class PedidoService {
    // DI por atributo
    // @Inject
    // private NotificadorMail notificadorMail;

    // DI por constructor
    // private NotificadorMail notificadorMail;
    // public PedidoService(NotificadorMail notificadorMail){
    // this.notificadorMail = notificadorMail;
    // }

    // private NotificadorMail notificadorMail;
    // @Inject
    // public void setNotificador(NotificadorMail notificadorMail){
    // this.notificadorMail = notificadorMail;
    // }

    @Inject
    private NotificadorSelector select;

    public void registrar(Pedido pedido) {
        System.out.println("Registrando pedido");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        Notificador notificador = this.select.seleccionar(pedido.getTotal());
        notificador.enviar(pedido.getDestino(), "Pedido registrado");
    }
}