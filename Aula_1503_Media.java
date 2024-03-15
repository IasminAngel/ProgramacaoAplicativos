import java.util.Scanner;

public class Aula_1503_Media {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número:\n");
        float n1 = teclado.nextFloat();
        System.out.println("Digite o segundo número: \n");
        float n2 = teclado.nextFloat();
        System.out.println("Digite o terceiro número: \n");
        float n3 = teclado.nextFloat();

        float so = n1 + n2 + n3;
        float media = so / 3;

        System.out.println("Resultados: \n");
        System.out.printf("Soma: %.1f \n", so);
        System.out.printf("Média: %.1f \n", media);

        if (media >= 7) {
            System.out.println("Aprovado!\n");
        } else {
            System.out.println("Reprovado!: \n");
        }

        teclado.close();

    }
}
