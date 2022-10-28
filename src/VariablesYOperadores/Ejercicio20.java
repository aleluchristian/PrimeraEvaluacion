package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número:");
        int num1 = sc.nextInt();
        System.out.println("Dame otro número:");
        int num2 = sc.nextInt();
        System.out.println("Dame otro número:");
        int num3 = sc.nextInt();
        System.out.println("Dame otro número:");
        int num4 = sc.nextInt();
        int suma = num1+num2+num3+num4;
        int media = suma/4;
        System.out.println("La media de los cuatro números es: " + media);
    }
}
