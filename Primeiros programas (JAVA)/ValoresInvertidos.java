import java.util.Scanner;

public class ValoresInvertidos {
	public static void main(String args[]) {
		Scanner ler= new Scanner (System.in);
		
		double valorA, valorB;
		
		System.out.println("Informe o valor de A");
		valorB = ler.nextDouble();
		
		System.out.println("Informe o valor de B");
		valorA = ler.nextDouble();
		
		System.out.println("Aqui estão os valores invertidos:"); 
	    System.out.println("A = "+valorA);
	    System.out.println("B = "+valorB);
	}

}
