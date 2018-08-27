package projeto.logistica.junioegustavo.DAO;

import java.util.List;

import projeto.logistica.junioegustavo.filtros.UsuarioFiltro;
import projeto.logistica.junioegustavo.entities.Usuario;

public class UsuarioDAO extends DAO<Usuario> {
	
	public UsuarioDAO() {
		super(Usuario.class);
	}

	public List<Usuario> findBy(UsuarioFiltro filtro) {
		return null;
	}
	
}
