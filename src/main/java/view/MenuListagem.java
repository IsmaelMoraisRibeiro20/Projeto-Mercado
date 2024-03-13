package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

public class MenuListagem extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuListagem frame = new MenuListagem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuListagem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 823, 549);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(83, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ismae\\OneDrive\\Documentos\\ws-eclipse1\\br.com.projetoBD\\imagens\\carrinho-de-supermercado (1).png"));
		lblNewLabel.setBounds(67, 146, 289, 284);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Funcionarios");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(452, 173, 260, 80);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Produtos");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2_1.setBackground(Color.WHITE);
		btnNewButton_2_1.setBounds(452, 271, 260, 80);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVoltar.setBounds(452, 374, 260, 46);
		contentPane.add(btnVoltar);
		
		JLabel lblListagem = new JLabel("LISTAGEM");
		lblListagem.setForeground(Color.WHITE);
		lblListagem.setFont(new Font("Elephant", Font.BOLD, 25));
		lblListagem.setBounds(316, 53, 180, 34);
		contentPane.add(lblListagem);
	}

}
