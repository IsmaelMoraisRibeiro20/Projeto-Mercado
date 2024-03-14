package view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.Font;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import util.ButtonEditor;
import util.ButtonRenderer;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

public class ListagemProdutos extends JanelaPadrao {

	
	private JTable table;
	private JButton btnVoltar;
	private DefaultTableModel modelo;


	public ListagemProdutos() {
		criarJLabel();
		criarJTable();
		criarJButton();

	}
	
	public void criarJLabel() {
		JLabel lblProdutos = new JLabel("PRODUTOS");
		lblProdutos.setForeground(Color.WHITE);
		lblProdutos.setFont(new Font("Elephant", Font.BOLD, 25));
		lblProdutos.setBounds(309, 46, 188, 34);
		getContentPane().add(lblProdutos);
		
	}
	
	public void criarJTable() {
	
		modelo = new DefaultTableModel();
		modelo.addColumn("Nome");
		modelo.addColumn("Quantidade");
		modelo.addColumn("Descrição");
		modelo.addColumn("Valor");
		modelo.addColumn("Editar");
		modelo.addColumn("Detalhar");
		modelo.addColumn("Excluir");

		table = new JTable(modelo);

		table.getColumn("Editar").setCellRenderer(new ButtonRenderer());
		table.getColumn("Editar").setCellEditor(new ButtonEditor(new JCheckBox()));

		table.getColumn("Detalhar").setCellRenderer(new ButtonRenderer());
		table.getColumn("Detalhar").setCellEditor(new ButtonEditor(new JCheckBox()));

		table.getColumn("Excluir").setCellRenderer(new ButtonRenderer());
		table.getColumn("Excluir").setCellEditor(new ButtonEditor(new JCheckBox()));

		

		JScrollPane painelTabela = new JScrollPane(table);

		painelTabela.setBounds(46, 107, 722, 316);
		getContentPane().add(painelTabela);

		//preencherTabela(clientes);

	}
	
	public void criarJButton() {
		btnVoltar = new JButton("Voltar");
		btnVoltar.setIcon(new ImageIcon("C:\\Users\\ismae\\OneDrive\\Documentos\\ws-eclipse1\\br.com.projetoBD\\imagens\\voltar.png"));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVoltar.setBounds(46, 443, 115, 31);
		getContentPane().add(btnVoltar);
	}
	

		

}
