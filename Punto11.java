import java.util.Random;

public class Punto11 {

    public static int contarUnos() {
        int contador = 0;
        Random random = new Random();

        for (int i = 1; i <= 50; i++) {
            int dado = random.nextInt(6) + 1; // numero aleatorio entre 1 y 6
            if (dado == 1) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        int veces = contarUnos();
        System.out.println("El numero 1 salio " + veces + " veces en 50 lanzamientos");
    }
}