package projeto.logistica.junioegustavo.DAO;

import java.util.List;

import projeto.logistica.junioegustavo.entities.Produto;
import projeto.logistica.junioegustavo.filtros.ProdutoFiltro;

public class ProdutoDAO extends DAO<Produto> {
	public ProdutoDAO() {
		super(Produto.class);
	}

	public List<Produto> findBy(ProdutoFiltro filtro) {
		return null;
	}

}
