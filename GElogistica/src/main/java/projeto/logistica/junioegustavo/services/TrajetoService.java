package projeto.logistica.junioegustavo.services;

import java.io.Serializable;
import java.util.List;

import projeto.logistica.junioegustavo.DAO.TrajetoDAO;
import projeto.logistica.junioegustavo.entities.Trajeto;
import projeto.logistica.junioegustavo.util.TransacionalCdi;

public class TrajetoService implements Serializable ,Service<Trajeto>{

	private static final long serialVersionUID = -7803325791425670859L;
	private TrajetoDAO trajetoDAO;
	
	@Override
	@TransacionalCdi
	public void save(Trajeto e) {
		trajetoDAO.save(e);
	}

	@Override
	@TransacionalCdi
	public void update(Trajeto e) {
		trajetoDAO.update(e);
		
	}

	@Override
	@TransacionalCdi
	public void remove(Trajeto e) {
		trajetoDAO.remove(e);
		
	}

	@Override
	public Trajeto getByID(long trajetoId) {
		return trajetoDAO.getByID(trajetoId);
	}

	@Override
	public List<Trajeto> getAll() {
		return trajetoDAO.getAll();
	}
}