package fatec.lp2.src.old;

public class Produto {
	public String nome;
	public double valor;
	
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public String getNome() {
		return this.nome;
	}
}
