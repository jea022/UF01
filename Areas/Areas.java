import java.util.Scanner;

class Areas {
  public static void main(String[] args) {
	  
		
    Scanner s = new Scanner(System.in);  // Create a Scanner object
	
    System.out.println("Selecciona una figura para calcular su area/n");
	System.out.println("Opciones: triangulo, cuadrado, rectangulo, rombo, trapecio, circulo o paralelogramo./n");
    
	String figura = s.nextLine();
	
	double area = 0;
	
	if(figura.equalsIgnoreCase("triangulo")){
		System.out.println("lerelre");
		double b = 23.0;
		double h = 8.0;
		area = (b*h)/2;
	}
	
	else if(figura.equals("cuadrado")){
		double r = 37.0;
		area = Math.pow(r,2);
	}
	
	else if(figura.equals("rectangulo")){
		double a = 68.0;
		double b = 39.0;
		area = a*b;
	}
	
	else if(figura.equals("trapecio")){
		double a = 35.0;
		double b = 16.0;
		double h = 5.0;
		area = ((a*b)*h)/2;
	}
	
	else if(figura.equals("rombo")){
		double dM = 75.0;
		double dm = 30.0;
		area = (dM*dm)/2;
	}
	
	else if(figura.equals("paralelogramo")){
		double b = 45.0;
		double h = 13.0;
		area = (b*h)/2;
	}
	
	else if(figura.equals("circulo")){
		System.out.println("Radio del circulo");
		double r = s.nextDouble();
		
		area = Math.pow(r,2)*Math.PI;
	}
		
	System.out.println("El area del " + figura + " es " + area);
    
  }
}