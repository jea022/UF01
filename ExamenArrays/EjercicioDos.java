import java.util.Scanner;
import java.util.Arrays;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la longitud del vector: ");
        if (sc.hasNextInt()) {
			
            int longitud = sc.nextInt();
            int[] vector = new int[longitud];

            for (int i=0; i<longitud; i++) {
                System.out.print("Ingrese el valor para la posición " + i + ": ");
                if (sc.hasNextInt()) {
                    vector[i]=sc.nextInt();
                } else {
                    System.out.println("Ingrese un número válido.");
                    return;
                }
            }

            System.out.print("Ingrese un valor a buscar: ");
            if (sc.hasNextInt()) {
                int valor =sc.nextInt();
                buscarValor(vector, valor);
            } else {
                System.out.println("Ingrese un número válido.");
            }
			
        } 
		
		else {
            System.out.println("Ingrese un número válido.");
        }

        sc.close();
    }
	
	
    private static void buscarValor(int[] vector, int Valor) {
        for (int i=0; i<vector.length; i++) {
            if (vector[i] == Valor) {
                System.out.println("El valor " + Valor + " esta en la posicion " + i);
                return;
            }
        }

        System.out.println("No se encontro el valor:" + Valor);
    }
}