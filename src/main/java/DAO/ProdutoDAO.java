package DAO;


import java.util.List;

import javax.persistence.EntityManager;

import model.Produto;
import connection.ConnectionFactory;

public class ProdutoDAO implements ProdutoInterfaceDAO{
	
	EntityManager em = new ConnectionFactory().getConnection();

	public Produto salve(Produto produto) {
		try {
			em.getTransaction().begin();//inicio de transação 
			em.persist(produto);//pesistir/persistencia
			em.getTransaction().commit();//confirmação de transação
			
		}catch(Exception e){
			System.err.println(e);
			em.getTransaction().rollback();
			
		}finally {
			em.close();	
		}
		return produto;

	}
	

	public Produto findById(Integer id) {
		Produto produto = null;
		
		try {
			produto = em.find(Produto.class, id);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			em.close();
		}
		
		return produto;
	}

	public Produto remover(Integer id) {
		Produto produto = null;
		
		try {
			produto = em.find(Produto.class, id); //esse metodo server para encontra o id do produto 
			
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

	public Produto update(Produto produto) {
		
		try {
			em.getTransaction().begin();
			if(produto.getId() == null) {
				em.persist(produto);
			}else {
				em.merge(produto);
			}
			
			em.getTransaction().commit();
		}catch(Exception e) {
			System.err.println(e);
		}finally {
			em.close();
		}
		return produto;
	}

	public List<Produto> findAll() {
		
		List<Produto> produto = null;
		
		try {
			produto = em.createQuery("from produto p ").getResultList();//se quebra foi aqui e a culpa é minha. 
			
		}catch(Exception e ) {
			System.err.println(e);
		}finally {
			em.close();
			
		}
		return produto;
	}

}
