package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la distancia de un lado:");
        double lado = sc.nextDouble();
        System.out.println("El perimetro de un cuadrado es: " + lado*4);
    }
}
