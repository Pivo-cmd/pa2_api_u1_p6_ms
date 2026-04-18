package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComprobantePDF implements InterComprobante {

    @Override
    public void generarComprobante(Pedido pedido) {
        System.out.println("Generando comprobante PDF para el cliente: " + pedido.getCliente());
        System.out.println("Comprobante PDF generado exitosamente.");
    }

}
