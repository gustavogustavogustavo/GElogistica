package projeto.logistica.junioegustavo.DAO;

import java.util.List;

import projeto.logistica.junioegustavo.entities.Carga;
import projeto.logistica.junioegustavo.filtros.CargaFiltro;

public class CargaDAO extends DAO<Carga> {
	
	public CargaDAO() {
		super(Carga.class);
	}

	public List<Carga> findBy(CargaFiltro filtro) {
		return null;
	}
}
