package ElementosBasicos;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        int edad = sc.nextInt();
        sc.nextLine();
        int añosdeExperiencia = sc.nextInt();
        sc.nextLine();
        String preferenciadeCocina = sc.nextLine();
        System.out.println("El formulario de " + nombre + " de " + edad + " años y " + añosdeExperiencia + " de experiencia, está completo. Nos\n" +
                "nos comunicaremos con usted si necesitamos alguien que cocine comida " + preferenciadeCocina );


    }
}
