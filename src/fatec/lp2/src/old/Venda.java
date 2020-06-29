package fatec.lp2.src.old;

import java.util.ArrayList;

public class Venda {
	private ArrayList<Produto> prods = new ArrayList<Produto>();

	public void addProduto(Produto nProd, int qtde) {
		for (int i = 0; i < qtde; i++) {
			prods.add(nProd);
		}
	}

	public void finalizarVenda() {
		// Exibe os produtos
		System.out.println("Produtos:\n");
		System.out.println("---------------------------------");
		for (Produto prod : prods) {
			System.out.println(prod.getNome()
					+ (prod.getNome().length() <= 7 ? "\t\t\t" : "\t\t") + "R$"
					+ String.valueOf(prod.getValor()).replace(".", ","));
		}
		// Pega o valor total dos produtos da venda
		double valT = 0.0;
		for (Produto prod : prods) {
			valT += prod.getValor();
		}
		// Exibindo o valor total
		System.out.println("---------------------------------");
		System.out.println("Valor Total: R$" + String.valueOf(valT).replace(".", ","));
	}
}
