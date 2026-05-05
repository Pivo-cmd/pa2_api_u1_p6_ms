package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorCompraService {
    // @Inject
    // private DescuentoIVA descuentoIVA;

    @Inject
    private Instance<Descuento> descuentos;

    public void procesar(Compra compra) {
        // --> Alto acoplamiento
        // double valorPagar = this.descuentoIVA.aplicar(compra.getSubtotal());
        // System.out.println("El valor a pagar es: " + valorPagar);
        double total = compra.getSubtotal();
        for (Descuento descuento : descuentos) {
            total = descuento.aplicar(total);
        }
        compra.setTotal(total);
        System.out.println("\n" + "El valor a pagar es: " + compra.getTotal() + "\n");
    }
}
