package programas2;

import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String nome,nomeVelho, nomeNovo;
		int id, idVelho, idNovo;
		
		System.out.println("Entre com o 1ºnome :");
		nome = in.next();
		System.out.println("Entre com a 1ªidade :");
		id = in.nextInt();
		nomeVelho = nome;
		idVelho = id;
		nomeNovo = nome;
		idNovo = id;
		
		System.out.println("Entre com o 2ºnome :");
		nome = in.next();
		System.out.println("Entre com a 2ªidade :");
		id = in.nextInt();
		if (id > idVelho) {
			idVelho = id;
			nomeVelho = nome;	
		}else if (id < idNovo) {
			idNovo = id;
			nomeNovo = nome;	
		}
		
		System.out.println("Entre com o 3ºnome :");
		nome = in.next();
		System.out.println("Entre com a 3ªidade :");
		id = in.nextInt();
		if (id > idVelho) {
			idVelho = id;
			nomeVelho = nome;
		}else  if (id < idNovo) {
			idNovo = id;
			nomeNovo = nome;
		}
		
		System.out.println("Entre com o 4ºnome :");
		nome = in.next();
		System.out.println("Entre com a 4ªidade :");
		id = in.nextInt();
		if (id > idVelho) {
			idVelho = id;
			nomeVelho = nome;
		}else  if (id < idNovo) {
			idNovo = id;
			nomeNovo = nome;		
		}
		
		System.out.println("Entre com o 5ºnome :");
		nome = in.next();
		System.out.println("Entre com a 5ªidade :");
		id = in.nextInt();
		if (id > idVelho) {
			idVelho = id;
			nomeVelho = nome;
		}else  if (id < idNovo) {
			idNovo = id;
			nomeNovo = nome;			
		}
		
		
		System.out.println("O mais novo é "+nomeNovo+" com "+idNovo+" anos");
		System.out.println("O mais velho é "+nomeVelho+" com "+idVelho+" anos");
		
	in.close();	
	}	
}
