package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1; // empiezo en 1 porque no quiero que me salga 0 como múltiplo de 5
        int contadorDeMultiplosDe5 = 0;
        while (contadorDeMultiplosDe5 < 20){
            if (num % 5 == 0){
                System.out.println(num);
                contadorDeMultiplosDe5++;// cada vez que encontramos un múltiplo incrementamos el contador
            }
            num++;
        }

    }
}
