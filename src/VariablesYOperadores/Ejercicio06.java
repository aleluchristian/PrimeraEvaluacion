package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Dime un número de ardillas: ");
        int n = sc.nextInt();
        System.out.print("Dime un número de nueces: ");
        int k = sc.nextInt();
        int cociente = k/n;
        int resto = k%n;

        System.out.println("Tenemos " + n + " ardillas " + "y tenemos " + k + " nueces entonces a cada ardilla le damos " + cociente + " y sobran " + resto);


    }
}
