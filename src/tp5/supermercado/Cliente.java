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
    
    public void pagar(){
        if(!this.carroDeCompras.isEmpty()){
            System.out.println("Total pagado: " + this.carroDeCompras.valorTotal());
            this.carroDeCompras.vaciar();
        }
        else{
            System.out.println("El carro de compras esta vacio.");
        }
    }
    
    public void vaciarCarrito(){
        if(!this.carroDeCompras.isEmpty()){
            this.carroDeCompras.vaciar();
            System.out.println("Carro vaciado");
        }
        else{
            System.out.println("Carrito vacio");
        }
    }
}
