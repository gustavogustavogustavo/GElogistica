package projeto.logistica.junioegustavo.entities;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import projeto.logistica.junioegustavo.entities.Identificavel;

@Entity

public class Trajeto implements Identificavel{

	@Column
	@Id
	private Long id;
	private ArrayList<String> cidades;
	private Double custo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ArrayList<String> getCidades() {
		return cidades;
	}

	public void setCidades(ArrayList<String> cidades) {
		this.cidades = cidades;
	}

	public Double getCusto() {
		return custo;
	}

	public void setCusto(Double custo) {
		this.custo = custo;
	}

}
