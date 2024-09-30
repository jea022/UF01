import java.util.Scanner;

public class NumeroMasGrande {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        if (sc.hasNextDouble()) {
            double numero1 = sc.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            if (sc.hasNextDouble()) {
                double numero2 = sc.nextDouble();

                System.out.print("Ingrese el tercer número: ");
                if (sc.hasNextDouble()) {
                    double numero3 = sc.nextDouble();
                    double mayor = numero1;

                    if (numero2 > mayor) {
                        mayor = numero2;
                    }
                    if (numero3 > mayor) {
                        mayor = numero3;
                    }

                    System.out.println("El número más grande es " + mayor);
                } else {
                    System.out.println("El tercer valor no es un número válido");
                }
            } else {
                System.out.println("El segundo valor no es un número válido");
            }
        } else {
            System.out.println("El primer valor no es un número válido");
        }

        sc.close();
    }
}