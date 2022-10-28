package VariablesYOperadores;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Fórmula es: 2 * pi * r
        double r = 3;

        // NEW: el número pi lo podemos poner directamente como Math.PI

        double circunferencia = 2 * Math.PI * r;
        System.out.println(circunferencia);

        // NEW: PARA MOSTRAR UN NÚMERO DE MUCHOS DECIMALES CON SÓLO 2
        System.out.printf("La circunferencia es: %.2f", circunferencia);
    }
}
