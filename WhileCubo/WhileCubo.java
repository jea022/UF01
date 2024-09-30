import java.util.Scanner;

public class WhileMultiplicar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingresa el numero del que quieres saber el cubo: ");
        int numero = s.nextInt();
        
        System.out.println("numero y cubo " + cubo);
        
        int i = 9;
        int resultado = 0;
		

        while (i <= 9 ) {
            resultado = tabla * i;
            System.out.println(tabla + " * " + i + " = " + resultado);
            i--;
        }
        
        System.out.println("Aquí tienes la tabla de multiplicar de " + tabla);
        
        s.close();
    }
}
