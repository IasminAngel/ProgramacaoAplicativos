import java.util.Scanner; 

public class Main2 {
	public static void main(String[]args) {	
		Scanner leitura= new Scanner (System.in);	
		int numero = 20; 
		
		while(numero !=10) {
			System.out.println("Digite um número:");
			numero= leitura.nextInt();
			if(numero==10) {
				System.out.println("Você acertou!");
			} else {
				System.out.println("Você errou!");
			}
		}
		
		leitura.close();
	}
}
