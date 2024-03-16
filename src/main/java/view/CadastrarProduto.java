package view;

import javax.swing.JTextField;

import DTO.ProdutoDTO;
import controler.ProdutoController;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CadastrarProduto extends JanelaPadrao {

	private JTextField campoNome;
	private JTextField campoQTD;
	private JTextField campoDescricao;
	private JTextField codigo;
	private JTextField campoValor;
	private JButton buttonVoltar;
	private JButton buttonSalvar;
	private JLabel tituloTelaCadastrarProduto;
	private OuvinteBotaoVoltar ouvinteVoltar;
	private OuvinteBotaoSalvar ouvinteSalvar;

	public CadastrarProduto() {
		criarJLabel();
		criarTextFild();
		criarButton();
		
	}
	
	public OuvinteBotaoVoltar getOuvinteVoltar() {
		return ouvinteVoltar;
	}

	public void setOuvinteVoltar(OuvinteBotaoVoltar ouvinteVoltar) {
		this.ouvinteVoltar = ouvinteVoltar;
	}

	public OuvinteBotaoSalvar getOuvinteSalvar() {
		return ouvinteSalvar;
	}

	public void setOuvinteSalvar(OuvinteBotaoSalvar ouvinteSalvar) {
		this.ouvinteSalvar = ouvinteSalvar;
	}

	public JButton getButtonVoltar() {
		return buttonVoltar;
	}

	public void setButtonVoltar(JButton buttonVoltar) {
		this.buttonVoltar = buttonVoltar;
	}

	public JButton getButtonSalvar() {
		return buttonSalvar;
	}

	public void setButtonSalvar(JButton buttonSalvar) {
		this.buttonSalvar = buttonSalvar;
	}

	public JLabel getTituloTelaCadastrarProduto() {
		return tituloTelaCadastrarProduto;
	}

	public void setTituloTelaCadastrarProduto(JLabel tituloTelaCadastrarProduto) {
		this.tituloTelaCadastrarProduto = tituloTelaCadastrarProduto;
	}

	public JTextField getCodigo() {
		return codigo;
	}

	public void setCodigo(JTextField codigo) {
		this.codigo = codigo;
	}

	public JTextField getCampoNome() {
		return campoNome;
	}

	public void setCampoNome(JTextField campoNome) {
		this.campoNome = campoNome;
	}

	public JTextField getCampoQTD() {
		return campoQTD;
	}

	public void setCampoQTD(JTextField campoQTD) {
		this.campoQTD = campoQTD;
	}

	public JTextField getCampoDescricao() {
		return campoDescricao;
	}

	public void setCampoDescricao(JTextField campoDescricao) {
		this.campoDescricao = campoDescricao;
	}

	public JTextField getCampoValor() {
		return campoValor;
	}

	public void setCampoValor(JTextField campoValor) {
		this.campoValor = campoValor;
	}

	public void criarTextFild() {
		campoNome = new JTextField();
		campoNome.setBounds(264, 109, 286, 34);
		getContentPane().add(campoNome);
		campoNome.setColumns(10);
		
		campoQTD = new JTextField();
		campoQTD.setColumns(10);
		campoQTD.setBounds(264, 191, 286, 34);
		getContentPane().add(campoQTD);
		
		campoDescricao = new JTextField();
		campoDescricao.setColumns(10);
		campoDescricao.setBounds(264, 262, 286, 34);
		getContentPane().add(campoDescricao);
		
		campoValor = new JTextField();
		campoValor.setColumns(10);
		campoValor.setBounds(264, 409, 286, 34);
		getContentPane().add(campoValor);
		
		codigo = new JTextField();
		codigo.setBounds(264, 349, 286, 34);
		getContentPane().add(codigo);
		codigo.setColumns(10);
		
	}
	
	public void criarJLabel() {
		tituloTelaCadastrarProduto = new JLabel("CADASTRAR PRODUTO\r\n");
		tituloTelaCadastrarProduto.setFont(new Font("Elephant", Font.BOLD, 25));
		tituloTelaCadastrarProduto.setForeground(Color.WHITE);
		tituloTelaCadastrarProduto.setBounds(228, 22, 360, 34);
		getContentPane().add(tituloTelaCadastrarProduto);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNome.setBounds(264, 67, 89, 31);
		getContentPane().add(lblNome);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setForeground(Color.WHITE);
		lblQuantidade.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblQuantidade.setBounds(264, 149, 156, 31);
		getContentPane().add(lblQuantidade);
		
		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setForeground(Color.WHITE);
		lblDescrio.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblDescrio.setBounds(264, 229, 156, 31);
		getContentPane().add(lblDescrio);
		
		JLabel lblCodigoDeBarra = new JLabel("Código de Barra");
		lblCodigoDeBarra.setForeground(Color.WHITE);
		lblCodigoDeBarra.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblCodigoDeBarra.setBounds(264, 307, 187, 31);
		getContentPane().add(lblCodigoDeBarra);
		
		
		JLabel lblQuantidade_1_1 = new JLabel("Valor");
		lblQuantidade_1_1.setForeground(Color.WHITE);
		lblQuantidade_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblQuantidade_1_1.setBounds(264, 381, 156, 31);
		getContentPane().add(lblQuantidade_1_1);
	}
	
	public void criarButton() {
		ouvinteVoltar = new OuvinteBotaoVoltar(this);
		ouvinteSalvar = new OuvinteBotaoSalvar(this);
		
		buttonVoltar = new JButton("Voltar");
		buttonVoltar.setFont(new Font("Tahoma", Font.BOLD, 13));
		buttonVoltar.setBounds(264, 454, 116, 31);
		buttonVoltar.addActionListener(ouvinteVoltar);
		getContentPane().add(buttonVoltar);
		
		buttonSalvar = new JButton("Salvar");
		buttonSalvar.setFont(new Font("Tahoma", Font.BOLD, 13));
		buttonSalvar.setBounds(434, 454, 116, 31);
		buttonSalvar.addActionListener(ouvinteSalvar);
		getContentPane().add(buttonSalvar);
		
		
	}
	
	private class OuvinteBotaoVoltar implements ActionListener{
		
		private CadastrarProduto janela;
		
		public OuvinteBotaoVoltar(CadastrarProduto janelaAntiga) {
			this.janela = janelaAntiga;
		}
		
		public void actionPerformed(ActionEvent e) {
			janela.dispose();
			new Menu();
		}	
	}
	
	protected class OuvinteBotaoSalvar implements ActionListener {
		private CadastrarProduto janela;
		private ProdutoDTO produtoDTO;

		public OuvinteBotaoSalvar(CadastrarProduto janela) {
			this.janela = janela;
		}

		public void actionPerformed(ActionEvent e) {

			
			String nome = janela.getCampoNome().getText();
			String quantidade = janela.getCampoQTD().getText();
			String descricao = janela.getCampoDescricao().getText();
			String codigo = janela.getCodigo().getText();
			String valor = janela.getCampoValor().getText();
			
			if (codigo.isEmpty() || nome.isEmpty() || quantidade.isEmpty() || descricao.isEmpty() || valor.isEmpty() ) {
				JOptionPane.showMessageDialog(janela, "Todos os campos devem ser preenchidos");
 
			} else {
				produtoDTO = new ProdutoDTO(codigo,nome, quantidade, descricao,valor);
				ProdutoController.getInstance().save(produtoDTO);
				JOptionPane.showMessageDialog(janela, "Produto cadastrado com sucesso!");
				janela.dispose();
				new Menu();
				
				
			}

		}

	}
}
