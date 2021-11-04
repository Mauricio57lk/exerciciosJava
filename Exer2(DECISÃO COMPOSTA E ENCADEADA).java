package programas2;
import java.util.Scanner;
	public class Exercicio2 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			double kmL, distPerc, capacTanq;
			
			System.out.println("Informe a capacidade do seu tanque:");
			capacTanq = in.nextDouble();
			
			System.out.println("Informe os Quilômetros percorridos:");
			distPerc = in.nextDouble();
			
			kmL = (distPerc/capacTanq);
			
			System.out.println("Seu carro faz : "+kmL+" quilômetros por litro");
			
			if (kmL>=10) {
				System.out.println("Econômico");
			
			} else {
				System.out.println("Não econômico");
}
			in.close();
		}

}
