package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Parcial 1: ");
        double parcial1 = sc.nextDouble();
        System.out.println("Parcial 2: ");
        double parcial2 = sc.nextDouble();
        System.out.println("Parcial 3: ");
        double parcial3 = sc.nextDouble();

        double promedioParciales = parcial1 + parcial2 + parcial3 /3;
        System.out.println("Examen final: ");
        double examenFinal = sc.nextDouble();

        System.out.println("Trabajo final: ");
        double trabajoFinal = sc.nextDouble();

        double porcentajeParciales = promedioParciales * 55 / 100;
        System.out.println(porcentajeParciales);
        double porcentajeExamenFinal = examenFinal * 30 / 100;
        System.out.println(porcentajeParciales);
        double porcentajeTrabajoFinal = trabajoFinal * 15 / 100;
        System.out.println(porcentajeTrabajoFinal);

        double calificacionFinal = porcentajeParciales + porcentajeExamenFinal + porcentajeTrabajoFinal;
        System.out.printf("La calificación final sera %.2f" , calificacionFinal);
    }
}
