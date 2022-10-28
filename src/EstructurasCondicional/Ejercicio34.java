package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // primero pido cuantos numeros se van a introducir
        System.out.println("Números a introducir: ");
        int numeros = sc.nextInt();
        int contadorDePositivos = 0; // la variable contador sirve para contar los números que voy metiendo
        int contadorDeNegativos = 0;
        int contadorDeCeros = 0;
        // ahora los vamos pidiendo
        for (int i = 0; i < numeros; i++){
            System.out.println("Introduce números: ");
            int n = sc.nextInt();
            // cada vez que meto un número el contador se incrementa en una unidad
            if (n > 0){
                contadorDePositivos++;
            } else if (n < 0) {
                contadorDeNegativos++;
            }else{
                contadorDeCeros++;
            }
        }
        System.out.println("Total de positivos: " + contadorDePositivos + " Total de negativos: " + contadorDeNegativos + " Total de ceros: " + contadorDeCeros);
    }
}
