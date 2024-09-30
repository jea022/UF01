import java.util.Scanner;

public class RepasDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dato;

        do {
            System.out.print("Ingrese un valor esperado: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Error: Por favor, ingrese un número entero.");
                scanner.next(); // Limpiar el buffer del scanner
            }
            
			dato = scanner.nextInt();

            if (!esValorEsperado(dato)) {
                System.out.println("Error: El valor ingresado no es el esperado.");
            }
        } while (!esValorEsperado(dato));
        System.out.println("Dato válido: " + dato);
        scanner.close();
    }


    private static boolean esValorEsperado(int dato) {
        return dato == 1 || dato == 2 || dato == 3;
    }
}
