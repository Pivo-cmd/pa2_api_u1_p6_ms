package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoTEST implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando descuento TEST");
        return valor * 0.90;
    }
}
