package supermercado.Super;

public abstract class Producto {
    
    private String Nombre;
    private double Precio;
    private long codigoDeBarras;
    private String categoria;

    public String getCategoria() {
        return categoria;
    }

    public Producto(String Nombre, double Precio,String categoria) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.codigoDeBarras = (long) (Math.random()*999999999 + 111111111);
        this.categoria = categoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public long getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(long codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
    
    public String detalle(){
        return  "Producto: " + this.getCodigoDeBarras() +
                "\nNombre: " + this.getNombre() + 
                "\nPrecio: " + this.getPrecio();
        
    }
    
    public String ItemView(){
        return "Nombre: " + this.getNombre() + 
               "\nCodigo: " + this.getCodigoDeBarras();
    }
}
