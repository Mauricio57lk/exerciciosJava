package programas2;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double sal, taxa = 0, parc = 0, imposto;
		System.out.println("Entre com o salário: ");
		sal = in.nextDouble();
		if (sal <=1434.59) {
			System.out.println("Isento");
			} else if (sal <=2150) {
				imposto = sal*7.5/100 - 107.59;
				System.out.println("Você deve R$"+imposto);
				} else if (sal <=2866.7) {
					taxa = 15;
					parc = 268.84;
					} else if (sal <=3582) {
						taxa = 22.5;
						parc = 483.84;
						} else {
							taxa = 27.5;
							parc = 662.94;
			
		}
		imposto = sal/100*taxa - parc;
		System.out.printf("O imposto devido é R$%.2f",imposto);
			
		
		in.close();
		
		
	}
}
