package DAO;

import java.util.List;

import model.Funcionario;

public interface FuncionarioInterfaceDAO {
	
	Funcionario saveOuUpdate(Funcionario funcionario);
	Funcionario findByCPF(String cpf);
	Funcionario remover(String cpf);
	List<Funcionario> findAll();

}
