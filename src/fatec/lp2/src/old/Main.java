package fatec.lp2.src.old;

public class Main {

	public static void main(String[] args) {
		Venda venda = new Venda();
		
		venda.addProduto(new Produto("Mouse", 15.00), 2);
		venda.addProduto(new Produto("Teclado", 25.00), 0);
		venda.addProduto(new Produto("Mouse Gamer", 150.00), 1);
		venda.addProduto(new Produto("PlayStation 5", 10000.00), 1);
		venda.addProduto(new Produto("Xbox Series X", 12000.00), 1);
		venda.addProduto(new Produto("iPhone 11", 5000.00), 2);
		venda.addProduto(new Produto("Monitor LG 20''", 500.00), 3);
		
		venda.finalizarVenda();
	}
}
