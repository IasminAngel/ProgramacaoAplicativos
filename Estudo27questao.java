import java.util.Scanner;

public class Estudo27questao {

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

        System.out.println("Digite o primeiro número (2 operacao): \n");
        float n4 = teclado.nextFloat();
        System.out.println("Digite o segundo número: (2 operacao)\n");
        float n5 = teclado.nextFloat();
        System.out.println("Digite o terceiro número: (2 operacao)\n");
        float n6 = teclado.nextFloat();

        float so2 = n4 + n5 + n6;
        float media2 = so2 / 3;

        float somamedia = media + media2;
        float mediadamedia = somamedia / 2;

        System.out.printf("1º media: %.1f", media);
        System.out.printf("2º media: %.1f", media2);
        System.out.printf("Soma das medias: %.1f", somamedia);
        System.out.printf("Media das medias: %.1f", mediadamedia);

        teclado.close();

    }
}