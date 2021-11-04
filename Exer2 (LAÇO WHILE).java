import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		
		int i=1, idade, menor=0, maior=0;
		
		while(i<=10) {
			System.out.println("Informe a idade do "+i+"° aluno" );
			idade = ler.nextInt();

			if(idade<18) {
				menor++;
				
			}else {					
				maior++;
			}
			i++;
				
		}
		System.out.println("Quantidade de alunos menores de idade: "+menor);
		System.out.println("Quantidade de alunos maiores de idade: "+maior);
	
		ler.close();
	}
	
	
	
	}
	
			

