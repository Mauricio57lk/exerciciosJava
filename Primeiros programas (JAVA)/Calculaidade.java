import java.util.Scanner;
public class Calculaidade {

	public static void main (String args[]) {
		Scanner ler= new Scanner (System.in);
		
		int anoNasc, anoAtual, idade;
		
		System.out.println("Informe o ano de nascimento");
		anoNasc = ler.nextInt();
		
		System.out.println("Informe o ano atual");
		anoAtual = ler.nextInt();
		
		
		idade = (anoAtual-anoNasc);
		System.out.println("Sua idade é: "+idade);
	}

}
