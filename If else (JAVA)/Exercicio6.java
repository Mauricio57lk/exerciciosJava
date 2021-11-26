package programas2;

import java.util.Scanner;
	public class Exercicio6 {
		public static void main(String[] args) {
			Scanner in = new Scanner (System.in);
			int a, b, c;
			
			System.out.println("Insira o valor de A:");
			a = in.nextInt();
			System.out.println("Insira o valor de B:");
			b = in.nextInt();
			System.out.println("Insira o valor de C");
			c = in.nextInt();

			if (a<b && b<c) {
				System.out.println("A ordem crescente é:" +"a=" +a+" b=" +b+" c=" +c);
			}else if(a<c && c<b) {
				System.out.println("A ordem crescente é:" +"a=" +a+" c=" +c+" b=" +b);
				}else if (b<a && a<c) {
					System.out.println("A ordem crescente é:" +"b=" +b+" a=" +a+" c=" +c);
					}else if (b<c && c<a){
						System.out.println("A ordem crescente é:" +"b=" +b+" c=" +c+" a="+a);
						}else if (c<a && a<b){
							System.out.println("A ordem crescente é:" +"c=" +c+" a=" +a+" b="+b);
							}else {
								System.out.println("A ordem crescente é:" +"c=" +c+" b="+b+" a="+a);
						}
						
			in.close();
			
		}			
	}