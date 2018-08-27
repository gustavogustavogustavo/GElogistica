package projeto.logistica.junioegustavo.DAO;

import java.util.List;

import projeto.logistica.junioegustavo.entities.Funcionario;
import projeto.logistica.junioegustavo.filtros.FuncionarioFiltro;

public class FuncionarioDAO extends DAO<Funcionario> {
	public FuncionarioDAO() {
		super(Funcionario.class);
	}

	public List<Funcionario> findBy(FuncionarioFiltro filtro) {
		return null;
	}

}
