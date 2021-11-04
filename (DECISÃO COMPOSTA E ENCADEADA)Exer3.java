package programas2;
import java.util.Scanner;
	public class Exercicio3 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			double peso, altura, imc;
			
			System.out.println("Insira sua altura (m): ");
			altura = in.nextDouble();
			
			System.out.println("Insira o seu peso (kg): ");
			peso = in.nextDouble();
			
			imc = peso/(altura*altura);
			
			System.out.println("Seu IMC é :"+imc);
			
			if (imc<18.5) {
				System.out.println("Excesso de Magreza");
				
				}else if (imc<25) {
					System.out.println("Peso Normal");
					
					}else if (imc<30) {
						System.out.println("Excesso de Peso");
						
						}else if (imc<35) {
							System.out.println("Obesidade (Grau I)");
							
							}else if (imc<40) {
								System.out.println("Obesidade (Grau II)");
								
								}else {
									System.out.println("Obesidade (Grau III)");
								}

			
			in.close();
		}

}
