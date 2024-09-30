import java.util.Scanner;
import java.util.Arrays;

public class EjercicioUno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector=new int[3];
        int[] vector2=new int[3];

        System.out.println("Ingrese los valores en el vector:");
        for (int i=0; i<3; i++){
            boolean Error=true;
            while(Error) {
                System.out.print("Valor " + (i+1) + " : ");
                if (sc.hasNextInt()) {
                    vector[i] = sc.nextInt();
                    Error=false;
                } else {
                    System.out.println("Ingrese un número válido.");
                    sc.next();
                }
            }
        }

        System.out.println("Ingrese los valores en el vector2:");
        for (int i=0; i<3; i++){
            boolean Error=true;
            while(Error) {
                System.out.print("Valor " + (i+1) + " : ");
                if (sc.hasNextInt()) {
                    vector2[i] = sc.nextInt();
                    Error=false;
                } else {
                    System.out.println("Ingrese un numero valido.");
                    sc.next();
                }
            }
        }

        int[] resultado = new int[3];
        for (int i = 0; i<3; i++) {
            resultado[i] = vector[i] + vector2[i];
        }

        System.out.println("Resultado de la suma: " + Arrays.toString(resultado));

        sc.close();
    }
}