import java.util.Scanner; 

public class Main2 {
	public static void main(String[]args) {	
		Scanner leitura= new Scanner (System.in);	
		int numero = 20; 
		
		while(numero !=10) {
			System.out.println("Digite um n�mero:");
			numero= leitura.nextInt();
			if(numero==10) {
				System.out.println("Voc� acertou!");
			} else {
				System.out.println("Voc� errou!");
			}
		}
		
		leitura.close();
	}
}
