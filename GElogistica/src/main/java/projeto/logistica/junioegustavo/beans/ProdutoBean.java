package projeto.logistica.junioegustavo.beans;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import projeto.logistica.junioegustavo.entities.Produto;
import projeto.logistica.junioegustavo.services.ProdutoService;

@Named
@ApplicationScoped

public class ProdutoBean {
	
	@Inject
	private ProdutoService service;
	
	protected Produto entidade;

	protected Collection<Produto> entidades;

	public ProdutoBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}
	
	public void remove(Produto entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Produto getEntidade() {
		return entidade;
	}

	public void setEntidade(Produto entidade) {
		this.entidade = entidade;
	}

	public Collection<Produto> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Produto> entidades) {
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

	protected Produto newEntidade() {
		return new Produto();
	}

	public ProdutoService getService() {
		return service;
	}
}
