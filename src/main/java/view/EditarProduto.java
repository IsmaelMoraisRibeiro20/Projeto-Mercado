package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import DTO.ProdutoDTO;
import controler.ProdutoController;


public class EditarProduto {
	private ProdutoDTO produtoDTO;
	private CadastrarProduto cadastrarProduto;
	
	public EditarProduto (ProdutoDTO produtoDTO) {
		this.produtoDTO = produtoDTO;
		
		cadastrarProduto = new CadastrarProduto();
		cadastrarProduto.getTituloTelaCadastrarProduto().setText("Editar Produto");
		
		cadastrarProduto.getButtonSalvar().removeActionListener(cadastrarProduto.getOuvinteSalvar());
		cadastrarProduto.getButtonVoltar().removeActionListener(cadastrarProduto.getOuvinteVoltar());
	
		cadastrarProduto.getCampoNome().setText(produtoDTO.getNome());	
		cadastrarProduto.getCodigo().setText(produtoDTO.getCodigo());
		cadastrarProduto.getCodigo().setEnabled(false);
		cadastrarProduto.getCampoQTD().setText(produtoDTO.getQuantidade());
		cadastrarProduto.getCampoDescricao().setText(produtoDTO.getDescricao());
		cadastrarProduto.getCampoValor().setText(produtoDTO.getValor());
	
		
		cadastrarProduto.getButtonVoltar().addActionListener(new OuvinteBotaoVoltar(cadastrarProduto));
		cadastrarProduto.getButtonSalvar().addActionListener(new OuvinteBotaoSalvar(cadastrarProduto));
	}
	
	private class OuvinteBotaoVoltar implements ActionListener{
		private CadastrarProduto janela;
		
		public OuvinteBotaoVoltar(CadastrarProduto janela) {
			this.janela = janela;
		}
		
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == janela.getButtonVoltar()) {
				this.janela.dispose();
				new ListagemProdutos();
		
			}
		}
	}
	
	protected class OuvinteBotaoSalvar implements ActionListener {
		private CadastrarProduto janela;
		//private PedidoDTO pedidoAntigo;
		
		public OuvinteBotaoSalvar(CadastrarProduto janela) {
			this.janela = janela;
			//this.pedidoAntigo = pedidoAntigo;
		}

		public void actionPerformed(ActionEvent e) {
			
			
			String nome = janela.getCampoNome().getText();
			String quantidade = janela.getCampoQTD().getText();
			String descricao = janela.getCampoDescricao().getText();
			String codigo = janela.getCodigo().getText();
			String valor = janela.getCampoValor().getText();
			

			if (nome.isEmpty() || quantidade.isEmpty() || descricao.isEmpty() || codigo.isEmpty() || valor.isEmpty()) {
				JOptionPane.showMessageDialog(janela, "Todos os campos devem estar preenchidos!");
				
			} else {
				ProdutoDTO produto = new ProdutoDTO(codigo,nome,quantidade,descricao,valor);
				ProdutoController.getInstance().save(produto);;
				
				JOptionPane.showMessageDialog(janela, "Produto atualizado com sucesso!");
				janela.dispose();
				new ListagemProdutos();
	
			} 
		}
	}
}
