package supermercado;
import java.util.ArrayList;


public class Carrito {
    
    private ArrayList<ItemCarrito> lista;

    public Carrito() {
        this.lista = new ArrayList<ItemCarrito>();
    }
    
    public void nuevoItem(Producto producto,int cantidad){
        ItemCarrito nuevo = new ItemCarrito(producto,cantidad);
        this.lista.add(nuevo);
    }
    
    private double valorTotalItems(){
        double total = 0;
        for(int i = 0; i<this.lista.size();i++){
            total = total + this.lista.get(i).getValor();
        }
        return total;
    }
    public void mostrarItems(){
        if(this.lista.size()>0){
            System.out.println("Carrito de NOMBRE_DE_PERSONA");
            for(int i=0; i<this.lista.size();i++){
                System.out.println("Item " + i+1);
                System.out.println(this.lista.get(i).toString());
            }
            System.out.println("\nValor total del carrito: " + this.valorTotalItems());
        }
        else{
            System.out.println("El carrito esta vacio");
        }
    }
    
}
