
package com.mycompany.ciclofor;

import java.util.Scanner;


public class Ciclofor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         
        int d= 0, f= 1 ,g,n;
        System.out.println("Ingresa un valor para la serie ");
        n = teclado.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println(d);
            g = d + f;
            d = f; 
            f = g;
        }
    }
}
