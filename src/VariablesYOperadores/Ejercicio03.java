package VariablesYOperadores;

public class Ejercicio03 {
    public static void main(String[] args) {
         int num1 = 12;
         int num2 = 4;

        int cociente = num1/num2;
        int resto = num1%num2;
        int multiplicación = num1*num2;
        int suma = num1+num2;
        int resta = num1-num2;
        
        System.out.println("El cociente de la division entre " + num1 + " y " + num2 + " es " + cociente + " y el resto es " + resto);
        System.out.println("La suma entre " + num1 + " y " + num2 + " es " + suma);
        System.out.println("La resta entre " + num1 + " y " + num2 + " es " + resta);
        System.out.println("La multiplicación entre " + num1 + " y " + num2 + " es " + multiplicación);

    }
}
