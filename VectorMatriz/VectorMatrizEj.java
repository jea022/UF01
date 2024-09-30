import java.util.Scanner;

public class VectorMatrizEj {
	public static void main(String[] args) {
		int[] vec={10, 20, 30, 40};
		
		vec [0]=10;
		vec [1]=20;
		vec [2]=30;
		vec [3]=40;
		
		System.out.println("Longitud del vector " + vec.length);
		
		
		for(int i=0; i<vec.length; i++) {
			System.out.println("Valor de i" + i);
			System.out.println(vec[i]);
		}
	}
	
}