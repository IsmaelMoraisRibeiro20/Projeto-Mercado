package model;

public class Funcionario {
	
	private String nome;
	private String telefone;
	private String email;
	private String CPF;
	
	
	public Funcionario(String nome, String telefone, String email, String cPF) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		CPF = cPF;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	

}
