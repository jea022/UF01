import java.util.Scanner;

public class MediaSuspenso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la longitud del array: ");
        int longitud = sc.nextInt();

        int[] arrayEnteros = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingrese el valor en la posición " + i + ": ");
            arrayEnteros[i] = sc.nextInt();
        }




        for (int i = 0; i < arrayEnteros.length - 1; i++) {
            for (int j = 0; j < arrayEnteros.length - 1 - i; j++) {
                if (arrayEnteros[j] > arrayEnteros[j + 1]) {
                    int temp = arrayEnteros[j];
                    arrayEnteros[j] = arrayEnteros[j + 1];
                    arrayEnteros[j + 1] = temp;
                }
            }
        }


        
        int suma = 0;
        for (int i = 0; i < arrayEnteros.length; i++) {
            suma += arrayEnteros[i];
        }
        double media = (double) suma / arrayEnteros.length;

        System.out.print("El array ordenado es: [");
        for (int i = 0; i < arrayEnteros.length; i++) {
            System.out.print(arrayEnteros[i] + " ");
        }
        System.out.println("]");

        System.out.println("La media de los números es: " + media);
    }
}
