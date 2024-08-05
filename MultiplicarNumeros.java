
package com.mycompany.multiplicarnumeros;

import java.util.Scanner;


public class MultiplicarNumeros {

    public static void main(String[] args) {
     Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = lector.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = lector.nextInt();
        System.out.println("El resultado es: " + (num1 * num2));
    }
}
    

