package aplicacao;

public class Produto {
	
	public String produto; 
	public Double quantidade; 
	public Double preco;
	
	public void addprodutos(int estoque) {
		this.quantidade += estoque; /* faz referência a quantidade, pois ele tem relação com estoque*/ 
	}
	
	public void subproduto(int estoque) {
		this.quantidade -= estoque;
	}
}


