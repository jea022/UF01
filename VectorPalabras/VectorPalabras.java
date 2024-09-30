import java.util.Scanner;

public class VectorPalabras {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String[] arrayNotes = {"Hola", "como", "estas", "hoy", "dia"};
		String[] arrayWords = {"Yo", "muy", "bien", "gracias", "adios"};
		
		
		for (int i = 0; i < arrayNotes.length; i++) {
            System.out.println(arrayNotes[i]);
			
        }
		
		for (int j = 0; j < arrayWords.length; j++) {
            System.out.println(arrayWords[j]);			
        }
		
		
	}
}