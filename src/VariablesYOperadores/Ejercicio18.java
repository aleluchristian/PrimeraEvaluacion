package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame unos grados: ");
        int centigrados = sc.nextInt();
        double reamur = centigrados*0.8;
        double fehenheit = (centigrados*9/5)+32;
        double kelvin = centigrados+273;
        System.out.println("Reamur " + reamur);
        System.out.println("Fehenheit " + fehenheit);
        System.out.println("Kelvin " + kelvin);
    }
}
