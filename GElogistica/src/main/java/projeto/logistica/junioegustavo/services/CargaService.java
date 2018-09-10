package projeto.logistica.junioegustavo.services;

import java.io.Serializable;
import java.util.List;

import projeto.logistica.junioegustavo.DAO.CargaDAO;
import projeto.logistica.junioegustavo.entities.Carga;
import projeto.logistica.junioegustavo.util.TransacionalCdi;

public class CargaService implements Serializable ,Service<Carga>{

	private static final long serialVersionUID = -7803325791425670859L;
	private CargaDAO cargaDAO;
	
	@Override
	@TransacionalCdi
	public void save(Carga e) {
		cargaDAO.save(e);
	}

	@Override
	@TransacionalCdi
	public void update(Carga e) {
		cargaDAO.update(e);
	}

	@Override
	@TransacionalCdi
	public void remove(Carga e) {
		cargaDAO.remove(e);
		
	}

	@Override
	public Carga getByID(long cargaId) {
		return cargaDAO.getByID(cargaId);
	}

	@Override
	public List<Carga> getAll() {
		return cargaDAO.getAll();
	}
}
