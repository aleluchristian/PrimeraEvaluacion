package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número:");
        int num1 = sc.nextInt();
        int decenas = num1 / 10;
        int unidades = num1 % 10;
        System.out.println("Este es el mismo número pero invertido: " + unidades + decenas);

    }
}
