package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a:");
        int a = sc.nextInt();
        System.out.println("b:");
        int b = sc.nextInt();
        int suma = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                suma += i;
            }
        } else if (a > b) {
            for (int i = a; i >= b; i--) {
                suma -= i;
            }
        }
        System.out.println("Resultado: " + suma);
    }
}
