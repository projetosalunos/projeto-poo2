package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import sistema.modelos.Time;


public class TimeService extends Service {
	
	@SuppressWarnings("unchecked")
	public List <String> getJogadores()
	{
		
		List <String> jogadores;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a.nome From Usuario a");
		jogadores = q.getResultList();
		em.close();
		
		return jogadores;
		
	}
	
	public void salvar(Time time)
	{
	    
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
			em.persist(time);
		em.getTransaction().commit();	
	    em.close();
		
	}
	
	
	
	@SuppressWarnings("unchecked")
	public List<Time> getTimes()
	{
		
		List<Time> times;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select c From Time c");
		times = q.getResultList();
		em.close();
		
		return times;
		
	}

	public void alterar(Time time) {

		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
			em.merge(time);
		em.getTransaction().commit();	
	    em.close();

		
		
	}

	
	public void remover(Time time) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
			time = em.find(Time.class,time.getID()); 
			em.remove(time);
		em.getTransaction().commit();	
	    em.close();

		
		
	}
}