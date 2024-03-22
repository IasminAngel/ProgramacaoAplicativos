import java.util.Scanner;

public class Atividade_2203_Informar {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Cadastrando nome:\n");
        String nome = leitura.next();

        System.out.println("Saber as informações:\n");
        int numero = leitura.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Saldo da conta: 20.000,00");
                break;
            case 2:
                System.out.println("O usuário cadastrado foi:" + nome);
                break;
            case 3:
                System.out.println("Transferir para atendente");
                break;

            default:
                System.out.println("Inválido");
                break;
        }

        leitura.close();
    }
}