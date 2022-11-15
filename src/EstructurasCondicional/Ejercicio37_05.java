package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio37_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número: ");
        int n1 = sc.nextInt();
        int max = n1;
        int min = n1;

        // creamos una variable para ir guardadno los números que entran por teclado antes de comparar si son el max o el min
        int numero;
        for (int i = 0; i < 9; i++) {
            System.out.println("Número: ");
            numero = sc.nextInt();
            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
        }

        System.out.println("Aqui el número maximo " + max);
        System.out.println("Aqui el número minimo " + min);

    }
}
