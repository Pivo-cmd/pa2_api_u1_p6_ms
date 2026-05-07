package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(1)
// Registra ese orden en la lista
public class DescuentoIVA implements Descuento {

    @Override
    public double aplicar(double valor) {
        // double valorDescontar = valor * 0.15;
        // return valor - valorDescontar;
        System.out.println("Aplicando descuento IVA");
        return valor * 0.85;
    }
}
