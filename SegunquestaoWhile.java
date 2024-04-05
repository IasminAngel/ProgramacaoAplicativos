import java.util.Scanner;

public class SegunquestaoWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int contador = 0;

        while (contador != 70) {
            contador++;

            if (contador % 2 != 0) {
                System.out.println(contador);
            }

        }
    }

}