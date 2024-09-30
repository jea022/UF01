import java.util.Scanner;

class PrediccionPersona {
  public static void main(String[] args) {
	  
		
    Scanner s = new Scanner(System.in);  // Create a Scanner object
	
    System.out.println("En que mes has nacido?");
	System.out.println("Opciones: enero,febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre/n");
    String mes = s.nextLine();
	
	System.out.println("Cuales tu nombre?");
	String nombre= s.nextLine();
	
	System.out.println("Cuantos años tienes??");
	double edad= s.nextDouble();
	
	double NumeroDeLaSuerte= 0;
	
	String LenguajeDeProgramacion= "";
	
	int Edad=0;
	
	String Equipo= "";
	
	
	
	
	if(mes.equalsIgnoreCase("enero")){
		
		NumeroDeLaSuerte = (edad*3)/2;
		Equipo= "Bayern Munchen";
		LenguajeDeProgramacion = "C++";
		
	}
	
	else if(mes.equals("febrero")){
		
		NumeroDeLaSuerte = edad-4;
		Equipo= "Atletico de madrid";
		LenguajeDeProgramacion = "Python";
	}
	
	else if(mes.equals("marzo")){
		
		NumeroDeLaSuerte = edad/2;
		Equipo= "Chelsea";
		LenguajeDeProgramacion = "JavaScript";
	}
	
	else if(mes.equals("abril")){
		
		NumeroDeLaSuerte = edad %4;
		Equipo= "Manchester City";
		LenguajeDeProgramacion = "Node.js";
	}
	
	else if(mes.equals("mayo")){
		
		NumeroDeLaSuerte = (edad*3)/6;
		Equipo= "Liverpool";
		LenguajeDeProgramacion = "React";
	}
	
	else if(mes.equals("junio")){
		
		NumeroDeLaSuerte= edad+edad;
		Equipo= "Real Madrid";
		LenguajeDeProgramacion = "C#";
	}
	
	else if(mes.equals("julio")){
		
		NumeroDeLaSuerte= (edad*edad)/5;
		Equipo= "Borusia Dortmund";
		LenguajeDeProgramacion = "Swift";

	}
	
	else if(mes.equals("agosto")){
		
		NumeroDeLaSuerte= (edad*0.5*edad);
		Equipo= "FC Barcelona";
		LenguajeDeProgramacion = "Java";

	}
	
	else if(mes.equals("septiembre")){
		
		NumeroDeLaSuerte= edad/edad;
		Equipo= "Juventus";
		LenguajeDeProgramacion = "PHP";

	}
	else if(mes.equals("octubre")){
		
		NumeroDeLaSuerte= edad*(4/3);
		Equipo= "Paris Sant Germain";
		LenguajeDeProgramacion = "R";

	}
	
	else if(mes.equals("noviembre")){
		
		NumeroDeLaSuerte= edad %2+23;
		Equipo= "Sevilla";
		LenguajeDeProgramacion = "Go";

	}
	
	else if(mes.equals("diciembre")){
		
		NumeroDeLaSuerte= (edad+edad)/2;
		Equipo= "Manchester United";
		LenguajeDeProgramacion = "Ruby";

	}
	
	
		
	System.out.println(nombre);
    System.out.println("Tu número de la suerte es: " + NumeroDeLaSuerte);
    System.out.println("Tu equipo de fútbol es: " + Equipo);
    System.out.println("Tu lenguaje de programación preferido es: " + LenguajeDeProgramacion);
    
  }
}