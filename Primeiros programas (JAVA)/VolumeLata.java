import java.util.Scanner;

public class VolumeLata {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		
		double h, raio, volume;
		
		System.out.println("Informe o valor do raio");
		raio = ler.nextDouble();
		
		System.out.println("Informe da altura");
		h = ler.nextDouble();
		
		volume=(3.14*raio*raio*h);
		
		System.out.println("O volume da lata vale = " +volume);
		
		
		
	}

}
