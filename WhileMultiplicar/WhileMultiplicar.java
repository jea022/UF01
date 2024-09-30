import java.util.Scanner;

public class WhileMultiplicar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingresa la tabla por la que quieras multiplicar: ");
        int tabla = s.nextInt();
        
        System.out.println("Tabla de multiplicar del número " + tabla);
        
        int i = 10;
        int resultado = 0;
		

        while (i >= 0) {
            resultado = tabla * i;
            System.out.println(tabla + " * " + i + " = " + resultado);
            i--;
        }
        
        System.out.println("Aquí tienes la tabla de multiplicar de " + tabla);
        
        s.close();
    }
}







