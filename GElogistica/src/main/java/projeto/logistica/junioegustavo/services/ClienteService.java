package projeto.logistica.junioegustavo.services;

import java.io.Serializable;
import java.util.List;

import projeto.logistica.junioegustavo.DAO.ClienteDAO;
import projeto.logistica.junioegustavo.entities.Cliente;
import projeto.logistica.junioegustavo.util.TransacionalCdi;

public class ClienteService implements Serializable,Service<Cliente>{

	private static final long serialVersionUID = -7803325791425670859L;
	private ClienteDAO clienteDAO;
	
	@Override
	@TransacionalCdi
	public void save(Cliente e) {
		clienteDAO.save(e);
	}

	@Override
	@TransacionalCdi
	public void update(Cliente e) {
		clienteDAO.update(e);
	}

	@Override
	@TransacionalCdi
	public void remove(Cliente e) {
		clienteDAO.remove(e);
	}

	@Override
	public Cliente getByID(long clienteId) {
		return clienteDAO.getByID(clienteId);
	}

	@Override
	public List<Cliente> getAll() {
		return clienteDAO.getAll();
	}

}
