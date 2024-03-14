package view;

import java.awt.Color;

import javax.swing.JFrame;

public class JanelaPadrao extends JFrame{
	
	public JanelaPadrao() {
		getContentPane().setBackground(new Color(83, 0, 0));
		setTitle("      ");
		setBounds(300, 200, 823, 549);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
	}

}
