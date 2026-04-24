
package com.mycompany.semana01;

import java.util.Scanner;
import modelo.Operacion;

public class Semana01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Operacion operacion = new Operacion();
        System.out.println("Ingrese primer valor");
        int numero = teclado.nextInt();
        operacion.setOperador1(numero);
        System.out.println("Ingrese segundo valor");
        numero = teclado.nextInt();
        operacion.setOperador2(numero);
        
        System.out.println("La suma es: " + operacion.sumar());
        System.out.println("La resta es: " + operacion.restar());
        System.out.println("El producto es: " + operacion.multiplicar());
    }
}
