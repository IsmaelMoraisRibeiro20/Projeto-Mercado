package view;

import java.awt.EventQueue;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import DTO.FuncionarioDTO;
import DTO.ProdutoDTO;
import controler.FuncionarioController;
import controler.ProdutoController;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
public class CadastroFuncionario extends JanelaPadrao{

	private JTextField campoNome;
	private JTextField campoTelefone;
	private JTextField campoEmail;
	private JTextField campoCPF;
	private JButton buttonVoltar;
	private JButton btnSalvar;

	
	
	public CadastroFuncionario() {
		criarJLabel();
		criarJTextField();
		criarButton();
	}
	
	public JTextField getCampoNome() {
		return campoNome;
	}

	public void setCampoNome(JTextField campoNome) {
		this.campoNome = campoNome;
	}

	public JTextField getCampoTelefone() {
		return campoTelefone;
	}

	public void setCampoTelefone(JTextField campoTelefone) {
		this.campoTelefone = campoTelefone;
	}

	public JTextField getCampoEmail() {
		return campoEmail;
	}

	public void setCampoEmail(JTextField campoEmail) {
		this.campoEmail = campoEmail;
	}

	public JTextField getCampoCPF() {
		return campoCPF;
	}

	public void setCampoCPF(JTextField campoCPF) {
		this.campoCPF = campoCPF;
	}

	public void criarJLabel() {
		JLabel lblCadastrarFuncionario = new JLabel("CADASTRAR FUNCIONARIO\r\n");
		lblCadastrarFuncionario.setForeground(Color.WHITE);
		lblCadastrarFuncionario.setFont(new Font("Elephant", Font.BOLD, 25));
		lblCadastrarFuncionario.setBounds(196, 50, 435, 34);
		getContentPane().add(lblCadastrarFuncionario);
		
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNome.setBounds(263, 113, 89, 31);
		getContentPane().add(lblNome);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setForeground(Color.WHITE);
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTelefone.setBounds(263, 184, 106, 31);
		getContentPane().add(lblTelefone);
		
		JLabel lblNome_1_1 = new JLabel("E-mail");
		lblNome_1_1.setForeground(Color.WHITE);
		lblNome_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNome_1_1.setBounds(263, 259, 89, 31);
		getContentPane().add(lblNome_1_1);
		
		JLabel lblNome_1_1_1 = new JLabel("CPF");
		lblNome_1_1_1.setForeground(Color.WHITE);
		lblNome_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNome_1_1_1.setBounds(263, 335, 70, 31);
		getContentPane().add(lblNome_1_1_1);
	}
	
	public void criarJTextField() {
		campoNome = new JTextField();
		campoNome.setColumns(10);
		campoNome.setBounds(263, 145, 286, 34);
		getContentPane().add(campoNome);
	
		
		try {
			MaskFormatter mascaraDeTelefone = new MaskFormatter("(##) #####-####");
			campoTelefone = new JFormattedTextField(mascaraDeTelefone);
			campoTelefone.setFont(new Font("Tahoma", Font.PLAIN, 18));
			campoTelefone.setBounds(263, 215, 286, 34);

			getContentPane().add(campoTelefone);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		
		campoEmail = new JTextField();
		campoEmail.setColumns(10);
		campoEmail.setBounds(263, 291, 286, 34);
		getContentPane().add(campoEmail);
		
		try {
			MaskFormatter mascaraDeCPF = new MaskFormatter("###.###.###-##");
			campoCPF = new JFormattedTextField(mascaraDeCPF);
			campoCPF.setFont(new Font("Tahoma", Font.PLAIN, 18));
			((JFormattedTextField) campoCPF).setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
			campoCPF.setBounds(263, 370, 286, 34);
			getContentPane().add(campoCPF);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public void criarButton() {
		OuvinteBotaoVoltar ouvinte = new OuvinteBotaoVoltar(this);
		OuvinteBotaoSalvar ouvinteSalvar = new OuvinteBotaoSalvar(this);
		buttonVoltar = new JButton("Voltar");
		buttonVoltar.setBackground(new Color(255, 255, 255));
		buttonVoltar.setFont(new Font("Tahoma", Font.BOLD, 13));
		buttonVoltar.setBounds(263, 427, 116, 31);
		buttonVoltar.addActionListener(ouvinte);
		getContentPane().add(buttonVoltar);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(new Color(240, 240, 240));
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSalvar.setBounds(432, 427, 116, 31);
		btnSalvar.addActionListener(ouvinteSalvar);
		getContentPane().add(btnSalvar);
	}
	
	private class OuvinteBotaoVoltar implements ActionListener{
		
		private CadastroFuncionario janela;
		
		public OuvinteBotaoVoltar(CadastroFuncionario janelaAntiga) {
			this.janela = janelaAntiga;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			janela.dispose();
			new Menu();
		}	
	}
	
	protected class OuvinteBotaoSalvar implements ActionListener {
		private CadastroFuncionario janela;
		private FuncionarioDTO funcionarioDTO;

		public OuvinteBotaoSalvar(CadastroFuncionario janela) {
			this.janela = janela;
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			String nome = janela.getCampoNome().getText();
			String telefone = janela.getCampoNome().getText().replace("(", "").replace(")", "").replace("-", "").trim();;
			String email = janela.getCampoEmail().getText();
			String cpf = janela.getCampoCPF().getText().replace(".", "").replace("-", "").trim();;
			
			
			if (nome.isEmpty() || telefone.isEmpty() || email.isEmpty() || cpf.isEmpty()) {
				JOptionPane.showMessageDialog(janela, "Todos os campos devem ser preenchidos");
 
			} else {
				funcionarioDTO = new FuncionarioDTO(nome, telefone, email,cpf);
				FuncionarioController.getInstance().save(funcionarioDTO);
				JOptionPane.showMessageDialog(janela, "Funcionario cadastrado com sucesso!");
				janela.dispose();
				new Menu();
				
			}

		}

	}


}
