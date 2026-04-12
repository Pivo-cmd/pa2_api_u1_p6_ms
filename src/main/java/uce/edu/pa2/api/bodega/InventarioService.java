package uce.edu.pa2.api.bodega;

import java.util.HashMap;
import java.util.Map;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InventarioService {

    private Map<String, Integer> inventario = new HashMap<>();

    public InventarioService() {
        inventario.put("Coca Cola", 100);
        inventario.put("Manzana", 50);
        inventario.put("Fideos", 75);
    }

    public boolean verificarDisponibilidad(String producto, int cantidad) {
        return inventario.getOrDefault(producto, 0) >= cantidad;
    }

    public void actualizarInventario(String producto, int cantidad) {
        if (verificarDisponibilidad(producto, cantidad)) {
            inventario.put(producto, inventario.get(producto) - cantidad);
            System.out.println("Inventario actualizado: " + producto + " - [" + inventario.get(producto) + "] Unidades");
        } else {
            System.out.println("No hay suficiente stock de " + producto);
        }
    }
}
