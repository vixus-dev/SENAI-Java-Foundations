package Exercício_5;

public class Loja {

	public static void main(String[] args) {
		//criando os produtos
		Produto produto1 = new Produto("Camiseta", 49.90);
		Produto produto2 = new Produto("Calça", 69.90);
		Produto produto3 = new Produto("Blusa", 189.90);
		
		//adicionando os produtos
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarProduto(produto1);
		carrinho.adicionarProduto(produto2);
		carrinho.adicionarProduto(produto3);
		
		//listando os produtos
		carrinho.listarProdutos();
		
		//Exibindo o total
		System.out.println("----< calculando o total da sua compra >----");
		System.out.println("O total da sua compra é:" + carrinho.calcularTotal());
		
		//removendo um produto
		carrinho.removerProduto(produto2);
		
		//listando os produtos novamente!!!
		System.out.println("----< calculando o total da sua compra >----");
		System.out.println("O total da sua compra é:" + carrinho.calcularTotal());
	}
}
