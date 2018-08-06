package projeto.logistica.junioegustavo;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Trajeto {

	@Column
	@Id
	private Integer idTrajeto;
	private Set<String> cidades;
	private Double custo;

	public Integer getIdTrajeto() {
		return idTrajeto;
	}

	public void setIdTrajeto(Integer idTrajeto) {
		this.idTrajeto = idTrajeto;
	}

	public Set<String> getCidades() {
		return cidades;
	}

	public void setCidades(Set<String> cidades) {
		this.cidades = cidades;
	}

	public Double getCusto() {
		return custo;
	}

	public void setCusto(Double custo) {
		this.custo = custo;
	}

}
