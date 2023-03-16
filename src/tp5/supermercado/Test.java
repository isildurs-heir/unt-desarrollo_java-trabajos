package supermercado;

public class Test {

    public static void main(String[] args) {
        Producto p1 = new Producto("jabon",35.23);
        Producto p2 = new Producto("jamon",25.14);
        Cliente c1 = new Cliente("Javier",154897632);
        c1.agregarProducto(p1, 2);
        c1.agregarProducto(p2,4);
        c1.mostrarCarrito();
    }
    
}
