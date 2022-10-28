package EstructurasCondicional;

import java.util.Scanner;

public class EjemplosDoWhile {
    public static void main(String[] args) {
        // La ventaja que tiene do-while es que SIEMPRE SIEMPRE se va a ejecutar almenos una vez
        // por ejemplo, pedimos números y 0 para salir
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce números (0 para salir):");
        int num = 0;
        do {
           num = sc.nextInt();
        }while (num != 0); // mientras eso no sea false, va a seguir pidiendo números
    }
}
