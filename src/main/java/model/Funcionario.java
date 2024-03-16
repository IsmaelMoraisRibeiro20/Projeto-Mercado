package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import DTO.FuncionarioDTO;

@Entity
public class Funcionario {
	@Id
	private String CPF;
	
	@Column(name="Nome")
	private String nome;
	
	@Column(name="Telefone")
	private String telefone;
	
	@Column(name="Email")
	private String email;
	
	
	public Funcionario() {
		
	}
	
	public Funcionario(FuncionarioDTO funcionarioDTO) {
		
		this.nome = funcionarioDTO.getNome();
		this.telefone = funcionarioDTO.getTelefone();
		this.email = funcionarioDTO.getEmail();
		CPF = funcionarioDTO.getCPF();
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
