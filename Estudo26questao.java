import java.util.Scanner;

public class Estudo26questao {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        String[] fruta = { "Banana", "Cajá", "Goiaba", "Uva", "Pêra", "Maçã", "Damasco", "Melão", "Laranja" };
        System.out.println("Digita o numero da fruta");
        int numero = leitura.nextInt();

        if (numero == 1) {
            System.out.printf("Fruta: %s", fruta[1]);
        }
        if (numero == 0) {
            System.out.printf("Fruta: %s", fruta[0]);
        }
        if (numero == 2) {
            System.out.printf("Fruta: %s", fruta[2]);
        }
        if (numero == 3) {
            System.out.printf("Fruta: %s", fruta[3]);
        }

        if (numero == 4) {
            System.out.printf("Fruta: %s", fruta[4]);
        }

        if (numero == 5) {
            System.out.printf("Fruta: %s", fruta[5]);
        }

        if (numero == 6) {
            System.out.printf("Fruta: %s", fruta[6]);
        }

        if (numero == 7) {
            System.out.printf("Fruta: %s", fruta[7]);
        }

        if (numero == 8) {
            System.out.printf("Fruta: %s", fruta[8]);
        }

    }

}
