package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        double suma = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Número: ");
            double num = sc.nextInt();
            suma += num;
        }
        double media = suma / 10;
        System.out.println("Resultado: " + media);
    }
}
