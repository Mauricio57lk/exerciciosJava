import java.util.Scanner;
public class questao2 {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		
	       int TAM=10;
	       int i=1, ii;
	       double acm=0, ma=0;
			
	       do{
	    	   System.out.println("Entre com o valor:");
	    	   ii = in.nextInt();
	    	   acm +=ii;
	    	   i++;
	       }while(i<=TAM);
	       ma = acm / TAM;
	       
	       System.out.println("O resultado eh:"+ma);
	
	       in.close();
	}
}
