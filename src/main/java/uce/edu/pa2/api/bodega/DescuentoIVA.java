package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoIVA implements Descuento {

    @Override
    public double aplicar(double valor) {
        // double valorDescontar = valor * 0.15;
        // return valor - valorDescontar;
        System.out.println("Aplicando descuento IVA");
        return valor * 0.85;
    }
}
