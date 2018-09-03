package projeto.logistica.junioegustavo.services;

import java.io.Serializable;
import java.util.List;

import projeto.logistica.junioegustavo.DAO.FuncionarioDAO;
import projeto.logistica.junioegustavo.entities.Funcionario;
import projeto.logistica.junioegustavo.util.TransacionalCdi;

public class FuncionarioService implements Serializable ,Service<Funcionario>{

	private static final long serialVersionUID = -7803325791425670859L;
	private FuncionarioDAO funcionarioDAO;
	
	@Override
	@TransacionalCdi
	public void save(Funcionario e) {
		funcionarioDAO.save(e);
	}

	@Override
	@TransacionalCdi
	public void update(Funcionario e) {
		funcionarioDAO.update(e);
		
	}

	@Override
	@TransacionalCdi
	public void remove(Funcionario e) {
		funcionarioDAO.remove(e);
		
	}

	@Override
	public Funcionario getByID(long funcionarioId) {
		return funcionarioDAO.getByID(funcionarioId);
	}

	@Override
	public List<Funcionario> getAll() {
		return funcionarioDAO.getAll();
	}
}