package EstructurasCondicional;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dia: ");
        int dia = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("Año: ");
        int año = sc.nextInt();
        if (año != 0) {
            if (mes >= 1 && mes >= 12) {
                if (mes == 1 || mes == 3 || mes == 5 || mes ==7 || mes == 8 || mes == 10 || mes == 10 || mes == 12) {
                    if (dia >= 1 &&  dia >= 31){
                        System.out.println("Fecha correcta " + dia + "/" + mes + "/" + año);
                    }else {
                        System.out.println("Fecha incorrecta");
                    }
                }else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    if (dia >= 1 && dia <=30){
                        System.out.println("Fecha correcta " + dia + "/" + mes + "/" + año);
                    } else if (mes ==2){
                        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0){
                            if (dia >=1 && dia <= 29){
                                System.out.println("Fecha correcta " + dia + "/" + mes + "/" + año);
                            }
                        }else {
                            if (dia >= 1 && dia <= 28){
                                System.out.println("Fecha correcta " + dia + "/" + mes + "/" + año);
                            }
                        }
                    }
                }
            } else { //mes incorrecto
                System.out.println("Fecha incorrecta.");
            }
        } else { //año incorrecto
            System.out.println("Fecha incorrecta.");
        }
    }
}
