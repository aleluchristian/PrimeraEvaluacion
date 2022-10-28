package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime número de tazas: ");
        int tazas = sc.nextInt();
        System.out.print("Dime si es finde o no: ");
        boolean finde = sc.nextBoolean();
        boolean exito;
        if (tazas >= 10 && tazas <= 20 && finde == false) {
            exito = true;
        } else if (finde == true && tazas >= 15 && tazas <= 25) {
            exito = true;
        } else {
            exito = false;
        }

        // ponemos el resultado
        System.out.println("¿La fiesta tiene exito? " + exito);

    }
}
