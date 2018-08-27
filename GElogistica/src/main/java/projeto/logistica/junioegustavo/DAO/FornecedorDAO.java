package projeto.logistica.junioegustavo.DAO;

import java.util.List;


import projeto.logistica.junioegustavo.entities.Fornecedor;
import projeto.logistica.junioegustavo.filtros.FornecedorFiltro;


public class FornecedorDAO extends DAO<Fornecedor>{
	public FornecedorDAO() {
		super(Fornecedor.class);
		}

		public List<Fornecedor> findBy(FornecedorFiltro filtro) {
			return null;
		}
	
	
}
