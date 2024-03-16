package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import DTO.FuncionarioDTO;
import DTO.ProdutoDTO;
import controler.FuncionarioController;
import controler.ProdutoController;
import util.ButtonEditor;
import util.ButtonRenderer;


import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.util.ArrayList;
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
		modelo.addColumn("Excluir");

		table = new JTable(modelo);

		table.getColumn("Editar").setCellRenderer(new ButtonRenderer());
		table.getColumn("Editar").setCellEditor(new ButtonEditor(new JCheckBox()));


		table.getColumn("Excluir").setCellRenderer(new ButtonRenderer());
		table.getColumn("Excluir").setCellEditor(new ButtonEditor(new JCheckBox()));

		

		JScrollPane painelTabela = new JScrollPane(table);

		painelTabela.setBounds(44, 106, 722, 316);
		getContentPane().add(painelTabela);

		preencherTabela(FuncionarioController.getInstance().allFuncionarios());

	}
	
	
	
	public void preencherTabela(ArrayList<FuncionarioDTO> array) {
		limparTabela(modelo, table);

		for(FuncionarioDTO f: array) {
			Object[] linha = new Object[9];

			linha[0] = f.getNome();
			linha[1] = f.getTelefone();
			linha[2] = f.getEmail();
			linha[3] = f.getCPF();
		
			JButton btEditar = new JButton("Editar");
			btEditar.setBackground(new Color(39, 228, 86));
			btEditar.addActionListener(new OuvinteBotaoEditar(this,f));
			linha[4] = btEditar;

			JButton btExcluir = new JButton("Excluir");
			btExcluir.setBackground(new Color(39, 228, 86));
			btExcluir.addActionListener(new OuvinteBotaoExcluir(this, f));
			linha[5] = btExcluir;
			
			modelo.addRow(linha);
		}

	}
	
	public static void limparTabela(DefaultTableModel modelo, JTable tabela) {
		int cont = modelo.getRowCount();
		for (int i = 0; i < cont; i++) {
			modelo.removeRow(0);
		}
		tabela.repaint();
	}
	
	private class OuvinteBotaoVoltar implements ActionListener{
		
		private ListagemFuncionario janela;
		
		public OuvinteBotaoVoltar(ListagemFuncionario janelaAntiga) {
			this.janela = janelaAntiga;
		}
		
		public void actionPerformed(ActionEvent e) {
			janela.dispose();
			new MenuListagem();
		}	
	}
	
	
	private class OuvinteBotaoExcluir implements ActionListener {

		private ListagemFuncionario janela;
		private FuncionarioDTO funcionarioDto;

		public OuvinteBotaoExcluir(ListagemFuncionario janela, FuncionarioDTO funcionarioDto) {
			this.janela = janela;
			this.funcionarioDto= funcionarioDto;
		}

		public void actionPerformed(ActionEvent e) {

			FuncionarioController.getInstance().remover(funcionarioDto.getCPF());
			JOptionPane.showMessageDialog(null, "Produto removido com sucesso!");
			janela.dispose();
			new ListagemProdutos();
		}

	}
	
	private class OuvinteBotaoEditar implements ActionListener {

		private ListagemFuncionario janela;
		private FuncionarioDTO funcionarioDTO;

		public OuvinteBotaoEditar(ListagemFuncionario janela, FuncionarioDTO funcionarioDTO) {
			this.janela = janela;
			this.funcionarioDTO = funcionarioDTO;
		}

		public void actionPerformed(ActionEvent e) {
			janela.dispose();
			new EditarFuncionario(funcionarioDTO);

		}

	}
	

}
