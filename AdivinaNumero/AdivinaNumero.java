import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(10) + 1;
        int intentos = 0;
        int intentoUsuario;

        System.out.println("Adivina el número secreto");
       

        while (true) {
            System.out.print("Adivina el numero: ");
            intentoUsuario = sc.nextInt();
            intentos++;

            if (intentoUsuario == numeroSecreto) {
                System.out.println("Adivinaste el número secreto (" + numeroSecreto + ") en " + intentos + " intentos.");
                break;
            } else if (intentoUsuario < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
			}
        }

        sc.close();
    }
}
