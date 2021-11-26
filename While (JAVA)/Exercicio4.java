import java.util.Scanner;
public class questao3 {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		
		int i = 0;
		while (i <= 100){
			
			if (i % 2 == 0){
			  System.out.print(i+" ");
			}
			i+=1;
		}
	in.close(); 
	}
	
}
