package aplicacao;

public class Produto {
	
	public String produto; 
	public Double quantidade; 
	public Double preco;
	
	public void addprodutos(int estoque) {
		this.quantidade += estoque; /* faz refer�ncia a quantidade, pois ele tem rela��o com estoque*/ 
	}
	
	public void subproduto(int estoque) {
		this.quantidade -= estoque;
	}
}


