package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import sistema.modelos.Usuario;

public class UsuarioService extends Service {
	
	public void salvar(Usuario usuario) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		em.close();

	}

	@SuppressWarnings("unchecked")
	public List<Usuario> getUsuarios() {

		List<Usuario> usuarios;

		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Usuario a");
		usuarios = q.getResultList();
		em.close();

		return usuarios;

	}

	public void alterar(Usuario usuario) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(usuario);
		em.getTransaction().commit();
		em.close();

	}

	public void remover(Usuario usuario) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		usuario = em.find(Usuario.class, usuario.getID()); 
		em.remove(usuario);
		em.getTransaction().commit();
		em.close();

	}


}
