public class questao5 {
    public static void main(String[] args) {

        int mes1 = 250, mes2 = 500, mes3 = 800, mes4 = 1200, tr = 6, lr = 85, ea = 100;
        String produto_escolhido = "Processador AMD";
        int quantia_meses = 4;
        int vmd = ((mes1 + mes2 + mes3 + mes4) / quantia_meses) / 25;
        int emin = vmd * tr;
        int emax = emin + lr;

        System.out.println("Sistema de verificação do estoque:\n");
        System.out.println("Produto escolhido:");
        System.out.println(produto_escolhido);

        System.out.printf("Mês 1: %d \n", mes1);
        System.out.printf("Mês 2: %d \n", mes2);
        System.out.printf("Mês 3: %d \n", mes3);
        System.out.printf("Mês 4: %d \n", mes4);
        System.out.printf("Tempo de reposição (TR): %d \n", tr);
        System.out.printf("Lote de reposição (LR): %d \n", lr);
        System.out.printf("Estoque Atual (EA): %d \n", ea);

        System.out.println("De acordo com as informações colocadas acima, aqui está os resultados:\n");
        System.out.printf("Venda Mensal (VMD) : %d \n", vmd);
        System.out.printf("Estoque Mínimo (EMIN) : %d \n", emin);
        System.out.printf("Estoque Máximo (EMAX) : %d \n", emax);

        if (ea > emin) {
            System.out.println("Não comprar!");
        } else {
            System.out.println("Comprar!");
        }

    }

}
