package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InventarioService {
    @MedirTiempo
    public void registrarInventario(Venta venta) {
        System.out.println("-----Registrando inventario-----");
        //Simulacion de registro x producto
        try {
            Thread.sleep(350);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-----Inventario registrado-----");
    }
}
