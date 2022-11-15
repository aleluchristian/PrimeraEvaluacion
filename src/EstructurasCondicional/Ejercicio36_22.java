package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio36_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        double nota;
        for (int i = 0; i < 6; i++) {
            System.out.println("Nota " + (i + 1) + " evalución: ");
            nota = sc.nextDouble();
            suma += nota;
        }
        double media = suma / 6;
        media = Math.round(media);
        System.out.println("Media: " + media);
    }
}
