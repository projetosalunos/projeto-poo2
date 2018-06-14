package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import sistema.modelos.Juiz;

public class JuizService extends Service {

	public void salvar(Juiz juiz) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(juiz);
		em.getTransaction().commit();
		em.close();

	}

	@SuppressWarnings("unchecked")
	public List<Juiz> getJuizes() {

		List<Juiz> juizes;

		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Juiz a");
		juizes = q.getResultList();
		em.close();

		return juizes;

	}

	public void alterar(Juiz juiz) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(juiz);
		em.getTransaction().commit();
		em.close();

	}

	public void remover(Juiz juiz) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		juiz = em.find(Juiz.class, juiz.getJuizID()); // Aluno.class,aluno.getMatricula()
		em.remove(juiz);
		em.getTransaction().commit();
		em.close();

	}

}
