package supermercado;

import supermercado.Super.*;
import supermercado.nosuper.*;

public class Test {

    public static void main(String[] args) {
        PLimpieza p1 = new PLimpieza("jabon",35.23);
        PLimpieza p2 = new PLimpieza("detergente",150);
        PComestible p3 = new PComestible("jamon",52.30);
        PComestible p4 = new PComestible("queso",36.50);
        Caja caja = new Caja();
        DescLimpieza d1 = new DescLimpieza();
        DescComestibles d2 = new DescComestibles();
        DescLimpieza d3 = new DescLimpieza();
        
        
        Cliente c1 = new Cliente("Javier",40792902,d1);
        c1.addDescuento(d2);
        c1.addDescuento(d3);
        
        
        c1.agregarProducto(p1, 10);
        c1.agregarProducto(p2,10);
        c1.agregarProducto(p3,5);
        c1.agregarProducto(p4,6);
        
        c1.mostrarCarrito();
        caja.Cobrar(c1);
        
    }
    
}
