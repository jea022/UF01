public class MaximoMinimoBubbleSort {

    public static void main(String[] args) {
        int[] vector = {12, 3, 45, -3, 65, -5, 88, 99, 2, 23, 54, 33, 27, 53, 96, 0};

        bubbleSort(vector);

        System.out.println("Vector Ordenado:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();

        int maximo = vector[vector.length - 1];
        int minimo = vector[0];

        System.out.println("El valor más grande es: " + maximo);
        System.out.println("El valor más pequeño es: " + minimo);
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
