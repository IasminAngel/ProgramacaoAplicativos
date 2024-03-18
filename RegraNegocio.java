import java.util.Scanner;

public class RegraNegocio {
    public static void main(String[] args) {
        Scanner escaneando = new Scanner(System.in);

        System.out.println( "Sejam bem-vindos ao site do mercado Pague Bem! Para sabermos se em suas compras está disponibilizado algum benefício, nos responda:\n");
        System.out.println("Responda (1) se é novo cliente ou (2) se já é cliente fiel da loja:\n");
        
        short resposta = escaneando.nextShort();

        switch (resposta) {
            case 1:
                System.out.println("Primeiro, seja bem-vindo, como um novo cliente, você terá 500R$ disponíveis para compras!\n");
                System.out.println("Dentro de 3 meses sendo ativo em nossa loja, seu limite aumentará!\n");
                break;

            case 2:
                System.out.println("Dentre esses 6 meses, quantas compras você efetuou ?:\n");
                float compras = escaneando.nextFloat();

                if (compras > 5) {
                    System.out.println("PARABÉNS, VOCÊ TEM DIREITO A 10% DE DESCONTO!");
                } else {
                    System.out.println("Ah que pena, com mais compras durantes esses meses, pode conseguir um benefício!");
                }

                break;

            default:
                return;
        }

    }
}