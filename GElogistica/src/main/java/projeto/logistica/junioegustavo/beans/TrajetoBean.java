package projeto.logistica.junioegustavo.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projeto.logistica.junioegustavo.entities.Trajeto;
import projeto.logistica.junioegustavo.services.TrajetoService;

@ViewScoped
@Named
public class TrajetoBean implements Serializable {

	@Inject
	private TrajetoService service;

	protected Trajeto entidade;

	protected Collection<Trajeto> entidades;
	
	private String cidade;
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public TrajetoBean() {
	}

	@PostConstruct
	public void init() {
		entidade = newEntidade();
		ArrayList<String> cidades = new ArrayList<>();
		cidades.add("esperança");
		cidades.add("picui");
		entidade.setCidades(cidades);
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

	public String showCidades(ArrayList<String> cidades) {
		StringBuilder showCidades = new StringBuilder();
		for (String cidade : cidades) {
			showCidades.append(cidade + "; ");
		}
		return showCidades.toString();
	}
}
