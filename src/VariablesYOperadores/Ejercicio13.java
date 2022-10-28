package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int euros = sc.nextInt();
        int billetes500 = euros / 500;
        int auxiliar = euros % 500;
        int billetes200 = euros / 200;
        auxiliar = auxiliar % 200;
        int billetes100 = euros / 100;
        auxiliar = auxiliar % 100;
        int billetes50 = euros / 50;
        auxiliar = auxiliar % 50;
        int billetes20 = euros / 20;
        auxiliar = auxiliar % 20;
        int billetes10 = euros / 10;
        auxiliar = auxiliar % 10;
        int billetes5 = euros / 5;
        auxiliar = auxiliar % 5;
        int moneda2 = euros / 2;
        auxiliar = auxiliar % 2;
        int moneda1 = euros / 1;
        auxiliar = auxiliar % 1;
        System.out.println(euros + " euros: " + billetes500 + " billetes de 500: " + billetes200 + " billetes de 200: " + billetes100 + " billetes de 100: " + billetes50 + " billetes de 50: " + billetes20 + " billetes de 20: " + billetes10 + " billetes de 10: " + billetes5 + " billetes de 5: " + moneda2 + " monedas de 2: " + moneda1 + " monedas de 1: ");

    }
}
