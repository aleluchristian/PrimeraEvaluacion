package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a:");
        int a = sc.nextInt();
        System.out.println("b:");
        int b = sc.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.println("No me valen.");
        } else {
            int base, altura;
            if (a > b) {
                base = a;
                altura = b;
            } else {
                base = b;
                altura = a;
            }
            System.out.println("Carácter: ");
            char c = sc.next().charAt(0);

            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < base; j++) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        }
    }
}
