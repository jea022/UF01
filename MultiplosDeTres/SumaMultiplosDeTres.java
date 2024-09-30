import java.util.Scanner;

public class SumaMultiplosDeTres {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
        System.out.print("Ingrese el límite del intervalo: ");
		int limite = s.nextInt();
		s.close();
		
        int suma = 0;
		
        for (int i = 0; i <= limite; i++) {
            if (i % 3 == 0) {
                suma += i;    
            }
        }
        System.out.println("La suma de los múltiplos de 3 en el intervalo de 0 a " + limite + " es: " + suma);
    }
}
