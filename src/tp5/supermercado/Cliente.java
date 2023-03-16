package supermercado;

public class Cliente {
    
    private String Nombre;
    private long dni;
    private Carrito carroDeCompras;
    private double Total;

    public Cliente(String Nombre, long dni) {
        this.Nombre = Nombre;
        this.dni = dni;
        this.carroDeCompras = new Carrito();
    }
    
    public void agregarProducto(Producto producto, int cantidad){
        this.carroDeCompras.nuevoItem(producto, cantidad);
    }
    
    public void mostrarCarrito(){
        this.carroDeCompras.mostrarItems();
    }
}
