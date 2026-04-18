 package uce.edu.pa2.api.bodega;

 import jakarta.enterprise.context.ApplicationScoped;
 import jakarta.inject.Inject;

 @ApplicationScoped
 public class ComprobanteSelector {

     @Inject
     private ComprobantePDF pdf;
     @Inject
     private ComprobanteFisico fisico;

     public InterComprobante seleccionar(Pedido pedido) {
         if (pedido.getDestino() != null && !pedido.getDestino().isEmpty()) {
             return pdf;
         } else {
             return fisico;
         }
     } 
 }
