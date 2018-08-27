package projeto.logistica.junioegustavo.DAO;

import java.util.List;

import projeto.logistica.junioegustavo.entities.Cliente;
import projeto.logistica.junioegustavo.filtros.ClienteFiltro;

public class ClienteDAO extends DAO<Cliente> {
	
	public ClienteDAO() {
		super(Cliente.class);
		}

		public List<Cliente> findBy(ClienteFiltro filtro) {
			return null;
		}
	}
	


	
