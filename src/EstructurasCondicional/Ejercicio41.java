package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introcude números enteros: ");
        num = sc.nextInt();
        int max = num;
        do {
            System.out.println("Introcude más números enteros (0 para salir): ");
            num = sc.nextInt();
            if (num != 0){
                if (num > max){
                    max = num;
                }
            }
        }while (num != 0);
        System.out.println("El número mayor es: " + max);
    }
}
