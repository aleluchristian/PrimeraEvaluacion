package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame dos números positivos: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Operación a realizar: ");
        char operacion = sc.next().charAt(0); // para guardar una variable por teclado tipo char
        int resultado = 0;

        switch (operacion) {
            case '+':
                resultado = num1+num2;
                break;
            case '-':
                resultado = num1-num2;
                break;
            case '*':
                resultado = num1*num2;
                break;
            case '/':
                resultado = num1/num2;
                break;
            default:
                System.out.println("Fallo de operación");
                break;
        }
        System.out.println("Resultado: " + resultado);
    }
}
