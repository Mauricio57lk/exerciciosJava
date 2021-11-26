import java.util.*;
public class OperadorMod {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		double numero, resultado, valorfinal;
		
		System.out.println("Informe um número:");
		numero = in.nextDouble();
		
		resultado = (numero/2);
		valorfinal = (numero%2);
				
		System.out.println("O valor da divisão por dois é igual a: "+resultado);
		
		System.out.println("\n O restante da divisão é: "+valorfinal);
		in.close();
		
		
	}

}
