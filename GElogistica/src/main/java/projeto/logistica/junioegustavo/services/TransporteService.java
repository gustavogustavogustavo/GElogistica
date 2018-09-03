package projeto.logistica.junioegustavo.services;

import java.io.Serializable;
import java.util.List;

import projeto.logistica.junioegustavo.DAO.TransporteDAO;
import projeto.logistica.junioegustavo.entities.Transporte;
import projeto.logistica.junioegustavo.util.TransacionalCdi;

public class TransporteService implements Serializable ,Service<Transporte>{

	private static final long serialVersionUID = -7803325791425670859L;
	private TransporteDAO transporteDAO;
	
	@Override
	@TransacionalCdi
	public void save(Transporte e) {
		transporteDAO.save(e);
	}

	@Override
	@TransacionalCdi
	public void update(Transporte e) {
		transporteDAO.update(e);
		
	}

	@Override
	@TransacionalCdi
	public void remove(Transporte e) {
		transporteDAO.remove(e);
		
	}

	@Override
	public Transporte getByID(long transporteId) {
		return transporteDAO.getByID(transporteId);
	}

	@Override
	public List<Transporte> getAll() {
		return transporteDAO.getAll();
	}
}
