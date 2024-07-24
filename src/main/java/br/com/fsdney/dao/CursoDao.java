package br.com.fsdney.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.fsdney.domain.Curso;


import br.com.fsdney.domain.Curso;

public class CursoDao implements ICursoDao {

	@Override
	public Curso cadastrar(Curso curso) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("JPA_Hibernate");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(curso);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
		
		
		return null;
	}

}
