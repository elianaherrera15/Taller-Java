import java.util.Scanner;

public class Punto6 {

    public static void descomponerEnFactores(int numero) {
        int divisor = 2;

        System.out.println("Los factores primos de " + numero + " son:");
        while (numero > 1) {
            if (numero % divisor == 0) {
                System.out.println(divisor);
                numero = numero / divisor;
            } else {
                divisor = divisor + 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int valor = sc.nextInt();

        descomponerEnFactores(valor);
    }
}