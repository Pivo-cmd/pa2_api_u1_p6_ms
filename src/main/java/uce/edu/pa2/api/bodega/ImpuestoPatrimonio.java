package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoPatrimonio implements Impuesto {

    @Override
    public double aplicar(double total) {
        System.out.println("Aplicando impuesto al patrimonio");
        return total * 1.25;
    }
}
