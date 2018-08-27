package projeto.logistica.junioegustavo.DAO;

import java.util.List;

import projeto.logistica.junioegustavo.entities.Trajeto;
import projeto.logistica.junioegustavo.filtros.TrajetoFiltro;

public class TrajetoDAO extends DAO<Trajeto> {
	public TrajetoDAO() {
		super(Trajeto.class);
	}

	public List<Trajeto> findBy(TrajetoFiltro filtro) {
		return null;
	}

}
