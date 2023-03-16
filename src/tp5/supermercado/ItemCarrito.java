package supermercado;

public class ItemCarrito {
    
    private Producto producto;
    private int cantidad;
    private double valor;

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.valor = producto.getPrecio()*this.cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getValor() {
        return valor;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString(){
        return this.getProducto().ItemView() +
               "\nCantidad: " + this.getCantidad() +
               "\nValor: " + this.getValor();
    }
    
    
}
