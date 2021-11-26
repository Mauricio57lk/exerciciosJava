import java.util.Scanner;

public class ConversorReal {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);

		double real, dolar, euro, cotacaoDolar;
		
		System.out.println("Informe o valor em Reais");
		real = ler.nextDouble();
		
		System.out.println("Informe a cotação do dolar");
		cotacaoDolar = ler.nextDouble();
		
		
		dolar=(real/cotacaoDolar);
		
		System.out.println("O valor do dolar é =" +dolar);
		
	}
		
}
