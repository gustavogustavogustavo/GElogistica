package projeto.logistica.junioegustavo.services;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import projeto.logistica.junioegustavo.DAO.FornecedorDAO;
import projeto.logistica.junioegustavo.entities.Fornecedor;
import projeto.logistica.junioegustavo.util.TransacionalCdi;

public class FornecedorService implements Serializable, Service<Fornecedor> {
	
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private FornecedorDAO fornecedorDAO;

	@Override
	@TransacionalCdi
	public void save(Fornecedor e) {
		fornecedorDAO.save(e);
	}

	@Override
	@TransacionalCdi
	public void update(Fornecedor e) {
		fornecedorDAO.update(e);
	}

	@Override
	@TransacionalCdi
	public void remove(Fornecedor e) {
		fornecedorDAO.remove(e);
	}

	@Override
	public Fornecedor getByID(long fornecedorId) {
		return fornecedorDAO.getByID(fornecedorId);
	}

	@Override
	public List<Fornecedor> getAll() {
		return fornecedorDAO.getAll();
	}

}
