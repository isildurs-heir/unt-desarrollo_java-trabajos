package tp1;

public class Tp1 {
    
    public static void main(String[] args) {
        //Ejercicio 1
        int numeroInicio = 5;
        int numeroFin = 14;
        String msg = new String();
        for (int i = numeroInicio; i <= numeroFin; i++){ //orden creciente
        //for (int i = numeroFin; i >= numeroInicio; i--){ //orden invertido
            msg = String.valueOf(i);
            if(i%2 == 0){
                msg = msg + " es par.";
            }
            else{
                msg = msg + " es impar.";
            }
            System.out.println(msg);
        }
        
        
       /* //Ejercicio 2
        double ingresosMensuales = 500000;
        int cantVehiculos = 3;
        int cantInmuebles = 4;
        boolean especial = true;  //aeronave o embarcacion o titular de societarios que demuestren capacidad economica plena

        if (ingresosMensuales >= 489083 && cantVehiculos >= 3 && cantInmuebles >= 3 && especial){
            System.out.println("Este hogar pertenece al segmento de ingresos altos.");
        }
        else{
            System.out.println("Este hogar no pertenece al segmento de ingresos altos");
        }
        */
    }
    
}
