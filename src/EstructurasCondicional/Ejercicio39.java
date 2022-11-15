package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0; // esta variable es para guardar el número que cada vez introducimos por teclado
        // para contar los números declaramos una variable contador, que empieza en 0
        int contador = 0;
        do {
            // leo el número
            num = sc.nextInt();
            contador++;
        }while (num != 0);
        System.out.println(contador - 1); // le restamos uno para quitar el 0
    }
}
