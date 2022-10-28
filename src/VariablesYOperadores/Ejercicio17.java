package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la distancia para la base: ");
        int base = sc.nextInt();
        System.out.println("Dame la distancia para la altura: ");
        int altura = sc.nextInt();
        System.out.println("El area del triangulo es: " + base*altura/2);
        System.out.println("=========================");
        System.out.println("Dame otra distancia para la base: ");
        float base1 = sc.nextFloat();
        System.out.println("Dame otra distancia para la altura: ");
        float altura1 = sc.nextFloat();
        System.out.println("El area del triangulo es: " + base1*altura1/2);
    }
}
