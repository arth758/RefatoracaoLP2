package fatec.lp2.src.refactored;

public class Produto {
	public String nome;
	public double valor;
	
	public Produto(String nome, double valor) {
		setNome(nome);
		setValor(valor);
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}	
}
