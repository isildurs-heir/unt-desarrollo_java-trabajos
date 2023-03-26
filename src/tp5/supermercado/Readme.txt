Actualizacion:
*Descuentos
*Productos
*Cliente
*Caja
*Cliente con mas de un descuento. (no acumulables)

A Actualizar:
*COntrolar descuentos ingresados y almacenar el mejor


clases separadas en super -> relacionadas al supermercado y nosuper -> no relacionadas al supermercado
------------------------------------------------------
Caso de prueba en test: 
Cliente con un Descuento de 30% con un tope de 500 en articulos de limpieza y un descuento de 20% con un tope de 1500 en articulos comestibles

Descuento 1:Limpieza
Descuento 2: Comestibles
Descuento 3: Limpieza

Se guardan Descuento 1 y 2 en cliente. Descuento 3 muestra mensaje de "ya existe un descuento de esta categoria". 

Producto 1: (nombre: jabon, precio: 35.23, categoria: limpieza)
Producto 2: (nombre: detergente, precio:: 150, categoria: limpieza)
Producto 3: (nombre: jamon, precio: 52.3, categoria: comestible)
producto 4: (nombre: queso, precio: 36.5, categoria: comestible)

Cliente compra 10 unidades del producto 1, 10 unidades del producto 2, 5 unidades del producto 3 y 6 unidades del producto 4.

Total: 2332.80
Total con descuentos: 1736.70

descuentos aplicados:
	limpieza: 500
	comestibles: 96.10
