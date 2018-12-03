package projeto.logistica.junioegustavo.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import projeto.logistica.junioegustavo.entities.Fornecedor;
import projeto.logistica.junioegustavo.services.FornecedorService;

@Named
@ApplicationScoped
public class FornecedorBean implements Serializable{
	
	@Inject
	private FornecedorService service;
	
	protected Fornecedor entidade;

	protected Collection<Fornecedor> entidades;

	public FornecedorBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}
	
	public void remove(Fornecedor entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Fornecedor getEntidade() {
		return entidade;
	}

	public void setEntidade(Fornecedor entidade) {
		this.entidade = entidade;
	}

	public Collection<Fornecedor> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Fornecedor> entidades) {
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

	protected Fornecedor newEntidade() {
		return new Fornecedor();
	}

	public FornecedorService getService() {
		return service;
	}


}
