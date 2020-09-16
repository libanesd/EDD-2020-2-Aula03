package com.unitins;

import java.util.Scanner;

public class Main {
    private static float x;
    private static int n;

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in) ;
        System.out.println("insere o numero q deseja potencializar**");
        x = in.nextFloat();
        System.out.println("insere o valor da potencia?");
        n = in.nextInt();

        System.out.println(recursiva(n));
    }

    public static int recursiva(int n){  // AQUI E ONDE TEM A FUNCAO
        if (n == 0) return 1; // CHAMA SE CASO BASE

        else return (int) (x *  recursiva(n - 1)); //funcao recusiva AQUI MESMO HEIN
    }
}
