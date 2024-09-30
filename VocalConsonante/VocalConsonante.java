import java.util.Scanner;

public class VocalConsonante {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce una letra: ");
        String input = s.nextLine();

        if (input.length() == 1) {
            char letra = input.charAt(0);

            if (esVocal(letra)) {
                System.out.println("La letra " + letra + " es una vocal.");
            } else if (esConsonante(letra)) {
                System.out.println("La letra " + letra + " es una consonante.");
            } else {
                System.out.println("Esto no es una letra.");
            }
        } else {
            System.out.println("Error: Ingresa solo una letra");
        }

        s.close();
    }

    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static boolean esConsonante(char c) {
        c = Character.toLowerCase(c);
        return Character.isLetter(c) && !esVocal(c);
    }
}

