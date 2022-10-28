package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        String user = "Pablito";
        String pass = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Contraseña: ");
        String password = sc.nextLine();

        if (usuario.equals(user) && password.equals(pass)) {
            System.out.println("Has entrado al sistema.");
        } else {
            System.out.println("Error. Usuario o Contraseña incorrectas.");
        }

    }
}
