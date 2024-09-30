import java.util.Scanner;

public class Modulo2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Por favor, ingresa el dividendo: ");
        int dividendo = s.nextInt();

        System.out.print("Por favor, ingresa el divisor: ");
        int divisor = s.nextInt();

        int cociente = 0;

        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }

        System.out.println("El cociente de la división es: " + cociente);
        System.out.println("El residuo de la división es: " + dividendo);

        s	.close();
    }
}
