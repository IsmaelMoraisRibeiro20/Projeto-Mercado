package view;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

public class CadastrarProduto extends JanelaPadrao {

	private static final long serialVersionUID = 1L;
	private JTextField campoNome;
	private JTextField campoQTD;
	private JTextField campoDescricao;
	private JTextField campoValor;
	private JButton buttonVoltar;
	private JButton buttonSalvar;


	public CadastrarProduto() {
		criarJLabel();
		criarTextFild();
		criarButton();
		
	}
	
	public void criarTextFild() {
		campoNome = new JTextField();
		campoNome.setBounds(264, 136, 286, 34);
		getContentPane().add(campoNome);
		campoNome.setColumns(10);
		
		campoQTD = new JTextField();
		campoQTD.setColumns(10);
		campoQTD.setBounds(264, 221, 286, 34);
		getContentPane().add(campoQTD);
		
		campoDescricao = new JTextField();
		campoDescricao.setColumns(10);
		campoDescricao.setBounds(264, 303, 286, 34);
		getContentPane().add(campoDescricao);
		
		campoValor = new JTextField();
		campoValor.setColumns(10);
		campoValor.setBounds(264, 386, 286, 34);
		getContentPane().add(campoValor);
	}
	
	public void criarJLabel() {
		JLabel lblNewLabel = new JLabel("CADASTRAR PRODUTO\r\n");
		lblNewLabel.setFont(new Font("Elephant", Font.BOLD, 25));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(240, 37, 360, 34);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNome.setBounds(264, 95, 89, 31);
		getContentPane().add(lblNome);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setForeground(Color.WHITE);
		lblQuantidade.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblQuantidade.setBounds(264, 180, 156, 31);
		getContentPane().add(lblQuantidade);
		
		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setForeground(Color.WHITE);
		lblDescrio.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblDescrio.setBounds(264, 265, 156, 31);
		getContentPane().add(lblDescrio);
		
		JLabel lblQuantidade_1_1 = new JLabel("Valor");
		lblQuantidade_1_1.setForeground(Color.WHITE);
		lblQuantidade_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblQuantidade_1_1.setBounds(264, 349, 156, 31);
		getContentPane().add(lblQuantidade_1_1);
	}
	
	public void criarButton() {
		buttonVoltar = new JButton("Voltar");
		buttonVoltar.setFont(new Font("Tahoma", Font.BOLD, 13));
		buttonVoltar.setBounds(264, 435, 116, 31);
		getContentPane().add(buttonVoltar);
		
		buttonSalvar = new JButton("Salvar");
		buttonSalvar.setFont(new Font("Tahoma", Font.BOLD, 13));
		buttonSalvar.setBounds(434, 435, 116, 31);
		getContentPane().add(buttonSalvar);
		
	}
}
