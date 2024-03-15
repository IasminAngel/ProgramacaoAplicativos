import java.util.Scanner;

public class Aula_1503_CapturaTela {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número:\n");

        float n1 = teclado.nextFloat();
        System.out.println("Digite o segundo número: \n");
        float n2 = teclado.nextFloat();

        float so = n1 + n2;
        float sub = n1 - n2;
        float div = n1 / n2;
        float mult = n1 * n2;

        System.out.println("Resultados: \n");
        System.out.printf("Soma: %.1f \n", so);
        System.out.printf("Divisão: %.1f \n", div);
        System.out.printf("Multiplicação: %.1f \n", mult);
        System.out.printf("Subtração: %.1f \n", sub);
        teclado.close();

    }
}