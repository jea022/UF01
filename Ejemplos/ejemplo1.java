import java.util.Scanner;

public class ejemplo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[5];

        System.out.println("Ingresa los valores del vector:");
		
		// Verificar si el usuario ingresó un número entero 

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingresa el valor " + (i + 1) + ": ");
            

            if (sc.hasNextInt()) {
                vector[i] = sc.nextInt();
            } else {
                System.out.println("ingresa un número válido");
                sc.nextLine(); 
                i--; 
            }
        }

        System.out.println("Vector:");

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            
            
            if (i < vector.length - 1) {
                System.out.print(" ");
            }
        }
		
		
		System.out.println();
	}
}













