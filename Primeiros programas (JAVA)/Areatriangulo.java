import java.util.Scanner;

public class Areatriangulo {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		
		double base, h, area;
		
		System.out.println("Informe a base");
		base = ler.nextDouble();
		
		System.out.println("Informe a altura");
		h = ler.nextDouble();
		
		
		area = (base*h)/2;
		
		
		System.out.println("A área do triângulo vale: "+area);
		
	}

}
		
