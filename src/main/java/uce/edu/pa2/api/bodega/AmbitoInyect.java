package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.Dependent;

@Dependent
public class AmbitoInyect {
 private int contador = 0;

    public int incrementar() {
        return ++contador;
    }
}
