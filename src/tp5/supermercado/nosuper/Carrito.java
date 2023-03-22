package supermercado.nosuper;

import supermercado.Super.Producto;
import supermercado.Super.ItemCarrito;
import java.util.ArrayList;

public class Carrito {

    private ArrayList<ItemCarrito> lista;

    public Carrito() {
        this.lista = new ArrayList<>();
    }

    public ArrayList<ItemCarrito> getItems() {
        return lista;
    }

    public boolean isEmpty() {
        return this.lista.isEmpty();
    }

    public void vaciar() {
        this.lista.clear();
    }

    public void nuevoItem(Producto producto, int cantidad) {
        ItemCarrito nuevo = new ItemCarrito(producto, cantidad);
        this.lista.add(nuevo);
    }

    public double valorTotal() {
        double total = 0;
        for (int i = 0; i < this.lista.size(); i++) {
            total = total + this.lista.get(i).getValor();
        }
        return total;
    }

    public void mostrarItems() {
        if (!this.lista.isEmpty()) {
            System.out.println("Detalle de carrito:");
            for (int i = 0; i < this.lista.size(); i++) {
                System.out.println("Item " + (i + 1));
                System.out.println(this.lista.get(i).toString());
            }
            System.out.println("\nValor total del carrito: " + this.valorTotal());
        } else {
            System.out.println("El carrito esta vacio");
        }
    }

}
