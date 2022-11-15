package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio36b_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sueldo base: ");
        double sueldoBase = sc.nextDouble();

        System.out.println("Número de ventas realizadas: ");
        int ventas = sc.nextInt();
        double comisionTotal = 0; // es como la variable suma, vamos acumulando las comisiones de cada venta
        for (int i = 0; i < ventas; i++) {
            // 1. Pido el importe de esa venta
            System.out.println("Importe venta " + (i+1) + ": ");
            double ventai = sc.nextDouble();
            // 2. Ahora calculo la comisión que obtiene por cada venta
            double comisioni = ventai * 10 / 100;
            // 3. Se le suma a la comisión total que voy acumulando
            comisionTotal += comisioni;
        }
        System.out.printf("Obtendrá por comisiones %.2f euros," , comisionTotal);

        // y el total que recibirá en el t¡mes tomando en cuenta su sueldo base y comisiones
        double sueldoTotal = sueldoBase + comisionTotal;
        System.out.println("En total recibirá " + sueldoTotal + " euros");
    }
}
