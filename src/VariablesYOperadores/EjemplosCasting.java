package VariablesYOperadores;

public class EjemplosCasting {
    public static void main(String[] args) {
        int num = 100; // int ocupa 32 bits
        long numGrande = num; // puedo asignar un int a long son más (casting implicito)

        // ¿y al revés?
        long numGrande2 = 101; // long ocupa 64 bits
        int entero = (int) numGrande2; // esto es un casting explicito

        // de int a short -> casting explicito
        short numeroCorto = (short) num; // no puedo hacerlo directamente porque int son 32 bits y no "caben" en 16 bits (short)

        // de char a int
        char letra = 'a';
        int letraAscii = letra;
        System.out.println(letraAscii);

        // de float a double
        float decimal = 3.1416f;
        double decimalDouble = decimal;

        // de double a float
        double decimalDouble2 = 3.1234567;
        float decimalF = (float) decimalDouble2;

        // de double a int
        int entero32bits = (int) decimalDouble2;
        System.out.println(entero32bits); // resultado imprevisible

        // de double a short
        short entero16bits = (short) decimalDouble2;
        System.out.println(entero16bits);
    }
}
