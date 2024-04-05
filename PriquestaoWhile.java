import java.util.Scanner;

public class PriquestaoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0;
        int contador = 0;
        while (contador != 8) {
            System.out.printf("Digite o seu %dª valor:", contador + 1);
            int notas = teclado.nextInt();
            contador++;
            soma += notas;
        }
        double media = soma / contador;

        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A média dos valores é: " + media);

        teclado.close();
    }
}