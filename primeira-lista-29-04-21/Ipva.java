import java.util.Scanner;
public class Ipva {
	public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
    	
            double valorVeiculo, valorIpva;
                
            System.out.println("Informe o valor do ve�culo:");
            valorVeiculo = in.nextDouble();
        
            valorIpva= (4*valorVeiculo)/100;
         
            System.out.println("O valor do IPVA �: "+valorIpva);
       
            in.close();
	}
}





