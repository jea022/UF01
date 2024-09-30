import java.util.Scanner;

public class ArrayInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del array: ");
        int longitud = scanner.nextInt();

        int[] arrayEnteros = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingrese el valor en la posición " + i + ": ");
            arrayEnteros[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrayEnteros.length - 1; i++) {
            for (int j = 0; j < arrayEnteros.length - 1 - i; j++) {
                if (arrayEnteros[j] < arrayEnteros[j + 1]) {
                    int temp = arrayEnteros[j];
                    arrayEnteros[j] = arrayEnteros[j + 1];
                    arrayEnteros[j + 1] = temp;
                }
            }
        }

        System.out.print("El array ordenado en orden descendente es: [");
        for (int i = 0; i < arrayEnteros.length; i++) {
            System.out.print(arrayEnteros[i]);
            if (i < arrayEnteros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
