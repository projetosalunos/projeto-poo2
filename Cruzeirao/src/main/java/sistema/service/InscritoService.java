package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import sistema.modelos.Inscrito;

public class InscritoService extends Service {

	public void salvar(Inscrito inscrito) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(inscrito);
		em.getTransaction().commit();
		em.close();

	}

	@SuppressWarnings("unchecked")
	public List<Inscrito> getInscritos() {

		List<Inscrito> inscritos;

		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Inscrito a");
		inscritos = q.getResultList();
		em.close();

		return inscritos;

	}

	public void alterar(Inscrito inscrito) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(inscrito);
		em.getTransaction().commit();
		em.close();

	}

	public void remover(Inscrito inscrito) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		inscrito = em.find(Inscrito.class, inscrito.getInscritoID()); // Aluno.class,aluno.getMatricula()
		em.remove(inscrito);
		em.getTransaction().commit();
		em.close();

	}

}
