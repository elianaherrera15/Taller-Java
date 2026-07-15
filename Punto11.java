import java.util.Random;

public class Punto11 {

    public static int contarUnos() {
        Random rand = new Random();
        int contador = 0;

        for (int i = 1; i <= 50; i++) {
            int dado = rand.nextInt(6) + 1;
            if (dado == 1) {
                contador = contador + 1;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        int veces = contarUnos();
        System.out.println("El numero 1 salio " + veces + " veces en 50 lanzamientos");
    }
}