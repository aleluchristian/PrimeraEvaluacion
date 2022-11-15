package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        double suma = 0;
        int contador = 0;
        do {
            num = sc.nextInt();
            contador++;
            suma += num;
            if (num != 0){
                contador++;
            }
        }while (num != 0);
        double media = suma / contador;
        System.out.println("Esta es la suma: " + suma + " y esta es la media: " + media);
    }
}

