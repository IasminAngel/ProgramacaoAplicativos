
import java.util.Scanner;

public class QuarquestaoWhile {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int contadorProduto = 0;
        int numeroProdutos = 3;

        while (contadorProduto < numeroProdutos) {
            contadorProduto++;
            System.out.println("Digite o nome do produto " + contadorProduto + ":");
            String nomeProdutos = leitura.next();

            double quantiaMeses = 4;
            double soma = 0;
            int contador = 0;

            while (contador < quantiaMeses) {
                contador++;
                System.out.printf("Mês:\n");
                double meses = leitura.nextDouble();
                soma += meses;
            }

            double vmd = (((soma) / quantiaMeses) / 25);

            System.out.printf("Produto escolhido: %s\n", nomeProdutos);
            System.out.printf("Venda média diária (VMD): %.2f \n", vmd);

            System.out.println("Digite o tempo de reposição(TR):");
            double tr = leitura.nextFloat();
            double emin = (vmd * tr);

            System.out.printf("Estoque minimo (EMIN): %.2f \n", emin);

            System.out.println("Digite o lote de reposição (LR):\n");
            double lr = leitura.nextFloat();

            double emax = (emin + lr);

            System.out.printf("Estoque Máximo (Emax): %.2f \n", emax);

            System.out.printf("Digite o Estoque atual (EA):");
            double ea = leitura.nextFloat();

            if (ea >= emin) {
                System.out.println("Nao comprar!\n");
            } else {
                System.out.println("Comprar!\n");
            }
        }
        leitura.close();

    }

}