package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un par de números: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("Dame otro par de números: ");
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        double num5 = num2 - num1;
        double num6 = num4 - num3;
        double d = Math.sqrt(Math.pow((num5),2) + Math.pow((num6), 2));
        System.out.println("la distancia entre estos dos puntos es: " + d);

    }
}
