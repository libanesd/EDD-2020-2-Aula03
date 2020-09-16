package com.unitins;

import java.util.Scanner;

public class Main {
    private static int m;
    private static int n;

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in) ;
        System.out.println("insere o valor de m");
        m = in.nextInt();
        System.out.println("insere o valor de n");
        n = in.nextInt();

        System.out.println(recursiva(n));
    }

    public static int recursiva(int n){  // AQUI E ONDE TEM A FUNCAO
        if (n  == 0) return 0; // CHAMA SE CASO BASE
        else if (n == 1) return 1;
        else return m +   recursiva(n - 1) + 1; //funcao recusiva AQUI MESMO HEIN
    }
}
