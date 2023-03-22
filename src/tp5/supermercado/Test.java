package supermercado;

import supermercado.Super.*;
import supermercado.nosuper.*;

public class Test {

    public static void main(String[] args) {
        PLimpieza p1 = new PLimpieza("jabon",35.23);
        PLimpieza p2 = new PLimpieza("detergente",150);
        Caja caja = new Caja();
        DescLimpieza d1 = new DescLimpieza();
        Cliente c1 = new Cliente("Javier",40792902,d1);
        
        c1.agregarProducto(p1, 10);
        c1.agregarProducto(p2,10);
        
        c1.mostrarCarrito();
        caja.Cobrar(c1);
        
    }
    
}
