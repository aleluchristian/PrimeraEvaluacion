package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio36_21  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        double nota;
        for (int i = 0; i < 3; i++) {
            System.out.println("Nota " + i + " evalución: ");
            nota = sc.nextDouble();
            suma += nota;
        }
        double media = suma / 3;
        System.out.println("Nota final= " + media);
    }
}
