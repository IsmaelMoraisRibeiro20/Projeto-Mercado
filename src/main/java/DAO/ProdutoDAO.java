package DAO;


import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionFactory;
import model.Produto;

public class ProdutoDAO implements ProdutoInterfaceDAO{
	private volatile static ProdutoDAO instance;

	private ProdutoDAO() {

	}

	public static ProdutoDAO getInstance() {
		if(instance == null) {
			synchronized (ProdutoDAO.class) {
				if(instance == null) {
					instance = new ProdutoDAO();
				}

			}
		}
		return instance;
	}

	public Produto saveOuUpdate(Produto produto) {
		EntityManager em = new ConnectionFactory().getConnection();
		try {
			em.getTransaction().begin();
			
			if(produto.getNome() == null) {
				em.persist(produto);
			}else {
				em.merge(produto);
			}
			
			em.getTransaction().commit();
			
		}catch(Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return produto;
	

	}
	

	public Produto findByCodigoDeBarra(String codigoDeBarra) {
		EntityManager em = new ConnectionFactory().getConnection();
		em.getTransaction().begin();
		Produto produto = null;
		try {
			produto = em.find(Produto.class, codigoDeBarra);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			em.close();
		}
		
		return produto;
	}

	public Produto remover(String codigo) {
		EntityManager em = new ConnectionFactory().getConnection();
		Produto produto = null;
		
		try {
			produto = em.find(Produto.class, codigo); //esse metodo server para encontra o id do produto 
			
			em.getTransaction().begin(); //inicio da transação para logo depois eu conseguir remover
			em.remove(produto); //Aqui remove
			em.getTransaction().commit(); //confirmação da transação
			
		}catch(Exception e) {
			System.err.println(e);
			
		}finally {
			em.close();
		}
		
		return produto;
	}

	public List<Produto> findAll() {
		EntityManager em = new ConnectionFactory().getConnection();
		List<Produto> produto = null;
		try {
			produto = em.createQuery("from Produto p").getResultList();//se quebra foi aqui e a culpa é minha. 
			
		}catch(Exception e ) {
			System.err.println(e);
		}finally {
			em.close();
			
		}
		return produto;
	}


}
