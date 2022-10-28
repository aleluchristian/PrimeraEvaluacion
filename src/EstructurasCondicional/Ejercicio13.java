package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Precio inicial: ");
        double precio = sc.nextInt();
        System.out.println("Dime un tipo (A/B): ");
        char tipo = sc.next().charAt(0);
        System.out.println("Tamaño de las uvas (1/2): ");
        int tamaño = sc.nextInt();
        System.out.println("Kilos que se venden: ");
        int kilo = sc.nextInt();
        double resultado = 0;
        if (tipo == 'A' && tamaño == 1){
            resultado = (precio + 0.20);
        } else if (tipo == 'A' && tamaño == 2) {
            resultado = (precio + 0.30);
        } else if (tipo == 'B' && tamaño == 1) {
            resultado = (precio - 0.30);
        } else if (tipo == 'B'  && tamaño == 2) {
            resultado = (precio - 0.50);
        } else {
            System.out.println("Incorrecto");
        }
        double precioTotal = resultado * kilo;
        System.out.println("Son " + precioTotal + "€ por " + kilo + " kilos");

    }
}
