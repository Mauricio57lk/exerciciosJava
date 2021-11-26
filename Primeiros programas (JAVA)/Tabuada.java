import java.util.Scanner;

public class Tabuada {
	public static void main(String args[]) {
		Scanner ler= new Scanner (System.in); 
		
		int n, valor;
		
		
		System.out.println("Informe o número desejado para a tabuada");
		n = ler.nextInt();
		
	    valor= (n*1);
		System.out.println(n+" x 1 = "+valor);
	    
		valor= (n*2);
		System.out.println(n+" x 2 = "+valor);
		
		valor= (n*3);
		System.out.println(n+" x 3 = "+valor);
		
		valor= (n*4);
		System.out.println(n+" x 4 = "+valor);
		
		valor= (n*5);
		System.out.println(n+" x 5 = "+valor);
		
		valor= (n*6);
		System.out.println(n+" x 6 = "+valor);
		
		valor= (n*7);
		System.out.println(n+" x 7 = "+valor);
		
		valor= (n*8);
		System.out.println(n+" x 8 = "+valor);
		
		valor= (n*9);
		System.out.println(n+" x 9 = "+valor);
		
		valor= (n*10);
		System.out.println(n+" x 10 = "+valor);
		
	}

}
