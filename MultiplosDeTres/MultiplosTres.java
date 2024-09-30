import java.util.Scanner;

public class MultiplosTres {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese el límite del intervalo:");
		
		
        int limiteSuma = s.nextInt();
        int suma = 0;
        int i = 0;
		
		
        while (i <= limiteSuma) {
						
			if ( i% 3 == 0){
				System.out.println("Sumamos " + suma);
				if (suma+ 3 <= limiteSuma){
					suma = suma + 3;				
				}
			}
			++i;
		}

        System.out.println("El resultado es " + suma);
    }

}