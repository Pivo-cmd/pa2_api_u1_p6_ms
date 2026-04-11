package uce.edu.pa2.api.bodega;

public class Pedido {
    private String cliente;
    private String produto;
    private double total;
    private String correo;

    // Constructor(es)
    public Pedido() {

    }

    public Pedido(String cliente, String produto, double total, String correo) {
        this.cliente = cliente;
        this.produto = produto;
        this.total = total;
        this.correo = correo;
    }

    // Metodos getter y setter
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}