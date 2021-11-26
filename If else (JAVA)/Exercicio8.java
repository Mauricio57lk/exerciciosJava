package programas2;

import java.util.Scanner;
public class Exercicio8 {
public static void main (String []args) {
	Scanner in = new Scanner (System.in);
	double n1, n2, media, nExame, novaMedia;
	
	System.out.println("Insira a 1ª nota: ");
	n1 = in.nextDouble();
	System.out.println("Insira a 2ª nota: ");
	n2 = in.nextDouble();
	
	media = (n1 + n2)/2;
	System.out.println("A média do aluno é: "+media);
	
	if (media<3) {
		System.out.println("\n O aluno está REPROVADO");
	} else if (media>=6) {
		System.out.println("\n O aluno está APROVADO");
		} else if (media>=3 && media<6) {
			System.out.println("\n O aluno está em EXAME");
		
			System.out.println("\n Insira a nota de EXAME: ");
			nExame = in.nextDouble();
			novaMedia = (media+nExame)/2;
	
	
	
	if (novaMedia>6) {
		System.out.println("\n Aprovado"); 
    } else { 
    	System.out.println("\n Reprovado");
    }
}
	
in.close();
	}
}
