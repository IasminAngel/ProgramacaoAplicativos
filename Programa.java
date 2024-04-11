package aplicacao;
import java.util.Scanner; 


public class Programa {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		Produto produto = new Produto(); 
		
		System.out.println("Informe o produto que será cadastrado:");
		produto.produto = leitura.next();
		System.out.println("Informe a quantidade:");
		produto.quantidade= leitura.nextDouble();
		System.out.println("Informe o preço individual:");
		produto.preco= leitura.nextDouble();
		
		System.out.println("Confirmação:" +produto.produto+", estoque atual:"+produto.quantidade + ",preço:" + produto.preco);
		
		System.out.println("Deseja inserir mais produtos ? Quantos ?");
		int estoque = leitura.nextInt();
		
		produto.addprodutos(estoque);
		
		System.out.println("Atualização:" +produto.produto + ", Estoque Atual:" +produto.quantidade + ", Preço:" + produto.preco);
		
		System.out.println("Atualmente alguma compra foi realizada ?"); 
		estoque = leitura.nextInt();
		
		produto.subproduto(estoque);
		
		System.out.println("Atualização pós venda:" +produto.produto + ", Estoque Atual:" +produto.quantidade + ", Preço:" + produto.preco);
		
		 leitura.close(); 
			
	}
}
