package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tenemos varios tipos de helados: sin topping, de oreo, de KitKat, de brownie o de lacasitos ¿Cual elijes? ");
        String topping = sc.nextLine();
        double precio = 1.90;
        double preciot = 0;
        switch (topping) {
            case "sin topping":
                preciot = precio;
                System.out.println("Cuesta 1.90€");
                break;
            case "de oreo":
                preciot = precio+1;
                System.out.println("El helado cuesta 1,90€ y el topping 1€");
                break;
            case "de kitkat":
                preciot = precio+1.50;
                System.out.println("El helado cuesta 1,90€ y el topping 1,50€");
                break;
            case "de brownie":
                preciot = precio+0.75;
                System.out.println("El helado cuesta 1,90€ y el topping 0,75€");
                break;
            case "de lacasitos":
                preciot = precio+0.95;
                System.out.println("El helado cuesta 1,90€ y el topping 0,95€" ) ;
                break;
            default:
                preciot = precio;
                System.out.println("No tenemos del topping, lo sentimos.");
                System.out.println("El precio del helado sin topping es " + precio);
        }
        System.out.printf("Total : %.2f €" , preciot);

    }
}
