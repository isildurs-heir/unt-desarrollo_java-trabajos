
import java.util.Scanner;

public class Tp4 {

    public static void main(String[] args) {
        /* 
        //1)_a_
        int num1 = 3;
        int num2 = 1;}
        int num3 = 2;
        char orden = 'c';

        ordenar(num1, num2, num3,orden);
        System.out.println("----------");
        ordenar(num1, num2, num3,orden);
        */
        //1)_b_
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros:");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();
        System.out.println("Creciente o decreciente?");
        char orden = scn.next().charAt(0);
        ordenar(num1, num2, num3,orden);
        
        
    }

    private static void ordenar(int num1, int num2, int num3, char orden) {
        if (orden == 'c') {
            if (num1 < num2 && num1 < num3) {
                System.out.println(num1);
                if (num2 < num3) {
                    System.out.println(num2);
                    System.out.println(num3);
                } else {
                    System.out.println(num3);
                    System.out.println(num2);
                }
                System.out.println("Primer CASO");
            } else if (num2 < num1 && num2 < num3) {
                System.out.println(num2);
                if (num1 < num3) {
                    System.out.println(num1);
                    System.out.println(num3);
                } else {
                    System.out.println(num3);
                    System.out.println(num1);
                }
                System.out.println("Segundo CASO");
            } else {
                System.out.println(num3);
                if (num2 < num1) {
                    System.out.println(num2);
                    System.out.println(num1);
                } else {
                    System.out.println(num1);
                    System.out.println(num2);
                }
                System.out.println("Tercer CASO");
            }
        } else {
            if (num1 > num2 && num1 > num3) {
                System.out.println(num1);
                if (num2 > num3) {
                    System.out.println(num2);
                    System.out.println(num3);
                } else {
                    System.out.println(num3);
                    System.out.println(num2);
                }
                System.out.println("Primer CASO");
            } else if (num2 > num1 && num2 > num3) {
                System.out.println(num2);
                if (num1 > num3) {
                    System.out.println(num1);
                    System.out.println(num3);
                } else {
                    System.out.println(num3);
                    System.out.println(num1);
                }
                System.out.println("Segundo CASO");
            } else {
                System.out.println(num3);
                if (num2 > num1) {
                    System.out.println(num2);
                    System.out.println(num1);
                } else {
                    System.out.println(num1);
                    System.out.println(num2);
                }
                System.out.println("Tercer CASO");
            }
        }
    }
}
