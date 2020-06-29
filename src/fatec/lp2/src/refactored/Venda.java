package fatec.lp2.src.refactored;

import java.util.ArrayList;

public class Venda {
	private ArrayList<Produto> produtosVenda = new ArrayList<Produto>();

	public void addProduto(Produto novoProduto, int quantidadeProdutos) {
		if (quantidadeProdutos > 0) {
			String nomeProduto = novoProduto.getNome();
			double valorProduto = novoProduto.getValor();
			if (quantidadeProdutos > 1) {
				nomeProduto += "(x" + quantidadeProdutos + ")";
				valorProduto *= quantidadeProdutos;
			}
			produtosVenda.add(new Produto(nomeProduto, valorProduto));
		}
	}

	public void finalizarVenda() {
		exibirProdutos();
		calcularValorFinal();
	}

	private void exibirProdutos() {
		System.out.println("Produtos:\n");
		System.out.println("---------------------------------");
		for (Produto prod : produtosVenda) {
			System.out.println(prod.getNome() + "\t\t R$" + tratarValor(prod.getValor()));
		}
	}

	private String tratarValor(double valor) {
		return String.valueOf(valor).replace(".", ",");
	}

	private void calcularValorFinal() {
		System.out.println("---------------------------------");
		System.out.println("Valor Total: R$" + tratarValor(getValorFinal()));
	}

	private double getValorFinal() {
		double valorTotal = 0.0;
		for (Produto prod : produtosVenda)
			valorTotal += prod.getValor();
		return valorTotal;
	}
}
