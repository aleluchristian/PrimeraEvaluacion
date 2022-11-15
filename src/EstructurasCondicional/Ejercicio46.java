package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAleatorio = (int) (Math.random() * 100 + 1);
        int num = 0;
        do {
            System.out.println("Dame un número entre 1 y 100 (0 para rendirte):");
            num = sc.nextInt();
            if (num > numAleatorio && num <= 100) {
                System.out.println("Es menor");
            } else if (num < numAleatorio && num >= 1) {
                System.out.println("Es mayor");
            } else if (num == numAleatorio) {
                System.out.println("Correcto");
            } else if (num == 0) {
                System.out.println("¡¡¡COBARDEEE!!!");
            } else if (num < 1 || num > 100) {
                System.out.println("Fuera de rango elije otro número");
            }
        } while (num != numAleatorio && num != 0);
    }
}