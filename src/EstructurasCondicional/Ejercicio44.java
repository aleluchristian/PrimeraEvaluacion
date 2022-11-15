package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char caracter;
        do {
            System.out.println("Introduce un caracter: ");
            caracter = sc.nextLine().charAt(0);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' || caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
                System.out.println("Vocal");
            }else if (caracter == ' '){
            break;
            }else{
                System.out.println("No Vocal");
            }
        }while (caracter != ' ');
    }
}
