package br.itb.projeto.pizzaria3h.model.entity;

public class Aluno {

	private long rm;
	private String nome;
	private int numero;
	
	// Source -> Generate Getters and Setters...
	// Source -> Generate Constructor using Fields...
	public Aluno(long rm, String nome, int numero) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.numero = numero;
	}
	
	public long getRm() {
		return rm;
	}
	public void setRm(long rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}





