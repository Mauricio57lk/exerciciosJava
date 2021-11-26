import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int n; 
		long fatorial =1;
		
		System.out.println("Entre com o numero");
		n = input.nextInt();
		
		if(n<0) {
			System.out.println("Não coloque números negativos");
			
		}else if (n<=1) {
			System.out.printf("%d! = %d"+n,fatorial);
		}else {
			for( int counter = n; counter >= 2; counter-- ) {
				fatorial = fatorial*counter;
			}
			System.out.printf("%d! = %d"+n, fatorial);
		}
	}
}
