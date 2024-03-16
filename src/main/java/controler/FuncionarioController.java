package controler;

import java.util.ArrayList;
import java.util.List;

import DAO.FuncionarioDAO;
import DTO.FuncionarioDTO;
import DTO.ProdutoDTO;
import model.Funcionario;
import model.Produto;


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
	
	public void remover(String cpf) {
		FuncionarioDAO.getInstance().remover(cpf);
	}
	
	public void findByCPF(FuncionarioDTO funcionarioDTO) {
		FuncionarioDAO.getInstance().findByCPF(funcionarioDTO.getCPF());
	}
	
	public List<Funcionario> findAll() {
		return FuncionarioDAO.getInstance().findAll();
		
	}
	
	public ArrayList<FuncionarioDTO> allFuncionarios(){
		List<Funcionario> funcionario = findAll();
		ArrayList<FuncionarioDTO> funcionariosDTO = new ArrayList<FuncionarioDTO>();
		
		for(int i = 0;i < funcionario.size();i++) {
			FuncionarioDTO dto = new FuncionarioDTO(funcionario.get(i).getNome(), funcionario.get(i).getTelefone(),
					funcionario.get(i).getEmail(), funcionario.get(i).getCPF());
			
			funcionariosDTO.add(dto);
		}
		
		return funcionariosDTO;
	}
}
