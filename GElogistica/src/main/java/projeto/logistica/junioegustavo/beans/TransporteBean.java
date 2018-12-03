package projeto.logistica.junioegustavo.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projeto.logistica.junioegustavo.entities.Transporte;
import projeto.logistica.junioegustavo.services.TransporteService;
@Named
@ApplicationScoped
public class TransporteBean implements Serializable{
	
	@Inject
	private TransporteService service;
	
	protected Transporte entidade;

	protected Collection<Transporte> entidades;

	public TransporteBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}
	
	public void remove(Transporte entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Transporte getEntidade() {
		return entidade;
	}

	public void setEntidade(Transporte entidade) {
		this.entidade = entidade;
	}

	public Collection<Transporte> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Transporte> entidades) {
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

	protected Transporte newEntidade() {
		return new Transporte();
	}

	public TransporteService getService() {
		return service;
	}

}
