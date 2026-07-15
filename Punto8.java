import java.util.Scanner;

public class Punto8 {

    public static double valorTotalAPagar(double monto, int meses, double interes) {
        double resultado = monto;
        for (int i = 1; i <= meses; i++) {
            resultado = resultado + (resultado * interes / 100);
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el monto del prestamo: ");
        double monto = sc.nextDouble();
        System.out.print("Ingrese el numero de meses: ");
        int meses = sc.nextInt();
        System.out.print("Ingrese el interes mensual (en %): ");
        double interes = sc.nextDouble();

        double total = valorTotalAPagar(monto, meses, interes);

        System.out.println("El valor total a pagar es: " + total);
    }
}