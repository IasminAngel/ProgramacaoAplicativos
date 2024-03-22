import java.util.Scanner;

public class Atividade_2203_Notas {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numeNotas = 3;
        double totalNotas = 0;

        for (int i = 1; i <= numeNotas; i++) {

            System.out.printf("Digite a %dº nota:", i);
            double notas = leitura.nextDouble();
            totalNotas += notas;
        }
        double media = totalNotas / numeNotas;

        System.out.println("Média:" + media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
