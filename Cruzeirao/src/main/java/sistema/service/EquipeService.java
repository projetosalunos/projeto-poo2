package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import sistema.modelos.Equipe;

public class EquipeService extends Service {

	public void salvar(Equipe equipe) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(equipe);
		em.getTransaction().commit();
		em.close();

	}

	@SuppressWarnings("unchecked")
	public List<Equipe> getEquipes() {

		List<Equipe> equipes;

		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Equipe a");
		equipes = q.getResultList();
		em.close();

		return equipes;

	}

	public void alterar(Equipe equipe) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(equipe);
		em.getTransaction().commit();
		em.close();

	}

	public void remover(Equipe equipe) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		equipe = em.find(Equipe.class, equipe.getEquipeID()); // Aluno.class,aluno.getMatricula()
		em.remove(equipe);
		em.getTransaction().commit();
		em.close();

	}

}
