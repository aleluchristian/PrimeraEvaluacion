package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("MOMENTO INICIAL");
        System.out.println("===============");
        System.out.println("Introduce la hora: ");
        int hora1 = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        int minutos1 = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        int segundos1 =sc.nextInt();
        System.out.println("MOMENTO FINAL");
        System.out.println("=============");
        System.out.println("Introduce la hora: ");
        int hora2 = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        int minutos2 = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        int segundos2 =sc.nextInt();
        System.out.println("Datos introducidos: momento inicial: " + hora1 + ":" + minutos1 + ":" + segundos1 + "\t" + "momento final: " + hora2 + ":" + minutos2 + ":" + segundos2);

        int segundosHorasRestantes1 = hora1 * 60 * 60 ;
        int segundosMinutosRestantes1 = minutos1 * 60;
        int segundosTotales1 = segundosHorasRestantes1 + segundosMinutosRestantes1 + segundos1;

        int segundosHorasRestantes2 = hora2 * 60 * 60 ;
        int segundosMinutosRestantes2 = minutos2 * 60;
        int segundosTotales2 = segundosHorasRestantes2 + segundosMinutosRestantes2 + segundos2;

        int diferenciaSegundos = segundosTotales2 - segundosTotales1;

        int segundosRestantes = diferenciaSegundos % 60;
        int minutosTotalesDiferencia = diferenciaSegundos / 60;
        int horasRestantesDiferencia = minutosTotalesDiferencia /60;
        int minutosRestantes = minutosTotalesDiferencia % 60;


        System.out.println("La diferencia entre ambos momentos es : " + horasRestantesDiferencia + ":" + minutosRestantes + ":" + segundosRestantes);


    }
}
