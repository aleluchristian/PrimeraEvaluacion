package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++){
            if (i % 5 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
