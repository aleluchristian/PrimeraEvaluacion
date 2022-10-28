package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Dame un numero: ");
        int num1 = sc.nextInt();
        int segundo = num1 % 60;
        int minuto = num1 / 60;
        int hora = minuto / 60;
        int minutosRestantes = minuto %60;
        System.out.println(num1 + " son " + hora + " horas " + minutosRestantes + " minutos y " + segundo);



    }
}
