package view;

import java.awt.EventQueue;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
public class CadastroFuncionario extends JanelaPadrao{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton;
	private JButton btnSalvar;

	
	
	public CadastroFuncionario() {
		criarJLabel();
		criarJTextField();
		criarButton();
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
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(263, 145, 286, 34);
		getContentPane().add(textField);
	
		
		try {
			MaskFormatter mascaraDeTelefone = new MaskFormatter("(##) #####-####");
			textField_1 = new JFormattedTextField(mascaraDeTelefone);
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
			textField_1.setBounds(263, 215, 286, 34);

			getContentPane().add(textField_1);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(263, 291, 286, 34);
		getContentPane().add(textField_2);
		
		try {
			MaskFormatter mascaraDeCPF = new MaskFormatter("###.###.###-##");
			textField_3 = new JFormattedTextField(mascaraDeCPF);
			textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
			((JFormattedTextField) textField_3).setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
			textField_3.setBounds(263, 370, 286, 34);
			getContentPane().add(textField_3);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public void criarButton() {
		btnNewButton = new JButton("Voltar");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(263, 427, 116, 31);
		getContentPane().add(btnNewButton);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(new Color(240, 240, 240));
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSalvar.setBounds(432, 427, 116, 31);
		getContentPane().add(btnSalvar);
	}

}
