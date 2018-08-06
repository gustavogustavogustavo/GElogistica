package projeto.logistica.junioegustavo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GElogistica {
	private EntityManager manager;

	public GElogistica() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ge");
		this.manager = factory.createEntityManager();
	}
	public <T> List<T> buscar(Class<T> classe, String atributo, Object valor){
		Query query = manager.createQuery("from " + classe + " where " + atributo + " like :valor");
		query.setParameter("valor", valor);
		return query.getResultList();
	}
	public void  add(Object valor ) {
		manager.getTransaction().begin();
		manager.persist(valor);
		manager.getTransaction().commit();
	}
	public Object remove(Object valor) {
		manager.getTransaction().begin();
		manager.remove(valor);
		manager.getTransaction().commit();
		return valor;
	}
	public <T> Object update(Class<T> classe,Object nObject, Integer id) {
		manager.getTransaction().begin();
		T object = manager.find(classe, id);
		manager.remove(object);
		manager.persist(nObject);
		manager.getTransaction().commit();
		return nObject;
	}
	
}
