import java.util.Scanner;

public class Media {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    float[] arrayNotes={5f, 5.7f, 6f, 4.8f, 9f, 3.1f, 7f, 3.2f, 8.9f, 10f};

    float maximo = arrayNotes[0]; 

    for(int i = 1; i < arrayNotes.length; i++) {
      if(arrayNotes[i] > maximo) {
        maximo = arrayNotes[i]; 
      }
    }

    System.out.println("La nota máxima es: " + maximo);
  }
}
