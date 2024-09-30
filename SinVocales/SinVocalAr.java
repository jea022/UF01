import java.util.Scanner;

public class SinVocalAr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadena;
        char[] arrayCadena;

        System.out.println("Introduce una cadena: ");
        cadena = sc.nextLine();

        arrayCadena = cadena.toCharArray();

        for (int i = 0; i < arrayCadena.length; i++) {

            if (arrayCadena[i] == 'a' || arrayCadena[i] == 'e' || arrayCadena[i] == 'i' ||
                arrayCadena[i] == 'o' || arrayCadena[i] == 'u') {

                arrayCadena[i] = '$';
            } else if (Character.isDigit(arrayCadena[i])) {

                arrayCadena[i] = '*';
            }
        }

        System.out.println("La cadena modificada es: " + new String(arrayCadena));

    }

}