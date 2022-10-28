package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int producto = 1;
        for (int i = num; i >= 1; i--){
            producto *= i;
        }
        System.out.println(producto);
    }
}
