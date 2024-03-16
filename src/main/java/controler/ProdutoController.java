package controler;

import java.util.ArrayList;
import java.util.List;

import DAO.ProdutoDAO;
import DTO.ProdutoDTO;
import model.Produto;

public class ProdutoController {
	private volatile static ProdutoController instance;
	
	private ProdutoController() {
		
	}
	
	public static ProdutoController getInstance(){
		if(instance == null) {
			synchronized (ProdutoController.class) {
				if(instance == null) {
					instance = new ProdutoController();
				}
				
			}
		}
		return instance;
	}
	
	public void save(ProdutoDTO produtoDTO) {
		ProdutoDAO.getInstance().saveOuUpdate(new Produto(produtoDTO));
				
	}
	
	public void remove(String codigo) {
		ProdutoDAO.getInstance().remover(codigo);
	}
	
	public void findByCodigoDeBarra(ProdutoDTO produtoDTO) {
		ProdutoDAO.getInstance().findByCodigoDeBarra(produtoDTO.getCodigo());
	}
	
	public List<Produto> findAll() {
		List<Produto> produto = ProdutoDAO.getInstance().findAll();
		return produto;
	}
	
	public ArrayList<ProdutoDTO> allProdutos(){
		List<Produto> produtos = findAll();
		ArrayList<ProdutoDTO> produtosDTO = new ArrayList<ProdutoDTO>();
		
		for(int i = 0;i < produtos.size();i++) {
			ProdutoDTO dto = new ProdutoDTO(produtos.get(i).getCodigo(), produtos.get(i).getNome(),
					produtos.get(i).getQuantidade(), produtos.get(i).getDescricao(), produtos.get(i).getValor());
			
			produtosDTO.add(dto);
		}
		
		return produtosDTO;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
