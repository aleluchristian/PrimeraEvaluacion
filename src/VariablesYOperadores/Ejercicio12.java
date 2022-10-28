package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número:");
        int num1 = sc.nextInt();
        int decenasrestantes = num1%100;
        int decenas = decenasrestantes/10;
        int unidades = decenasrestantes%10;
        int centenas = num1 /100;
        System.out.println("Este es el mismo número pero invertido: " + unidades + decenas + centenas);
    }
}
