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
        if (cliente.descuento()) {
            for (ItemCarrito item : items) {
                this.total += validarDescuento(cliente.getDescuento(), item);
            }
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

    private double validarDescuento(Descuento descuento, ItemCarrito item) {
        double totalItem = item.getValor();
        //auxiliares (?
        double porcentajeDescuento;
        double descuentoActual;
        String categoriaDescuento = descuento.getCategoria();
        String categoriaProducto = item.getProducto().getCategoria();

        if (categoriaDescuento.equals(categoriaProducto)) {
            porcentajeDescuento = (double) descuento.getDescuento() / 100;
            descuentoActual = (totalItem * porcentajeDescuento);
            if (this.categorias.containsKey(categoriaDescuento)) {
                if (this.categorias.get(categoriaDescuento) < descuento.getTope()) {
                    if ((this.categorias.get(categoriaDescuento) + descuentoActual) <= descuento.getTope()) {
                        this.categorias.put(categoriaDescuento, this.categorias.get(categoriaDescuento) + descuentoActual);
                        totalItem = totalItem - descuentoActual;
                    } else {
                        descuentoActual = descuento.getTope() - (this.categorias.get(categoriaDescuento) + descuentoActual);
                        totalItem = totalItem - descuentoActual;
                        this.categorias.put(categoriaDescuento, descuento.getTope());
                    }
                }
            } else {
                this.categorias.put(categoriaDescuento, descuentoActual);
                totalItem -= descuentoActual;
            }
        }
        return totalItem;
    }
}
