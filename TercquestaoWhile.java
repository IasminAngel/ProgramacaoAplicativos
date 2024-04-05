import java.util.Scanner;

public class TercquestaoWhile {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		int numNotas = 3;
		int numAlunos = 2;

		int contadorAluno = 0;
		while (contadorAluno < numAlunos) {
			contadorAluno++;
			System.out.println("Digite o nome do aluno " + contadorAluno + ":");
			String nomeAluno = leitura.next();
			double totalNotas = 0;

			int contador = 0;
			while (contador < numNotas) {
				contador++;
				System.out.println("Digite a nota " + contador + " do aluno " + nomeAluno + ":");
				double nota = leitura.nextDouble();
				totalNotas += nota;
			}

			double media = totalNotas / numNotas;
			System.out.println("A média do aluno " + nomeAluno + " é: " + media);
		}

		leitura.close();
	}
}
