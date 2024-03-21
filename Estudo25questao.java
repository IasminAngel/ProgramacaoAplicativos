import java.util.Scanner;
import java.io.IOException;

public class Estudo25questao {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Leitura do Produto:\n");
        String produto = leitura.next();

        System.out.println("1º Mês:\n");
        float a = leitura.nextFloat();

        System.out.println("2º Mês:\n");
        float b = leitura.nextFloat();

        System.out.println("3º Mês:\n");
        float c = leitura.nextFloat();

        System.out.println("4º Mês:\n");
        float d = leitura.nextFloat();

        float vmd = ((a + b + c + d) / 4) / 25;

        System.out.printf("Produto escolhido: %s\n", produto);
        System.out.printf("Venda média diária (VMD): %.2f \n", vmd);

        System.out.println("Digite o tempo de reposição(TR):");
        float tr = leitura.nextFloat();
        float emin = (vmd * tr);

        System.out.printf("Estoque minimo (EMIN): %.2f \n", emin);

        System.out.println("Digite o lote de reposição (LR):\n");
        float lr = leitura.nextFloat();

        float emax = (emin + lr);

        System.out.printf("Estoque Máximo (Emax): %.2f \n", emax);

        System.out.printf("Digite o Estoque atual (EA):");
        float ea = leitura.nextFloat();

        if (ea >= emin) {
            System.out.println("Nao comprar!\n");
        } else {
            System.out.println("Comprar!\n");
        }

    }
}