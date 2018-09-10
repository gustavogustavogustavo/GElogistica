package projeto.logistica.junioegustavo.beans;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import projeto.logistica.junioegustavo.entities.Cliente;
import projeto.logistica.junioegustavo.services.ClienteService;

@Named
@ApplicationScoped
public class ClienteBean {

	@Inject
	private ClienteService service;
	
	protected Cliente entidade;

	protected Collection<Cliente> entidades;

	public ClienteBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}
	
	public void remove(Cliente entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Cliente getEntidade() {
		return entidade;
	}

	public void setEntidade(Cliente entidade) {
		this.entidade = entidade;
	}

	public Collection<Cliente> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Cliente> entidades) {
		this.entidades = entidades;
	}

	public void save() {
		getService().save(entidade);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		entidades = getService().getAll();
		entidade = newEntidade();
	}

	protected Cliente newEntidade() {
		return new Cliente();
	}

	public ClienteService getService() {
		return service;
	}

}
