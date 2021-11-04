import java.util.Scanner;
public class DescontoProduto {
	public static void main(String args[]) {
           Scanner in = new Scanner(System.in);
        
           double valorProduto, descontoPorcentagem, valorDesconto, valorFinal;
        
           System.out.println("Informe o valor do produto:");
           valorProduto= in.nextDouble();
        
           System.out.println("Informe o desconto em %:");
           descontoPorcentagem= in.nextDouble();
        
           valorDesconto=(descontoPorcentagem*valorProduto)/100;
        
           valorFinal=(valorProduto-valorDesconto);
     
           System.out.println("\n O valor do produto com desconto é: " + valorFinal+ "R$");
     
           in.close();
	}
}



