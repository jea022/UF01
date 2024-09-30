public class MaximoMinimo {

    public static void main(String[] args) {
        int[] vector= {12, 3, 45, -3, 65, -5, 88, 99, 2, 23, 54, 33, 27, 53, 96, 0};

        int maximo = vector[0];
        int minimo = vector[0];

        for (int i = 1; i < vector.length; ++i) {
            if (vector[i] > maximo) {
                maximo = vector[i];
            }

            if (vector[i] < minimo) {
                minimo = vector[i];
            }
        }

        System.out.println("El valor más grande es: " + maximo);
        System.out.println("El valor más pequeño es: " + minimo);
    }
}
