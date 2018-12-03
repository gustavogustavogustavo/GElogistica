package projeto.logistica.junioegustavo.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projeto.logistica.junioegustavo.entities.Carga;
import projeto.logistica.junioegustavo.services.CargaService;

@ApplicationScoped
@Named
public class CargaBean implements Serializable{

	@Inject
	private CargaService service;

	protected Carga entidade;

	protected Collection<Carga> entidades;

	public CargaBean() {
	}

	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Carga entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Carga getEntidade() {
		return entidade;
	}

	public void setEntidade(Carga entidade) {
		this.entidade = entidade;
	}

	public Collection<Carga> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Carga> entidades) {
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

	protected Carga newEntidade() {
		return new Carga();
	}

	public CargaService getService() {
		return service;
	}

}
