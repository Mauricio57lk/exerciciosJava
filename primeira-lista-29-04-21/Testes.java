import java.util.Scanner;
public class Testes {
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        double valorProduto, descontoPorcentagem, valorDesconto, valorFinal;
        
        System.out.println("Informe o valor do produto:");
        valorProduto= in.nextDouble();
        
        System.out.println("Informe o desconto em porcentagem:");
        descontoPorcentagem= in.nextDouble();
        
        valorDesconto=(descontoPorcentagem*valorProduto)/100;
        
        valorFinal=(valorProduto-valorDesconto);
     
        System.out.println("O valor do produto com o desconto é: "+valorFinal);
     
        in.close();
	}
}


