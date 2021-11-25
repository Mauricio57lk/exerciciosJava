import java.util.Scanner;
public class Exercicio1 {
	public static void main(String args[]) {
		Scanner in = new  Scanner(System.in);
		
		int i=1; 
		long n, fatorial=1;
		
		System.out.println("Insira um número inteiro :");
		n = in.nextInt();
		
		do {
			fatorial = fatorial*i;
			i++;
		
		}while (i<=n);
		in.close();
	
		System.out.println("O fatorial de "+n+" é: "+fatorial);
	}

}
