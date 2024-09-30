import java.util.Scanner;  // Import the Scanner class

class Descuento8 {
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Ingresa el primer numero:");
    double numero1 = s.nextDouble();  // Leer el primer nombre

    System.out.println("Ingresa el segundo numero:");
    double numero2 = s.nextDouble();  // Leer el segundo nombre

    System.out.println("Ingresa el tercer numero:");
    double numero3 = s.nextDouble();  // Leer el tercer nombre

    System.out.println("Los nombres son: "  +numero1*numero2*numero3);
  }
}