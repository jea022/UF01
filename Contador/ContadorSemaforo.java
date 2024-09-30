import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        
        System.out.println("El contador esta en 0");
        
        while (contador < 10) {
            System.out.println("Contador + 1"); 
			++contador;
		} 
		
		System.out.println("El contador ha llegado a 10");
    }
}