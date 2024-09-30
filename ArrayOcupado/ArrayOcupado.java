import java.util.Scanner;

public class ArrayOcupado {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float[] arrayNotes = {5f, 5.7f, 6f, 4.8f, 9f, 3.1f, 7f, 3.2f, 8.9f, 10f};

        boolean trobat = false;

        int i = 0;

        while (i < arrayNotes.length) {
            if (arrayNotes[i] == 10) {
                trobat = true;
                break;
            }
            i = i + 1;
        }

        if (trobat) {
            System.out.println("Algú ha tret un 10.");
        } else {
            System.out.println("Ningú no ha tret un 10");
        }
    }
}
