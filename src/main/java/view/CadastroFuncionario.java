package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastroFuncionario {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFuncionario window = new CadastroFuncionario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastroFuncionario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(83, 0, 0));
		frame.setTitle("      ");
		frame.setBounds(300, 200, 823, 549);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCadastrarFuncionario = new JLabel("CADASTRAR FUNCIONARIO\r\n");
		lblCadastrarFuncionario.setForeground(Color.WHITE);
		lblCadastrarFuncionario.setFont(new Font("Elephant", Font.BOLD, 25));
		lblCadastrarFuncionario.setBounds(196, 50, 435, 34);
		frame.getContentPane().add(lblCadastrarFuncionario);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNome.setBounds(263, 113, 89, 31);
		frame.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(263, 145, 286, 34);
		frame.getContentPane().add(textField);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setForeground(Color.WHITE);
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTelefone.setBounds(263, 184, 106, 31);
		frame.getContentPane().add(lblTelefone);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(263, 215, 286, 34);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNome_1_1 = new JLabel("E-mail");
		lblNome_1_1.setForeground(Color.WHITE);
		lblNome_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNome_1_1.setBounds(263, 259, 89, 31);
		frame.getContentPane().add(lblNome_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(263, 291, 286, 34);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNome_1_1_1 = new JLabel("CPF");
		lblNome_1_1_1.setForeground(Color.WHITE);
		lblNome_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNome_1_1_1.setBounds(263, 335, 70, 31);
		frame.getContentPane().add(lblNome_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(263, 370, 286, 34);
		frame.getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(263, 427, 116, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSalvar.setBounds(432, 427, 116, 31);
		frame.getContentPane().add(btnSalvar);
	}

}
