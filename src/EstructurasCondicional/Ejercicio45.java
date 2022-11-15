package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio45 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int opcion = 0;
            do {
                System.out.println("Menu" + "\n1. Derecha" + "\n2. Izquierda" + "\n3. Subir" + "\n4. Bajar" + "\n5. Salir" + "\nElige:");
                opcion = sc.nextInt();
                if (opcion == 1){
                    System.out.println("→");
                } else if (opcion == 2) {
                    System.out.println("←");
                } else if (opcion == 3) {
                    System.out.println("↑");
                } else if (opcion == 4) {
                    System.out.println("↓");
                }else if (opcion == 5){
                    break;
                }else {
                    System.out.println("Incorrecto");
                }
            }while (opcion != 5);

        }
    }

