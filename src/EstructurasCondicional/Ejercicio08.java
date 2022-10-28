package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio08 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Eres culpable? (S/N) ");
            String culpable = sc.nextLine();
            if (culpable.equals("S")){ // la comparación entre String se hace con el método equals; queremos decir: si la variable culpable es igual a "S"
                System.out.println("¡A la carcel!");
            } else if (culpable.equals("N")){
                System.out.println("¡A casa!");
            } else {
                System.out.println("No me tomes el pelo.");
            }
    }
}
