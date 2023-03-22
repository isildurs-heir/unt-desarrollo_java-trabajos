package supermercado.nosuper;

public abstract class Descuento {
    
    private final double tope;
    private final int descuento;
    private String categoria;


    public Descuento(double tope, int descuento,String categoria) {
        this.tope = tope;
        this.descuento = descuento;
        this.categoria = categoria;
    }
    
    public double getTope() {
        return tope;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getDescuento() {
        return descuento;
    }
    
    
}
