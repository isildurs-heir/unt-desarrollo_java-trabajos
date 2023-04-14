package calculadora;
/**
 *
 * @author lobo
 */
public class Operador {
    
    public double suma(double a, double b){
        return a+b;
    }
    
    public double resta(double a,double b){
        return a-b;
    }
    
    public double division(double a, double b) throws DenominadorCeroException{
        if(b == 0){
            throw new DenominadorCeroException("No se puede dividir entre 0");
        }
        else{
            return a/b;
        }
    }
    
    public double multiplicacion(double a, double b){
        return a*b;
    }
    
    public double potencia(double a, double b){
        return Math.pow((double)a,(double)b);
    }
    
    public double raizCuadrada(double a) throws RadicandoNegativoException{
        if(a<0){
            throw new RadicandoNegativoException("El radicando no puede ser negativo");
        }
        return Math.sqrt((double)a);
    }
    
    
}

class DenominadorCeroException extends Exception{
    public DenominadorCeroException(String errmsg){
        super(errmsg);
    }
}

class RadicandoNegativoException extends Exception{
    public RadicandoNegativoException(String errmsg){
        super(errmsg);
    }
}




