package EstructurasCondicional;

public class EjemplosWhile {
    public static void main(String[] args) {
        // vamos a hacer un bucle while que imprima los números del 0 al 4
        int i = 0;

        while (i < 5){ // mientras i < 5 sea true, entramos en el bucle
            //dentro del bucle imprimimos i
            System.out.println(i);
            // ES IMPORTANTE que dentro del while haya alguna cosa que el bucle pare en algún momento
            // normalmente es una variable que va cambiadno de valor
            // hasta que toma un valor que hace que la condición sea false
            i++;
        }
        System.out.println("Fuera del bucle");

        int n = 1;
        while (n < 11) {
            System.out.println(n);
            n += 2;
        }
        System.out.println("Fuera del bucle");

        int m = 10;
        while  (m >= 0) {
            System.out.println(m);
            m--;
        }
        System.out.println("Fuera del bucle");
    }
}
