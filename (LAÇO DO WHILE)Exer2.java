import java.util.Scanner;
public class exerc3 {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		
		int i=2, maior, menor,n=0;
		
		System.out.println("Insira o 1º número:");
		n = in.nextInt();
		
		maior=n;
		menor= n;
		do {
			
			if(n>maior) {
				maior=n;
			}else if (n<menor) {
				menor= n;
			}
			
			System.out.println("Insira o "+i+"º número:");
			n = in.nextInt();
			i++;
			
		}while (n != 0);
		
		System.out.println("O maior número é: "+maior);
		
		in.close();
	}
}

