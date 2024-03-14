package DAO;

import java.util.List;

import model.Produto;

public interface ProdutoInterfaceDAO {
	
	Produto salve(Produto produto);
	Produto findById(Integer id);
	Produto remover(Integer id);
	Produto update(Produto produto);
	List<Produto> findAll();

}
