package supermercado.Super;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import supermercado.nosuper.*;
import supermercado.Super.*;

public class Caja {

    private double total;
    //private double descuentosTotales;
    Map<String, Double> categorias = new HashMap<>();

    public Caja() {
        this.total = 0;
        //this.descuentosTotales = 0;
    }

    public void Cobrar(Cliente cliente) {
        ArrayList<ItemCarrito> items = (cliente.getCarrito()).getItems();
        if (!cliente.descuento()) {
            items.forEach(item -> {
                this.total = this.total + validarDescuento(cliente.getDescuento(), item);
            });
        }
        else{
            this.total = cliente.getCarrito().valorTotal();
        }
        System.out.println("\n/***************Caja*****************/");
        System.out.println("Total a pagar: " + this.total);
        System.out.println("Descuentos aplicados: ");
        for (Map.Entry<String, Double> descuento : categorias.entrySet()) {
            String key = descuento.getKey();
            Double valor = descuento.getValue();
            System.out.println(key + ": " + valor);
        }
    }

    private double validarDescuento(ArrayList<Descuento> descuento, ItemCarrito item) {
        //auxiliares (?
        double porcentajeDescuento;
        double descuentoActual;
        double totalItem = item.getValor();
        for(int i=0; i<descuento.size(); i++){
            String categoriaDescuento = descuento.get(i).getCategoria();
            String categoriaProducto = item.getProducto().getCategoria();
            if (categoriaDescuento.equals(categoriaProducto)) { // si la cateogria del descuento es la misma que la del producto
                porcentajeDescuento = (double) descuento.get(i).getDescuento() / 100;
                descuentoActual = (totalItem * porcentajeDescuento);
                if (this.categorias.containsKey(categoriaDescuento)) { // si ya hay algun descuento registrado en el proceso de cobro
                    if (this.categorias.get(categoriaDescuento) < descuento.get(i).getTope()) {   // si el descuento no alcanzo su tope
                        if ((this.categorias.get(categoriaDescuento) + descuentoActual) <= descuento.get(i).getTope()) { // si el descuento actual mas el acumulado no supera el tope
                            this.categorias.put(categoriaDescuento, this.categorias.get(categoriaDescuento) + descuentoActual);
                            totalItem -= descuentoActual;
                        } else { // el descuento actual mas el acumulado supera el tope
                            descuentoActual = descuento.get(i).getTope() - this.categorias.get(categoriaDescuento);
                            // descuento acumulado + descuento actual >= tope. -> tope - descuento acumulado  es lo que tengo que descontar
                            totalItem -= descuentoActual;
                            this.categorias.put(categoriaDescuento, descuento.get(i).getTope());
                        }
                    }
                } else { // se descuenta por primera vez esta categoria
                    this.categorias.put(categoriaDescuento, descuentoActual);
                    totalItem -= descuentoActual;
                }

            }
            
        }
        return totalItem;
    }
}
