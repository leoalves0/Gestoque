package Entidades;

public class Produto {

	private String codigo;
	private String nome;

	private Produto(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public static Produto novo(String codigo, String nome) {
		return new Produto(codigo, nome);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return codigo + " - " + nome;
	}
	
	

}