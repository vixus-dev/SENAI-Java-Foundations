package Exercício_5;

import java.util.ArrayList;
import java.util.Iterator;

public class CarrinhoDeCompras {

	ArrayList<Produto> itens;
	
	public CarrinhoDeCompras() {
	    itens = new ArrayList<>();
	}
	
	public void adicionarProduto(Produto produto) {
		itens.add(produto);
		System.out.println("Produto " + produto.getNome() + " foi adicionado!");
	}
	
	public void removerProduto(Produto produto) {
		itens.remove(produto);
		System.out.println("Produto " + produto.getNome() + " foi removido!");
	}
	
	public double calcularTotal() {
		double total = 0;
		for (Produto produto : itens) {
			total += produto.getPreço();
		}
		return total;
	}
	
	public void listarProdutos() {
		if (itens.isEmpty()) {
			System.out.println("O carrinho está vazio!");
		} else {
			System.out.println("Produtos no carrinho:");
			Iterator<Produto> produtoLista = itens.iterator();
			while (produtoLista.hasNext()) {
				Produto produto = produtoLista.next();
				System.out.println("- " + produto.getNome() + ": R$" + produto.getPreço());
			}	
		}
	}
}
