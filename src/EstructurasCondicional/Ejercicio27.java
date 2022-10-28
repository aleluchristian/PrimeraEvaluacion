package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número positivo: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("No me vale para hacer un cuadrado.");
        }else {
            System.out.println("Carácter: ");
            char c = sc.next().charAt(0);
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        }
    }
}
