import java.util.Scanner;  // Import the Scanner class

class Multiplicacion {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);  // Create a Scanner object
    System.out.println("que edad tienes?");

    int edad = s.nextInt();  // Read user input
    System.out.println("tu edad es: " + edad);  // Output user input
  }
}