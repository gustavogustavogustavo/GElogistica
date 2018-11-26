package projeto.logistica.junioegustavo.beans;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projeto.logistica.junioegustavo.entities.Trajeto;
import projeto.logistica.junioegustavo.services.TrajetoService;

@SessionScoped
@Named
public class TrajetoBean {
	
	@Inject 
	private TrajetoService service;
	
	protected Trajeto entidade;

	protected Collection<Trajeto> entidades;

	public TrajetoBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}
	
	public void remove(Trajeto entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Trajeto getEntidade() {
		return entidade;
	}

	public void setEntidade(Trajeto entidade) {
		this.entidade = entidade;
	}

	public Collection<Trajeto> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Trajeto> entidades) {
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

	protected Trajeto newEntidade() {
		return new Trajeto();
	}

	public TrajetoService getService() {
		return service;
	}
}
