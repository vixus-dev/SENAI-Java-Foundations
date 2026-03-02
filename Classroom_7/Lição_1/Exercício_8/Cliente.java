package Exercício_8;

public class Cliente {

	private String nome;
	private String cpf;
	private String dataNascimento;
	
	public Cliente (String nome,String cpf,	String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome () {
		return nome;
	}
	
	public String getCPF() {
		return cpf;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}

}
