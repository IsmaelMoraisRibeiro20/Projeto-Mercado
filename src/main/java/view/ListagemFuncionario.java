package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import util.ButtonEditor;
import util.ButtonRenderer;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ListagemFuncionario extends JanelaPadrao {

	
	private JPanel contentPane;
	private JTable table;
	private JButton btnVoltar;
	private DefaultTableModel modelo;


	public ListagemFuncionario() {
		criarJLabel();
		criarJTable();
		adicionarButton();
		
	}
	
	public void criarJLabel() {
		JLabel lblFuncionario = new JLabel("FUNCIONARIOS\r\n");
		lblFuncionario.setForeground(Color.WHITE);
		lblFuncionario.setFont(new Font("Elephant", Font.BOLD, 25));
		lblFuncionario.setBounds(276, 37, 265, 34);
		getContentPane().add(lblFuncionario);
		
	}
	
	public void adicionarButton() {
		OuvinteBotaoVoltar ouvinte = new OuvinteBotaoVoltar(this);
		btnVoltar = new JButton("Voltar");
		btnVoltar.setIcon(new ImageIcon("C:\\Users\\ismae\\OneDrive\\Documentos\\ws-eclipse1\\br.com.projetoBD\\imagens\\voltar.png"));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVoltar.setBounds(44, 448, 115, 31);
		btnVoltar.addActionListener(ouvinte);
		getContentPane().add(btnVoltar);
		
	}
	
	public void criarJTable() {
		modelo = new DefaultTableModel();
		modelo.addColumn("Nome");
		modelo.addColumn("Telefone");
		modelo.addColumn("Email");
		modelo.addColumn("CPF");
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

		painelTabela.setBounds(44, 106, 722, 316);
		getContentPane().add(painelTabela);

		//preencherTabela(clientes);

	}
	
	private class OuvinteBotaoVoltar implements ActionListener{
		
		private ListagemFuncionario janela;
		
		public OuvinteBotaoVoltar(ListagemFuncionario janelaAntiga) {
			this.janela = janelaAntiga;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			janela.dispose();
			new MenuListagem();
		}	
	}
}
