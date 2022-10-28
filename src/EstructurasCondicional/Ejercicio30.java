package EstructurasCondicional;

public class Ejercicio30 {
    public static void main(String[] args) {
        int suma = 0;
        int producto = 1;
        for (int i = 0; i < 30; i++) {
            suma += i;
        }for (int i = 1; i < 31; i++){
            producto *= i;
        }
        System.out.println("La suma " + suma + " y el producto es " + producto);
    }
}
