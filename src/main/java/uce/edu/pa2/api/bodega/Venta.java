package uce.edu.pa2.api.bodega;

public class Venta {
    private String cliente;
    private double total;

    public Venta() {
    }

    public Venta(String cliente, double total) {
        this.cliente = cliente;
        this.total = total;
    }

    public String getCliente() {
        return cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
