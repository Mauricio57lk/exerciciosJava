package programas2;

import java.util.Scanner;
	public class Exercicio5 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			double a, b, c;
			
			System.out.println("Insira o valor A :");
			a  = in.nextDouble();
			
			System.out.println("Insira o valor B :");
			b  = in.nextDouble();
			
			System.out.println("Insira o valor C :");
			c  = in.nextDouble();
			
			if (a< (b+c) && b < (a + c) && c < (a + b)){ 
			
				if (a == b && b == c) {
					System.out.println("Tri�ngulo equil�tero");
					}else if (a == b || b==c || a==c) {
						System.out.println("Tri�ngulo is�sceles");
						} else {
							System.out.println("Tri�ngulo escaleno");

						}
						
			}else {
				System.out.println("Os valores n�o formam um tri�ngulo");

				in.close();			
			}
		}
	}
	

