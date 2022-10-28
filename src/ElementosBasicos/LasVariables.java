package ElementosBasicos;

public class LasVariables {
    public static void main(String[] args) {
        // Variables
        int a = 5; // Declaro la variable a y a continuación guardo en ello el valor 5
        System.out.println("La variable a vale " + a);
        // su valor puede ser modificado en cualquier momento
        a = 8;
        System.out.println("La variable a vale " + a);
        // Reglas para nombrar variables
        //No puede comenzar por ningun digito
        //int 0a = 5; (peta)
        //Puede contener cualquier letra o digito
        int c58 = 2;
        //No puede contener ningún caracter especial a excepción de los caracteres _ y $
        int _variable = 3;
        int $otravariable = 4;
        //No puede contener espacios
        //int otra variable = 3; (peta)

        System.out.println("TIPOS DE VARIABLES");
        System.out.println("==================");
        System.out.println("Las variables se declaran poniendo 1ª el tipo de variable que es y 2ª el nombre que le damos a la variable ");
        System.out.println("Variable para números enteros: byte, short, int, long");
        System.out.println("byte");
        byte variableBytePos = 127; // es el número mas grande que puedo guardar en una variable de tipo byte
        byte variableByteNeg = -128; //es el número mas pequeño que puedo guardar en una variable byte
        System.out.println("variableBytePos = " + variableBytePos);
        System.out.println("variableByteNeg = " + variableByteNeg);
        System.out.println("Números con decimales: float o double");
        double decimal = 3.14;
        double numero = 3;
        float otroDecimal = 8.43f; // si declaras una variable de tipo float ponemos una f al final

        // Formas alternativas de declarar una variable (pág 11)
        String lenguaje = "java";
        String version = "8 or superior";
        // Esta también se puede hacer así:
        String lenguaje1 = "java" , version1 = "10 o superior";
        int num1 = 5, num2 = 10; // Declaro dos variables de tipo int en la misma linea
        // También podria hacerlo asi
        int num3; // Aqui declaro la variable sin asignar nada, coge el valor por defecto: en los números, 0
        num3 = 6;
        num3 = num1; // Aquí guarda en num3 el valor de num1 que es 5
        System.out.println(num3);

        // Inferencia de tipos
        var variable = "Hola";
        var otravariable = 10;


    }
}
