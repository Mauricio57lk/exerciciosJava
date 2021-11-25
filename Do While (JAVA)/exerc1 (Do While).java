import java.util.Scanner;
public class exerc1 {
	public static void main(String args[]) {
		Scanner in = new  Scanner(System.in);
		
		int anoinicial, anofinal, i=0;
		
		System.out.println("Insira o ano inicial:");
		anoinicial = in.nextInt();
		
		System.out.println("Insira o ano final:");
		anofinal = in.nextInt();
		
		System.out.println("Durante o intervalo dos anos "+anoinicial+" e "+anofinal+", os anos bissextos são:");
		
		do {	
			
			if( (anoinicial % 4 == 0 && anoinicial % 100 != 0) || anoinicial % 400 == 0 ){
	
				System.out.println("Ano Bissexto: "+anoinicial);
				i++;
				anoinicial = anoinicial+4;
			}else {
				anoinicial++;
			}
			
		}while(anoinicial <= anofinal);
				
		System.out.println("A quantidade de anos bissextos é de: "+i);
	
		in.close();
	}
}	


