package projeto.logistica.junioegustavo.DAO;

import java.util.List;

import projeto.logistica.junioegustavo.entities.Transporte;
import projeto.logistica.junioegustavo.filtros.TrajetoFiltro;



public class TransporteDAO extends DAO<Transporte> {
	public TransporteDAO() {
		super(Transporte.class);
	}

	public List<Transporte> findBy(TrajetoFiltro filtro) {
		return null;
	}

}
