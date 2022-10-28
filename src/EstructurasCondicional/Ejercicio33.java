package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponente = sc.nextInt();
        int producto = 1;
        for (int i = 0; i < exponente ; i++) {
            producto = producto * base ;
        }
        System.out.println(producto);
    }
}
