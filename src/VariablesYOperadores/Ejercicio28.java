package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        num3 -= 1; // porque esto así no lo puedo poner del sout
        num4--; // no lo pongo dentro del sout porque me lo imprimiria primero antes de incrementarlo

        System.out.println((num1 - 1) + " " + --num2 + " " + num3 + " " + num4);

    }
}
