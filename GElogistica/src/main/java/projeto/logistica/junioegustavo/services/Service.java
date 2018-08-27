package projeto.logistica.junioegustavo.services;

import java.util.List;

import projeto.logistica.junioegustavo.entities.Identificavel;

public interface Service<E extends Identificavel> {

	void save(E e);

	void update(E e);

	void remove(E e);

	E getByID(long userId);

	List<E> getAll();

}