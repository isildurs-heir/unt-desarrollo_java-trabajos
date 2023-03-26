package supermercado.nosuper;

import java.util.ArrayList;
import supermercado.Super.Producto;

public class Cliente {

    private String Nombre;
    private long dni;
    private Carrito carroDeCompras;
    private double Total;
    //private Descuento descuento;
    private ArrayList<Descuento> descuento;

    public Cliente(String Nombre, long dni) {
        this.Nombre = Nombre;
        this.dni = dni;
        this.carroDeCompras = new Carrito();
        this.descuento = new ArrayList<>();
    }

    public Cliente(String Nombre, long dni, Descuento descuento) {
        this.Nombre = Nombre;
        this.dni = dni;
        this.carroDeCompras = new Carrito();
        this.descuento = new ArrayList<>();
        this.addDescuento(descuento);
    }

    public boolean descuento() {
        return (this.descuento.isEmpty());
    }

    public ArrayList<Descuento> getDescuento() {
        return this.descuento;
    }
    
    public void addDescuento(Descuento descuento){
        if(this.VerificarDescuento(descuento)){
            this.descuento.add(descuento);
        }
        else{
            System.out.println("Ya posee un descuento de la categoria: "+descuento.getCategoria()+".\nProximamente, si es que el descuento es mejor, sera reemplazado");
        }
        
    }
    
    private boolean VerificarDescuento(Descuento descuento){
        if(!this.descuento()){
            for(int i=0; i<this.descuento.size(); i++){
                if((descuento.getCategoria()).equals(this.descuento.get(i).getCategoria())){
                    return false;
                }
            }
            return true;
        }
        else{
            return true;
        }
        
    }

    public void agregarProducto(Producto producto, int cantidad) {
        this.carroDeCompras.nuevoItem(producto, cantidad);
    }

    public void mostrarCarrito() {
        this.carroDeCompras.mostrarItems();
    }

    public void pagar() {
        if (!this.carroDeCompras.isEmpty()) {
            System.out.println("Total: " + this.carroDeCompras.valorTotal());
            this.carroDeCompras.vaciar();
        } else {
            System.out.println("El carro de compras esta vacio.");
        }
    }

    public Carrito getCarrito() {
        return carroDeCompras;
    }

    public void vaciarCarrito() {
        if (!this.carroDeCompras.isEmpty()) {
            this.carroDeCompras.vaciar();
            System.out.println("Carro vaciado");
        } else {
            System.out.println("Carrito vacio");
        }
    }
}
