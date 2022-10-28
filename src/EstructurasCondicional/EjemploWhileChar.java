package EstructurasCondicional;

public class EjemploWhileChar {
    public static void main(String[] args) {
        // while con variables tipo char sirva para imprimir una parte de la tabla ASCII
        // por ejemplo: las letras mayúsculas
        char letra = 'A';
        while (letra <= 'Z'){
            System.out.println(letra);
            letra++;
        }
    }
}
