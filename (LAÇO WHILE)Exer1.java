public class Exercicio1 {
	public static void main(String[]args) {
		
		
		int i=0; 
		double Joao=134, Pedro=145; 
		
		
		
		while(Joao<=Pedro) {
			
			/*Ao invés de ser somado 2.5, está sendo somado 3.5, então resolvi colocar o (-1) */
			Joao= 2.5+(-1)+Joao;
			Pedro= 2.0+Pedro;
			
			if (Joao<=Pedro) {
				
				Joao++;
			}else {
				
				Pedro++;
					
			}
			i++;
		}
		System.out.println("No "+i+"º ano João se torna maior que Pedro, sua altura é: "+Joao);
		System.out.println("Demorou "+i+" anos para João se tornar mais alto do que Pedro");
	}
}

