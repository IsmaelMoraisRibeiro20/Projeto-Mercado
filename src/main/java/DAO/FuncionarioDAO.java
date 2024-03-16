package DAO;

import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionFactory;
import model.Funcionario;
import model.Produto;

public class FuncionarioDAO implements FuncionarioInterfaceDAO{
	
	EntityManager em = new ConnectionFactory().getConnection();
	
	private volatile static FuncionarioDAO instance;

	private FuncionarioDAO() {

	}

	public static FuncionarioDAO getInstance() {
		if(instance == null) {
			synchronized (FuncionarioDAO.class) {
				if(instance == null) {
					instance = new FuncionarioDAO();
				}

			}
		}
		return instance;
	}

	public Funcionario saveOuUpdate(Funcionario funcionario) {
		
		try {
			em.getTransaction().begin();
			if(funcionario.getCPF() == null) {
				em.persist(funcionario);
			}else {
				em.merge(funcionario);
			}
			
			em.getTransaction().commit();
		}catch(Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return funcionario;
		
	}

	public Funcionario findByCPF(String cpf) {
		Funcionario funcionario = null;
		
		try {
			funcionario = em.find(Funcionario.class, cpf);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			em.close();
		}
		
		return funcionario;
	}

	public Funcionario remover(String cpf) {
		Funcionario funcionario = null;
		
		try {
			funcionario = em.find(Funcionario.class, cpf); //esse metodo server para encontra o id do produto 
			
			em.getTransaction().begin(); //inicio da transação para logo depois eu conseguir remover
			em.remove(funcionario); //Aqui remove
			em.getTransaction().commit(); //confirmação da transação
			
		}catch(Exception e) {
			System.err.println(e);
			
		}finally {
			em.close();
		}
		
		return funcionario;
	}


	public List<Funcionario> findAll() {
		List<Funcionario> funcionario = null;
		
		try {
			funcionario= em.createQuery("from funcionario f").getResultList();
			
		}catch(Exception e ) {
			System.err.println(e);
		}finally {
			em.close();
			
		}
		return funcionario;
	}

	

}
