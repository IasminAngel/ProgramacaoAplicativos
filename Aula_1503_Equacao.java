import java.util.Scanner;

public class Aula_1503_Equacao {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número da icógnita:\n");
        float x = teclado.nextFloat();
        float equacaoA = x - (2 * x) + (3 * x) - (4 * x);
        System.out.println(equacaoA);

        System.out.println("Digite o segundo número da icógnita:\n");
        float y = teclado.nextFloat();
        float equacaoB = (2 * y) + (4 * y) - (3 * y) - (8 * y) - (4 / (y));
        System.out.println(equacaoB);

        teclado.close();

    }
}