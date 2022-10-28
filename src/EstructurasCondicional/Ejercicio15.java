package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que lenguaje estás estudiando?\n. Java\n2.Kotlin\n3. Scala\n4. Python");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("¡Si!");
            case 2:
            case 3:
            case 4:
            System.out.println("¡No!");
                break;
            default:
                System.out.println("Ese número no es una opción correcta.");
        }
        System.out.println("Fin");
    }
}
