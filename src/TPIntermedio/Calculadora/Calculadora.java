/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author lobo
 */
public class Calculadora {
    private final Operador o1;
    private double temp;
    
    public Calculadora(){
        this.o1 = new Operador();
        this.temp = 0;
    }
    
    private void suma(double a,double b){
        this.temp = this.o1.suma(a,b);
        System.out.println(this.temp);
    }
    
    private void resta(double a, double b){
        this.temp = this.o1.resta(a, b);
        System.out.println(this.temp);
    }
    
    private void division(double a, double b){
        try{
            this.temp = this.o1.division(a,b);
            System.out.println(this.temp);
        }
        catch(DenominadorCeroException e){
            System.err.println(e.getMessage());
        }
    }
    
    private void multiplicacion(double a, double b){
        this.temp = this.o1.multiplicacion(a, b);
        System.out.println(this.temp);
    }
    
    private void potencia(double a, double b){
        this.temp = this.o1.potencia(a, b);
        System.out.println(this.temp);
    }
    
    private void raizCuadrada(double a){
        try{
            this.temp = this.o1.raizCuadrada(a);
            System.out.println(this.temp);
        }
        catch(RadicandoNegativoException e){
            System.err.println(e.getMessage());
        }
    }
    
    public void operarConTemp(){
        
        int o = -1;
        while(o != 0){
            if(this.temp != 0){
                System.out.println("OPERACION CON TEMP");
                Scanner s1 = new Scanner(System.in);
                System.out.println("TEMP = "+this.temp);
                System.out.println("Que operacion desea realizar:");
                System.out.println("1)_Suma; 2)_Resta; 3)_Division;\n4)_Multiplicacion; 5)_Raiz Cuadrada; 6)_Potencia;\n0)_Salir");
                o = s1.nextInt();
                if(o == 0)
                    break;
                System.out.println("Ingrese el operando b:");
                double b = s1.nextDouble();
                switch(o){
                    case 1 -> this.suma(this.temp, b);
                    case 2 -> this.resta(this.temp,b);
                    case 3 -> this.division(this.temp,b);
                    case 4 -> this.multiplicacion(this.temp, b);
                    case 5 -> this.raizCuadrada(temp);
                    case 6 -> this.potencia(this.temp, b);
                    default -> System.out.println("Opcion Invalida");
                }
            }
            else{
                System.out.println("No se puede operar con temp = 0");
                o = 0;
            }
        }
    }
    
    public void Operar(){
        int o = -1;
        Scanner s1 = new Scanner(System.in);
        
        
        while(o != 0){
            System.out.println("OPERACION CON DOS VALORES");
            System.out.println("Que operacion desea realizar:");
            System.out.println("1)_Suma; 2)_Resta; 3)_Division;\n4)_Multiplicacion; 5)_Raiz Cuadrada; 6)_Potencia;7)_Operar con temp\n0)_Salir");
            o = s1.nextInt();
            if(o == 7){
                this.operarConTemp();
                System.out.println("OPERACION CON DOS VALORES");
                System.out.println("Que operacion desea realizar:");
                System.out.println("1)_Suma; 2)_Resta; 3)_Division;\n4)_Multiplicacion; 5)_Raiz Cuadrada; 6)_Potencia;7)_Operar con temp\n0)_Salir");
                o = s1.nextInt();
            }
            if(o == 0){
                break;
            }
            else{
                System.out.println("Ingrese el operador a:");
                double a = s1.nextDouble();
                System.out.println("Ingrese el operando b:");
                double b = s1.nextDouble();
                switch(o){
                    case 1 -> this.suma(a, b);
                    case 2 -> this.resta(a,b);
                    case 3 -> this.division(a,b);
                    case 4 -> this.multiplicacion(a, b);
                    case 5 -> this.raizCuadrada(a);
                    case 6 -> this.potencia(a, b);
                    default -> System.out.println("Opcion Invalida");
                }
            }
        }
    }
}
