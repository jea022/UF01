import java.util.Scanner;

public class JuanAguinaga_Stop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while (true) {
            System.out.println("Ingresa una palabra que no sea la palabra prohibida): ");
            String palabra = s.nextLine();
			
			System.out.println("Buena palabra! ");

			
			

            if (palabra.equals("Stop")){
                System.out.println("Has puesto la palabra prohibida.");
                break;
            }
			
        }


        s.close();
    }
}

