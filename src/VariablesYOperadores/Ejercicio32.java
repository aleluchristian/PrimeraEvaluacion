package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        boolean menorQue10YMayorQue0 = valor < 10 && valor > 0;
        System.out.println(menorQue10YMayorQue0);
    }
}
