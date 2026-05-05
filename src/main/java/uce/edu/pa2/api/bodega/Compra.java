package uce.edu.pa2.api.bodega;

public class Compra {
    private String cliente;
    private double subtotal;
    private double total;

    public Compra() {
    }

    public Compra(String cliente, double subtotal) {
        this.cliente = cliente;
        this.subtotal = subtotal;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
