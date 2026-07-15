public class Punto9 {

    public static void imprimirColumnas() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + "        " + (101 - i));
        }
    }

    public static void main(String[] args) {
        imprimirColumnas();
    }
}