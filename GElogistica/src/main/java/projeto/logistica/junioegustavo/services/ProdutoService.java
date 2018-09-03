package projeto.logistica.junioegustavo.services;

import java.util.List;
import java.io.Serializable;

import projeto.logistica.junioegustavo.DAO.ProdutoDAO;
import projeto.logistica.junioegustavo.entities.Produto;
import projeto.logistica.junioegustavo.util.TransacionalCdi;

public class ProdutoService implements Serializable ,Service<Produto>{

	private static final long serialVersionUID = -7803325791425670859L;
	private ProdutoDAO produtoDAO;
	
	@Override
	@TransacionalCdi
	public void save(Produto e) {
		produtoDAO.save(e);
	}

	@Override
	@TransacionalCdi
	public void update(Produto e) {
		produtoDAO.update(e);
		
	}

	@Override
	@TransacionalCdi
	public void remove(Produto e) {
		produtoDAO.remove(e);
		
	}

	@Override
	public Produto getByID(long produtoId) {
		return produtoDAO.getByID(produtoId);
	}
	
	@Override
	public List<Produto> getAll() {
		return produtoDAO.getAll();
	}
}
