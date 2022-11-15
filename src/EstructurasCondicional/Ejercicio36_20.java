package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio36_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame dos números positivos: ");
        int num;
        double suma = 0;
        for (int i = 0; i < 4; i++) {
            num = sc.nextInt();
            suma +=num;
        }
        double media = suma / 4;

        System.out.println("Suma = " + suma);
        System.out.println("Media = " + media);
    }
}
