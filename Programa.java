package aplicacao;
import java.util.Scanner; 


public class Programa {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		Produto produto = new Produto(); 
		
		System.out.println("Informe o produto que ser� cadastrado:");
		produto.produto = leitura.next();
		System.out.println("Informe a quantidade:");
		produto.quantidade= leitura.nextDouble();
		System.out.println("Informe o pre�o individual:");
		produto.preco= leitura.nextDouble();
		
		System.out.println("Confirma��o:" +produto.produto+", estoque atual:"+produto.quantidade + ",pre�o:" + produto.preco);
		
		System.out.println("Deseja inserir mais produtos ? Quantos ?");
		int estoque = leitura.nextInt();
		
		produto.addprodutos(estoque);
		
		System.out.println("Atualiza��o:" +produto.produto + ", Estoque Atual:" +produto.quantidade + ", Pre�o:" + produto.preco);
		
		System.out.println("Atualmente alguma compra foi realizada ?"); 
		estoque = leitura.nextInt();
		
		produto.subproduto(estoque);
		
		System.out.println("Atualiza��o p�s venda:" +produto.produto + ", Estoque Atual:" +produto.quantidade + ", Pre�o:" + produto.preco);
		
		 leitura.close(); 
			
	}
}
