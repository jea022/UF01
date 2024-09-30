import java.util.Scanner;

public class NombresSeguidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un nombre: ");
        int numero = scanner.nextInt();
        
        System.out.println("Los 10 nombres posteriores a " + numero + " són:");
        
        for (int i = numero; i <= numero + 10; i++) {
            System.out.println(i);
        }
    }
}
