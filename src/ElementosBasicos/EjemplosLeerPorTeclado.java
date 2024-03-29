package ElementosBasicos;

import java.util.Scanner;

public class EjemplosLeerPorTeclado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ahora ya podemos meter datos por teclado
        // Pero para poder utilizarlos después en el programa
        // Tenemos que guardarlo en una variable
        // Las variables que guardan palabras o cadenas de texto se llaman String
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine(); // EScribe el nombre en el teclado y lo guarda en la variable nombre
        System.out.println("Hola,  " + nombre);

        System.out.println("Introduce tu apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Hola,  " + nombre + " "  + apellido);
        System.out.println("Cuantos años tienes: ");
        int edad = sc.nextInt();
        /*
        Este metodo nestInt() tiene un peligro: si a continuación pones un nextLine() se lo salta.
        La manera de evitarlo es: cada vez que yo escriba nextIn(), si se que luego voy a poner nextLine(),
        escribe un nextLine() adicional, sin más, de esta manera "limpiamos" el sc.
        */
        sc.nextLine();
        System.out.println("Eres muy joven para tener "+ edad + " años");
        System.out.println("¿Tienes mascota?");
        String mascota = sc.nextLine();
        System.out.println("Pues muy bien.");
        // Vamos a meter un dato con decimal
        System.out.println("¿Y cual es tu patrimonio?");
        double patrimonio = sc.nextDouble();
        System.out.println("¡" + patrimonio + "!" );
        // Con los decimales ;
        // Cuando los escribimos en el código fuente se pone .
        // Cuando metemos los datos por teclado se pone ,

    }
}
