package controler;

import DAO.FuncionarioDAO;
import DTO.FuncionarioDTO;
import model.Funcionario;


public class FuncionarioController {
	private volatile static FuncionarioController instance;
	
	private FuncionarioController() {
		
	}
	
	public static FuncionarioController getInstance(){
		if(instance == null) {
			synchronized (FuncionarioController.class) {
				if(instance == null) {
					instance = new FuncionarioController();
				}
				
			}
		}
		return instance;
	}
	
	public void save(FuncionarioDTO funcionarioDTO) {
		FuncionarioDAO.getInstance().saveOuUpdate(new Funcionario(funcionarioDTO));
	}
	
	public void remover(FuncionarioDTO funcionarioDTO) {
		FuncionarioDAO.getInstance().remover(funcionarioDTO.getCPF());
	}
	
	public void findByCPF(FuncionarioDTO funcionarioDTO) {
		FuncionarioDAO.getInstance().findByCPF(funcionarioDTO.getCPF());
	}
	
	public void findAll() {
		FuncionarioDAO.getInstance().findAll();
	}
}
