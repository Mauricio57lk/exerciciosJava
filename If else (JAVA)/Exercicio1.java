package programas2;
import java.util.Scanner;
	public class Exercicio1 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			int anoNasc, anoAtual, idade;
			
			System.out.println("Insira o ano de seu nascimento");
			anoNasc = in.nextInt();
			
			System.out.println("Insira o ano atual");
			anoAtual = in.nextInt();
			
			idade = (anoAtual-anoNasc);
			
			System.out.println("Sua idade é "+idade+" anos");
			
			if (idade<10) {
				System.out.println("Criança");
			
			} else if (idade<18) {
				System.out.println("Adolescente");

				} else if (idade<60) {
					System.out.println("Adulto");
				
					} else {
						System.out.println("Idoso");
			
}
			in.close();	
	}	
}


		

