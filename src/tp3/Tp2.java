package tp2;

public class Tp2 {

    public static void main(String[] args) {
        //a)_
        /*
        String str = new String("piripitiflautica"); //forma de inicializar un string, con su constructor
        char letra = 'i';
        int count = 0;
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == letra){ //como estoy comparando datos primitivos char, puedo hacerlo con los operadores relacionales
                count++;
            }
        }
        System.out.println("La letra " + letra + " se repite " + count + " veces");
        */
        //-----------------------------------
        //b)_
        
        int numeros[] = new int[3];
        int num1 = 3;
        int num2 = 2;
        int num3 = 1;
        
        if(num1 < num2 && num1 < num3){
            numeros[0] = num1;
            if(num2 < num3){
                numeros[1] = num2;
                numeros[2] = num3;
            }
            else{
                numeros[1] = num3;
                numeros[2] = num2;
            }
            System.out.println("Primer CASO");
        }
        else if(num2 < num1 && num2 < num3){
            numeros[0] = num2;
            if(num1 < num3){
                numeros[1] = num1;
                numeros[2] = num3;
            }
            else{
                numeros[1] = num3;
                numeros[2] = num1;
            }
            System.out.println("Segundo CASO");
        }
        else{
            numeros[0] = num3;
            if(num2 < num1){
                numeros[1] = num2;
                numeros[2] = num1;
            }
            else{
                numeros[1] = num1;
                numeros[2] = num2;
            }
            System.out.println("Tercer CASO");
        }
        for (int  i = 0; i < 3; i++){
            System.out.println(numeros[i]);
        }
        
        //----------------------
        //c)_
        /*
        int x = 54;
        int cantidad = 10;
        int numeros[] = new int[cantidad];
        int acum = 0;
        
        for (int i = 0; i < cantidad; i++){
            numeros[i] = (int)(Math.random()*100+1); //genera un numero random entre 0 y 100   || math.random()*(X-Y+1)+Y   X-> cota superior Y->cota inferior
            System.out.println(numeros[i]);
        }
        
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] <= x){
                acum = acum + numeros[i];
            }
        }
        System.out.println("La suma de los numeros menores a " + x + " es: " + acum);
        */
        //---------------
        //2)_
	/*
        String nombres[] = new String[10];
        String str = new String();
        str = "jon,cyril,francis,derek,tai,derrick,curtis,stipe,serghei,alexander";
        nombres = str.split(",");
        
        for (int i=0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }
	*/
    }
    
    
}
