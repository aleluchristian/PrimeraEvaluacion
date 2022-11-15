package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio36_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Parcial " + (i + 1) + ": ");
            double parciali = sc.nextDouble();
            suma += parciali;
        }
        double promedioParciales = suma / 3;

        System.out.println("Examen final: ");
        double examenFinal = sc.nextDouble();

        System.out.println("Trabajo final: ");
        double trabajoFinal = sc.nextDouble();

        double porcentajeParciales = promedioParciales * 55 / 100;
        double porcentajeExamenFinal = examenFinal * 30 / 100;
        double porcentajeTrabajoFinal = trabajoFinal * 15 / 100;

        double calificacionFinal = porcentajeParciales + porcentajeExamenFinal + porcentajeTrabajoFinal;
        System.out.printf("La calificación final sera %.2f" , calificacionFinal);
    }
}
