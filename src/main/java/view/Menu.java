package view;

import java.awt.EventQueue;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Menu extends JanelaPadrao {

	private JButton cadastrarProduto;
	private JButton listagem;
	private JButton cadastrarFuncionario;


	public Menu() {
		criarJButton();
		criarJLabel();
	}
	
	public void criarJButton() {
		OuvinteBotoesDoMenu ouvinte= new OuvinteBotoesDoMenu();
		cadastrarProduto = new JButton("Cadastrar Produto");
		cadastrarProduto.setBackground(Color.WHITE);
		cadastrarProduto.setFont(new Font("Tahoma", Font.BOLD, 15));
		cadastrarProduto.setBounds(426, 255, 260, 80);
		cadastrarProduto.addActionListener(ouvinte);
		getContentPane().add(cadastrarProduto);
		
		
		listagem = new JButton("Listagem");
		listagem.setBackground(Color.WHITE);
		listagem.setFont(new Font("Tahoma", Font.BOLD, 15));
		listagem.setBounds(426, 370, 260, 80);
		listagem.addActionListener(ouvinte);
		getContentPane().add(listagem);
		
		cadastrarFuncionario = new JButton("Cadastrar Funcionario");
		cadastrarFuncionario.setBackground(Color.WHITE);
		cadastrarFuncionario.setFont(new Font("Tahoma", Font.BOLD, 15));
		cadastrarFuncionario.setBounds(426, 136, 260, 80);
		cadastrarFuncionario.addActionListener(ouvinte);
		getContentPane().add(cadastrarFuncionario);
		
		
	}
	
	public void criarJLabel() {
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setForeground(Color.WHITE);
		lblMenu.setFont(new Font("Elephant", Font.BOLD, 46));
		lblMenu.setBounds(322, 49, 161, 34);
		getContentPane().add(lblMenu);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ismae\\OneDrive\\Documentos\\ws-eclipse1\\br.com.projetoBD\\imagens\\carrinho-de-supermercado (1).png"));
		lblNewLabel.setBounds(74, 146, 289, 284);
		getContentPane().add(lblNewLabel);
	}
	
	private class OuvinteBotoesDoMenu implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == cadastrarProduto) {
				dispose();
				new CadastrarProduto();

			} else if (e.getSource() == cadastrarFuncionario) {
				dispose();
				new CadastroFuncionario();

			} else {
				dispose();
				new MenuListagem();

			} 
		}

	}

}
