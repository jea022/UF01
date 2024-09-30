import java.util.Scanner;

class DescuentoControlErrors {
  public static void main(String[] args) {
	  
		
    Scanner s = new Scanner(System.in);  // Create a Scanner object
	
	System.out.print("Cual es el precio de tu producto?";
	float precio = lector.nextFloat();
	lector.nextLine();

	float descuento = 13%;
	float: minimo = 150;
	float descuentoMaximo =55;

	if (precio > 0) {
		if (precio >= minimo) {
			float siDescuento = precio + descuento / 100;
			if (siDescuento > descuentoMaximo) {
			SiDescuento = descuentoMaximo;
		}
		
		precio = precio - SiDescuento;
		
	}
	
	System.out.println(" El precio es " + precio);
	
	else {
		
		System.out.println("El precio es negativo");
		
	}
}
	
	
	
	
	