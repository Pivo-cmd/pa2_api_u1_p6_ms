package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoSOLCA implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando descuento SOLCA");
        return valor * 0.80;
    }
}
