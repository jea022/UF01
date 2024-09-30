import java.util.Scanner;

public class SumaYMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int contador = 0;

        
        System.out.println("Ingresa 5 números:");
		
		
        
        System.out.print("Ingrese el primer número: ");
        if (sc.hasNextDouble()) {
            double num1 = sc.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            if (sc.hasNextDouble()) {
                double num2 = sc.nextDouble();

                System.out.print("Ingrese el tercer número: ");
                if (sc.hasNextDouble()) {
                    double num3 = sc.nextDouble();

					System.out.print("Ingrese el cuarto número: ");
					if (sc.hasNextDouble()) {
						double num4 = sc.nextDouble();
						
						System.out.print("Ingrese el quinto número: ");
						if (sc.hasNextDouble()) {
							double num5 = sc.nextDouble();
							suma = num1 + num2 + num3 + num4 + num5;
							
							double media = suma / 5;
							System.out.println("La suma de los números es: " + suma);
							System.out.println("La media de los números es: " + media);
							
						} else {
							System.out.println("El quinto valor no es un número válido");
						}
					} else {
						System.out.println("El cuarto valor no es un número válido");
					}
                } else {
                    System.out.println("El tercer valor no es un número válido");
                }
            } else {
                System.out.println("El segundo valor no es un número válido");
            }
        } else {
            System.out.println("El primer valor no es un número válido");
        }     
    }
}