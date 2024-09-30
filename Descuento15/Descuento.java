import java.util.Scanner;  // Import the Scanner class

class Descuento {
  public static void main(String[] args) {
	  
		double descuento = 15;
		double minimo = 95;
		
    Scanner s = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Cual es el valor del producto?:");
    double precio = s.nextDouble();  // Leer el primer nombre
	
	if (precio >= minimo) {
		double SiDescuento = precio * descuento/100;
		precio = precio - SiDescuento;
	}

	

  
    System.out.println("El valor del producto es: "  +precio);
  }
}