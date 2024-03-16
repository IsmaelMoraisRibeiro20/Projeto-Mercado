package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import DTO.FuncionarioDTO;
import controler.FuncionarioController;


public class EditarFuncionario {
	private FuncionarioDTO funcionarioDTO;
	private CadastroFuncionario cadastrarFuncionario;
	
	public EditarFuncionario (FuncionarioDTO funcionarioDTO) {
		this.funcionarioDTO = funcionarioDTO;
		
		cadastrarFuncionario = new CadastroFuncionario();
		cadastrarFuncionario.getTituloTelaCadastrarFuncionario().setText("Editar Funcionario");
		
		cadastrarFuncionario.getBtnSalvar().removeActionListener(cadastrarFuncionario.getOuvinteSalvar());
		cadastrarFuncionario.getButtonVoltar().removeActionListener(cadastrarFuncionario.getOuvinteVoltar());
	
		cadastrarFuncionario.getCampoNome().setText(funcionarioDTO.getNome());	
		cadastrarFuncionario.getCampoTelefone().setText(funcionarioDTO.getTelefone());
		cadastrarFuncionario.getCampoEmail().setText(funcionarioDTO.getEmail());
		cadastrarFuncionario.getCampoCPF().setText(funcionarioDTO.getCPF());
		cadastrarFuncionario.getCampoCPF().setEnabled(false);
		
		
		cadastrarFuncionario.getButtonVoltar().addActionListener(new OuvinteBotaoVoltar(cadastrarFuncionario));
		cadastrarFuncionario.getBtnSalvar().addActionListener(new OuvinteBotaoSalvar(cadastrarFuncionario));
	}
	
	private class OuvinteBotaoVoltar implements ActionListener{
		private CadastroFuncionario janela;
		
		public OuvinteBotaoVoltar(CadastroFuncionario janela) {
			this.janela = janela;
		}
		
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == janela.getButtonVoltar()) {
				this.janela.dispose();
				new ListagemProdutos();
		
			}
		}
	}
	
	protected class OuvinteBotaoSalvar implements ActionListener {
		private CadastroFuncionario janela;
		
		
		public OuvinteBotaoSalvar(CadastroFuncionario janela) {
			this.janela = janela;

		}

		public void actionPerformed(ActionEvent e) {
			
			
			String nome = janela.getCampoNome().getText();
			String telefone = janela.getCampoTelefone().getText();
			String email = janela.getCampoEmail().getText();
			String cpf = janela.getCampoCPF().getText();
	
			

			if (nome.isEmpty() || telefone.isEmpty() || email.isEmpty() || cpf.isEmpty()) {
				JOptionPane.showMessageDialog(janela, "Todos os campos devem estar preenchidos!");
				
			} else {
				FuncionarioDTO funcionarioDTO = new FuncionarioDTO(nome,telefone,email,cpf);
				FuncionarioController.getInstance().save(funcionarioDTO);;
				
				JOptionPane.showMessageDialog(janela, "Funcionario atualizado com sucesso!");
				janela.dispose();
				new ListagemFuncionario();
	
			} 
		}
	}

}
