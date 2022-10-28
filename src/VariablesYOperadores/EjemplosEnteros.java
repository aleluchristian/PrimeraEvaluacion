package VariablesYOperadores;

import java.util.Scanner;

public class EjemplosEnteros {
    public static void main(String[] args) {

        // Pedir por teclado dos números y guardarlos en dos cariables de tipo entero
        Scanner sc  = new Scanner(System.in);
        System.out.print("Primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int num2 = sc.nextInt();

        // Crear variables que guarden el resultado de las cinco operaciones posibles
        int cociente = num1/num2;
        int resto = num1%num2;
        int multiplicación = num1*num2;
        int suma = num1+num2;
        int resta = num1-num2;

        // Mostrar el resultado de cada operacion
        System.out.println("El cociente de la division entre " + num1 + " y " + num2 + " es " + cociente + " y el resto es " + resto);
        System.out.println("La suma entre " + num1 + " y " + num2 + " es " + suma);
        System.out.println("La resta entre " + num1 + " y " + num2 + " es " + resta);
        System.out.println("La multiplicación entre " + num1 + " y " + num2 + " es " + multiplicación);


    }
}
