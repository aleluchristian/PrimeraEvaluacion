package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {

        // Vamos a usar dos variables auxiliares: mas y min
        // En max vamos a ir guardando temporalmente el número mayor y menor de ellos
        // en min vamos a ir guardando temporalmente en número menor que tengamos
        Scanner sc = new Scanner(System.in);
        System.out.println("Número: ");
        int n1 = sc.nextInt();
        // al pedir el primer número ese es el mayor y menor que tenemos de momento, asi que lo asignamos a estas variables
        int max = n1;
        int min = n1;

        System.out.println("Número: ");
        int n2 = sc.nextInt();
        if (n2 > max) { // si n2 es mayor que el que teniamos, lo guardamos en max
            max = n2;
        }
        if (n2 < min) { // si n2 es menor que el que teniamos, lo guardamos en min
            min = n2;
        }
        System.out.println("Número: ");
        int n3 = sc.nextInt();
        if (n3 > max) {
            max = n3;
        }
        if (n3 < min) {
            min = n3;
        }
        System.out.println("Número: ");
        int n4 = sc.nextInt();
        if (n4 > max) {
            max = n4;
        }
        if (n4 < min) {
            min = n4;
        }
        System.out.println("Número: ");
        int n5 = sc.nextInt();
        if (n5 > max) {
            max = n5;
        }
        if (n5 < min) {
            min = n5;
        }
        System.out.println("Número: ");
        int n6 = sc.nextInt();
        if (n6 > max) {
            max = n6;
        }
        if (n6 < min) {
            min = n6;
        }
        System.out.println("Número: ");
        int n7 = sc.nextInt();
        if (n7 > max) {
            max = n7;
        }
        if (n7 < min) {
            min = n7;
        }
        System.out.println("Número: ");
        int n8 = sc.nextInt();
        if (n8 > max) {
            max = n8;
        }
        if (n8 < min) {
            min = n8;
        }
        System.out.println("Número: ");
        int n9 = sc.nextInt();
        if (n9 > max) {
            max = n9;
        }
        if (n9 < min) {
            min = n9;
        }
        System.out.println("Número: ");
        int n10 = sc.nextInt();
        if (n10 > max) {
            max = n10;
        }
        if (n10 < min) {
            min = n10;
        }

        System.out.println("Aqui el número maximo " + max);
        System.out.println("Aqui el número minimo " + min);


    }
}

