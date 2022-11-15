package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sueldo base: ");
        double sueldoBase = sc.nextDouble();
        System.out.println("Importe venta 1: ");
        double venta1 = sc.nextDouble();
        System.out.println("Importe venta 2: ");
        double venta2 = sc.nextDouble();
        System.out.println("Importe venta 3: ");
        double venta3 = sc.nextDouble();

        double comision1 = venta1 * 10 / 100;
        double comision2 = venta2 * 10 / 100;
        double comision3 = venta3 * 10 / 100;
        double comision = comision1 + comision2 + comision3;
        System.out.printf("Obtendrá por comisiones %.2f euros," , comision);

        double sueldoTotal = sueldoBase + comision;
        System.out.println("En total recibirá " + sueldoTotal + " euros");

    }
}
