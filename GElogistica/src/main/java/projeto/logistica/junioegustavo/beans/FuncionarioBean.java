package projeto.logistica.junioegustavo.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import projeto.logistica.junioegustavo.entities.Funcionario;
import projeto.logistica.junioegustavo.services.FuncionarioService;

@Named
@ApplicationScoped

public class FuncionarioBean implements Serializable{
	
	@Inject
	private FuncionarioService service;

	protected Funcionario entidade;

	protected Collection<Funcionario> entidades;

	public FuncionarioBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}
	
	public void remove(Funcionario entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Funcionario getEntidade() {
		return entidade;
	}

	public void setEntidade(Funcionario entidade) {
		this.entidade = entidade;
	}

	public Collection<Funcionario> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Funcionario> entidades) {
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

	protected Funcionario newEntidade() {
		return new Funcionario();
	}

	public FuncionarioService getService() {
		return service;
	}

}
