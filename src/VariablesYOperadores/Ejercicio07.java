package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        int num1 = sc.nextInt();
        int hora = num1/60;
        int minuto = num1%60;
        System.out.println(num1 + " son " + hora + " horas y " + minuto + " minutos" );

    }
}
