package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un año:");
        int año = sc.nextInt();
        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0){
            System.out.println("Bisiesto");
        } else {
            System.out.println("No bisiesto");
        }
    }
}
