package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
       do {
           System.out.println("Introduce entre 1 y 100, ambos inclusive");
           num = sc.nextInt();
       }while (num < 1 || num > 100);
        System.out.println(num);
    }
}
