 package uce.edu.pa2.api.bodega;

 import jakarta.enterprise.context.ApplicationScoped;

 @ApplicationScoped
 public class ComprobanteFisico implements InterComprobante {

     @Override
     public void generarComprobante(Pedido pedido) {
         System.out.println("Generando comprobante físico para el cliente: " + pedido.getCliente());
         System.out.println("Comprobante físico generado exitosamente");
     }

}
