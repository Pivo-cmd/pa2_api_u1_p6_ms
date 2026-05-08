package uce.edu.pa2.api.bodega.soporte;

public class Ticket {
    private String asunto;
    private String descripcion;
    private CategoriaTicket categoria;

    public Ticket(String asunto, String descripcion) {
        this.asunto = asunto;
        this.descripcion = descripcion;
        this.categoria = CategoriaTicket.GENERAL;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public CategoriaTicket getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaTicket categoria) {
        this.categoria = categoria;
    }
}