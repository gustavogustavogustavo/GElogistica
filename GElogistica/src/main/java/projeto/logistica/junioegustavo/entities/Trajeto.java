package projeto.logistica.junioegustavo.entities;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import projeto.logistica.junioegustavo.entities.Identificavel;

@Entity

public class Trajeto implements Identificavel {

	@Column
	@Id
	@GeneratedValue(generator="trajetoGen")
	@SequenceGenerator(name="trajetoGen", sequenceName="trajeto_seq")
	private Long id;
	private String nome;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
