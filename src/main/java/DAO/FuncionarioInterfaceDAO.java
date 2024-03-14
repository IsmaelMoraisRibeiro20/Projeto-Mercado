package DAO;

import java.util.List;

import model.Funcionario;

public interface FuncionarioInterfaceDAO {
	
	Funcionario salve(Funcionario funcionario);
	Funcionario findByCPF(String cpf);
	Funcionario remover(String cpf);
	Funcionario update(Funcionario funcionario);
	List<Funcionario> findAll();

}
