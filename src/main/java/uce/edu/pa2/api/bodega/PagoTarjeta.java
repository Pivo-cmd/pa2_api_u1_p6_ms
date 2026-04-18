 package uce.edu.pa2.api.bodega;

 import jakarta.enterprise.context.ApplicationScoped;

 @ApplicationScoped
 public class PagoTarjeta implements PagoStrategy {

     @Override
     public void ejecutar(double valor) {
         System.out.println("Presenta la pantalla donde pide los datos de la tarjeta");
         System.out.println("Realizando cobro con tarjeta");
     }

}
