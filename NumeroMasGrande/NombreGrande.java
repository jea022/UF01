import java.util.Scanner;

class NombreGrande {
  public static void main(String[] args) {
	  
		Scanner s = new Scanner(System.in);  // Create a Scanner object
		double numero1, numero2, numero3;
		double mayor=0;
		
		try{
			System.out.println("Introduce el primer numero");
			numero1 = s.nextDouble();
			System.out.println("Introduce el segundo numero");
			numero2 = s.nextDouble();
			System.out.println("Introduce el tercer numero");
			numero3 = s.nextDouble();
			
				double mayor = Math.max(Math.max(numero1, numero2), numero3);
				System.out.println("El número más grande es: " + mayor);
			} catch (InputMismatchException e) {
				System.out.println(" Debe ingresar números válidos ");
			} finally {
				sc.close();
			}
		}
	
		
		if (numero1 >= numero2 && numero1 >= numero3){
			mayor = numero1;
		}
		else if (numero2 >= numero1 && numero2 >= numero3){
			mayor = numero2;
		}
		else {
			mayor = numero3;
		}

		System.out.println(" El número más grande es: " + mayor);
		
  	}
}