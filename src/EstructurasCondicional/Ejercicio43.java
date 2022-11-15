package EstructurasCondicional;

public class Ejercicio43 {
    public static void main(String[] args) {
        int num = 1;
        int contadorDeMultiplosDe5 = 0;
        while (contadorDeMultiplosDe5 < 50){
            if (num % 5 == 0){
                System.out.print(num + " ");
                contadorDeMultiplosDe5++;// cada vez que encontramos un múltiplo incrementamos el contador
                if (contadorDeMultiplosDe5 % 10 == 0) {
                    System.out.println();
                }
            }
            num++;
        }
    }
}
