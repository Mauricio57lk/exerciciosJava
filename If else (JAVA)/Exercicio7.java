package programas2;

import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String nome,nomeVelho, nomeNovo;
		int id, idVelho, idNovo;
		
		System.out.println("Entre com o 1�nome :");
		nome = in.next();
		System.out.println("Entre com a 1�idade :");
		id = in.nextInt();
		nomeVelho = nome;
		idVelho = id;
		nomeNovo = nome;
		idNovo = id;
		
		System.out.println("Entre com o 2�nome :");
		nome = in.next();
		System.out.println("Entre com a 2�idade :");
		id = in.nextInt();
		if (id > idVelho) {
			idVelho = id;
			nomeVelho = nome;	
		}else if (id < idNovo) {
			idNovo = id;
			nomeNovo = nome;	
		}
		
		System.out.println("Entre com o 3�nome :");
		nome = in.next();
		System.out.println("Entre com a 3�idade :");
		id = in.nextInt();
		if (id > idVelho) {
			idVelho = id;
			nomeVelho = nome;
		}else  if (id < idNovo) {
			idNovo = id;
			nomeNovo = nome;
		}
		
		System.out.println("Entre com o 4�nome :");
		nome = in.next();
		System.out.println("Entre com a 4�idade :");
		id = in.nextInt();
		if (id > idVelho) {
			idVelho = id;
			nomeVelho = nome;
		}else  if (id < idNovo) {
			idNovo = id;
			nomeNovo = nome;		
		}
		
		System.out.println("Entre com o 5�nome :");
		nome = in.next();
		System.out.println("Entre com a 5�idade :");
		id = in.nextInt();
		if (id > idVelho) {
			idVelho = id;
			nomeVelho = nome;
		}else  if (id < idNovo) {
			idNovo = id;
			nomeNovo = nome;			
		}
		
		
		System.out.println("O mais novo � "+nomeNovo+" com "+idNovo+" anos");
		System.out.println("O mais velho � "+nomeVelho+" com "+idVelho+" anos");
		
	in.close();	
	}	
}
