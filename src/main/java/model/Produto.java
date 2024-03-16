package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import DTO.ProdutoDTO;

@Entity
public class Produto {
	@Id
	@Column(name="Codigo")
	private String codigo;

	@Column(name="Nome")
	private String nome;
	
	@Column(name="Quantidade")
	private String quantidade;
	
	@Column(name="Descrição")
	private String descricao;
	
	@Column(name="Valor")
	private String valor;
	
	public Produto() {
		
	}
	
	public Produto(ProdutoDTO produtoDTO) {
		this.codigo = produtoDTO.getCodigo();
		this.nome = produtoDTO.getNome();
		this.quantidade = produtoDTO.getQuantidade();
		this.descricao = produtoDTO.getDescricao();
		this.valor = produtoDTO.getValor();
	}
	
	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigoDeBarra) {
		this.codigo = codigoDeBarra;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}
}
