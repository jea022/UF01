import java.util.Scanner;

public class TrianguloInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de filas: ");
        int filas = scanner.nextInt();

        for (int i = filas; i >= 1; i--) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}

