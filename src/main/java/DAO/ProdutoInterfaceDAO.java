package DAO;

import java.util.List;

import DTO.ProdutoDTO;
import model.Produto;

public interface ProdutoInterfaceDAO {
	
	Produto saveOuUpdate(Produto produto);
	Produto findByCodigoDeBarra(String codigoDeBarra);
	Produto remover(String p);
	List<Produto> findAll();

}
