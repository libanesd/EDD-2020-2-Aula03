/**
 * Recursividade: Implementar um programa que imprima a sequência dos números racionais.
 */

package com.unitins;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x;
        double y = 0;

        Scanner in = new Scanner(System.in) ;
        System.out.println("Esse programa imprime numeros racionais ate um ponto definido por voce." +
                "Insere o numero limite da operacao");
        x = in.nextInt();

        while ( y != x )
        {
            double num = y + 0.5;
            y=y+0.5;
            System.out.println(num);
        }
        
        
        System.out.println("Done");
    }
}
