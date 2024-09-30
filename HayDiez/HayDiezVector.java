import java.util.Scanner;

public class HayDiezVector {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    float[] arrayNotes = {5f, 5f, 0f, 9f, 10f};

    float maximo = arrayNotes[0];
    int posMax = 0;
    boolean siDiez = false;

    for (int i = 1; i < arrayNotes.length; i++) {
      if (arrayNotes[i] > maximo) {	
		}
		
      if (arrayNotes[i] == 10f) {
        siDiez = true;
		}
    }

    if (siDiez) {
      System.out.println(" Alguien ha sacado un 10 ");
    } else {
      System.out.println(" Nadie ha sacado un 10 ");
    }
  }
}