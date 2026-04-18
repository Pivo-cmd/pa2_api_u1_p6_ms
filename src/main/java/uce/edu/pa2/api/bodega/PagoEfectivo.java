 package uce.edu.pa2.api.bodega;

 import jakarta.enterprise.context.ApplicationScoped;

 @ApplicationScoped
 public class PagoEfectivo implements PagoStrategy {

     @Override
     public void ejecutar(double valor) {
         System.out.println("Presenta una pantalla");
         System.out.println("Realizando cobro en efectivo");
    }

}
