package view;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuListagem extends JanelaPadrao {

	private JButton funcionario;
	private JButton produto;
	private JButton voltar;

	public MenuListagem() {
		criarJLabel();
		criarJButton();
	}
	
	public void criarJLabel() {
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ismae\\OneDrive\\Documentos\\ws-eclipse1\\br.com.projetoBD\\imagens\\carrinho-de-supermercado (1).png"));
		lblNewLabel.setBounds(67, 146, 289, 284);
		getContentPane().add(lblNewLabel);
		
		JLabel lblListagem = new JLabel("LISTAGEM");
		lblListagem.setForeground(Color.WHITE);
		lblListagem.setFont(new Font("Elephant", Font.BOLD, 25));
		lblListagem.setBounds(316, 53, 180, 34);
		getContentPane().add(lblListagem);
	}

	public void criarJButton() {
		OuvinteBotaoVoltar ouvinte = new OuvinteBotaoVoltar(this);
		OuvinteBotoesDoMenu ouvintButtons = new OuvinteBotoesDoMenu();
		
		funcionario = new JButton("Funcionarios");
		funcionario.setFont(new Font("Tahoma", Font.BOLD, 15));
		funcionario.setBackground(Color.WHITE);
		funcionario.setBounds(452, 173, 260, 80);
		funcionario.addActionListener(ouvintButtons);
		getContentPane().add(funcionario);
		
		produto = new JButton("Produtos");
		produto.setFont(new Font("Tahoma", Font.BOLD, 15));
		produto.setBackground(Color.WHITE);
		produto.setBounds(452, 271, 260, 80);
		produto.addActionListener(ouvintButtons);
		getContentPane().add(produto);
		
		voltar = new JButton("Voltar");
		voltar.setFont(new Font("Tahoma", Font.BOLD, 13));
		voltar.setBounds(452, 374, 260, 46);
		voltar.addActionListener(ouvinte);
		getContentPane().add(voltar);
	}
	
	private class OuvinteBotaoVoltar implements ActionListener{
		
		private MenuListagem janela;
		
		public OuvinteBotaoVoltar(MenuListagem janelaAntiga) {
			this.janela = janelaAntiga;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			janela.dispose();
			new Menu();
		}	
	}

	private class OuvinteBotoesDoMenu implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == funcionario) {
				dispose();
				new ListagemFuncionario();

			} else {
				dispose();
				new ListagemProdutos();

			}  
		}

	}
}
