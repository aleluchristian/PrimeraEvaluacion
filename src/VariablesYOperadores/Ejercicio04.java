package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Tercer número: ");
        int num3 = sc.nextInt();
        System.out.print("Cuarto número: ");
        int num4 = sc.nextInt();

        int multiplicación = num3*num4;
        int suma = num1+num2;

        System.out.println("La suma entre " + num1 + " y " + num2 + " es " + suma);
        System.out.println("La multiplicación entre " + num3 + " y " + num4 + " es " + multiplicación);


    }
}
