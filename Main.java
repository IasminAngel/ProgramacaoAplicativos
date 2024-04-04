import java.util.Scanner; 

public class Main {
	public static void main(String[]args) {	
		Scanner leitura= new Scanner (System.in);	
		
		int numNotas = 3;
		double TotalNotas = 0;
		int contador = 0;
	
		while (contador < numNotas) {
				contador++;
				System.out.println("Digite a nota" + contador + ":");
				double nota= leitura.nextDouble();
				TotalNotas += nota; 
		}
		
		double media = TotalNotas / numNotas;
		
		System.out.println("Média das notas:" +media);
			
			leitura.close();
		}
	}

