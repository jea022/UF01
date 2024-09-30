import java.util.Scanner;

public class Potencias2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número límite: ");
        int limite = scanner.nextInt();

        System.out.println("Potencias de 2 hasta llegar a " + limite + ":");

        int exponente = 0;
        int resultado = 1;

        while (resultado <= limite) {
            System.out.println("2^" + exponente + " = " + resultado);
            exponente++;
            resultado = (int) Math.pow(2, exponente);
        }
    }
}
