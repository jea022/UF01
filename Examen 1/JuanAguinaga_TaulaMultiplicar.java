import java.util.Scanner;

public class JuanAguinaga_TaulaMultiplicar {
  public static void main (String[] args) {
		Scanner s = new Scanner(System.in);


        int cantidadTablas = 0;

		
		while (true) {
            System.out.print(" Ingresa el número de tablas que quieras saber: ");
            if (s.hasNextInt()) {
                cantidadTablas = s.nextInt();
                break;
            } else {
                System.out.println(" Ingresa un NUMERO válido ");
                s.nextLine(); 
            }
        }
		
		
        
		for (int i = 1; i <= cantidadTablas; i++){
            System.out.println(" Tabla de multiplicar del " + i + ":");
            
			
			
			
			for (int j = 1; j <= 10; j++){
                int resultado = i * j;
                System.out.println(i + " * " + j + " = " + resultado);
				
				
			}
        }

        s.close();
    }
}
