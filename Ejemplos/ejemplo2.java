import java.util.Scanner;

public class ejemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayEnters = new int [5];
		int mida = arrayEnters.length;
		int suma =0;
		
		for (int i = 0; i < mida; i++) {
			arrayEnters [i]= sc.nextInt();
			if (i%2==1){
				 suma = arrayEnters [i] + 10;
			}
			else{
				suma=arrayEnters [i];
			}
			
			System.out.println ("El resultado es + " + arrayEnters [i] + "=" + suma);
			
	    }
	}
	
}