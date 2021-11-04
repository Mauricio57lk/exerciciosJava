import java.util.Scanner;
public class ConverterMetrosparaQuilometros {
	public static void main(String args[]) {    
    	
		Scanner in = new Scanner(System.in);

             double metros, quilometros;

             System.out.println("Informe o valor em metros:");
             metros = in.nextDouble();
        
             quilometros= metros/1000;
        
             System.out.println("\n O valor em quilômetros é: "+quilometros+"km");
 
             in.close();
      }
         
}





