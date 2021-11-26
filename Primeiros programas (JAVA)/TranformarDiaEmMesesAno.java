import java.util.Scanner;

public class TranformarDiaEmMesesAno {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		
		double dia, meses, ano;
		
		System.out.println("Informe o número de dias");
		dia = ler.nextDouble();
		
		meses=(dia/30.417);
		ano=(dia/365);
		
		System.out.println("Meses = " +meses);
		
		System.out.println("Anos = " +ano);
		
		
		
		
	}

}
