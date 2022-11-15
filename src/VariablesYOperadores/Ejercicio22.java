package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1ª Evaluación:");
        double num1 = sc.nextDouble();
        System.out.print("Nota 2ª Evaluación:");
        double num2 = sc.nextDouble();
        System.out.print("Nota 3ª Evaluación:");
        double num3 = sc.nextDouble();
        double suma = num1+num2+num3;
        double media = suma /3;
        System.out.println("La media entre la nota de las tres evaluaciones es: " + media);
    }
}
