package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoIR implements Impuesto {

    @Override
    public double aplicar(double total) {
        System.out.println("Aplicando impuesto IR");
        return total * 1.15;
    }

}
