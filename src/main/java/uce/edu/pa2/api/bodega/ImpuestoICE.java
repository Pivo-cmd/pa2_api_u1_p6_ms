package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoICE implements Impuesto {

    @Override
    public double aplicar(double total) {
        System.out.println("Aplicando impuesto ICE");
        return total * 1.05;
    }
}
