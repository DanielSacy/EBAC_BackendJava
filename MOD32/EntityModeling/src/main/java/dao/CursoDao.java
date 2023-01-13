package main.java.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.domain.Curso;

public class CursoDao implements ICursoDao{

    @Override
    public Curso cadastrarCurso(Curso curso) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EntityModeling");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(curso);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return curso;
    }
    
}
