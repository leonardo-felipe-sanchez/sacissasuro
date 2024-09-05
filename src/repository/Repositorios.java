package repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.*;

import model.Centro;

public class Repositorios {
    
    private static Repositorios instance;

    protected EntityManager entityManager;

	public Repositorios() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("crudHibernatePU");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

    public static Repositorios getInstance(){
        if (instance == null) {
			instance = new Repositorios();
		}
		return instance;
    }

    public void buscarTodos() {}

    public void buscarPorNome(String nome){}

    public CentroModel buscarPorId(String id){
        CentroModel centro = new CentroModel();
    }
}
