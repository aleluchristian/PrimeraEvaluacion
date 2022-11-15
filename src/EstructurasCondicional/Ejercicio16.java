package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elije una casa: " + "\n1. Gryffindor:" + "\n2. Hufflepuff" + "\n3. Slytherin" + "\n4. Ravenclaw");
        int casa = (int) (Math.random() * 5 + 1);

        switch (casa){
            case 1:
                System.out.println("Valentia");
                break;
            case 2:
                System.out.println("Lealtad");
                break;
            case 3:
                System.out.println("Astucia");
                break;
            case 4:
                System.out.println("Intelecto");
                break;
            default:
                System.out.println("No es un número válido");
        }
    }
}
