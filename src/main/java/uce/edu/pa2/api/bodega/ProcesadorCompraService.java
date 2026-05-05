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
    @Inject
    private Instance<Impuesto> impuestos;

    public void procesar(Compra compra) {
        // --> Alto acoplamiento
        // double valorPagar = this.descuentoIVA.aplicar(compra.getSubtotal());
        // System.out.println("El valor a pagar es: " + valorPagar);
        double total = compra.getSubtotal();
        System.out.println("----Aplicando descuentos----");

        for (Descuento descuento : descuentos) {
            total = descuento.aplicar(total);
        }
        System.out.println("----Aplicando impuestos----");
        for (Impuesto impuesto : impuestos) {
            total = impuesto.aplicar(total);
        }
        compra.setTotal(total);
        System.out.println("\n" + "El valor a pagar es: " + compra.getTotal() + "\n");
    }
}
