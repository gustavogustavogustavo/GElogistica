package projeto.logistica.junioegustavo;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Trajeto {

	@Column
	@Id
	private Integer idTrajeto;
	private ArrayList<String> cidades;
	private Double custo;

	public Integer getIdTrajeto() {
		return idTrajeto;
	}

	public void setIdTrajeto(Integer idTrajeto) {
		this.idTrajeto = idTrajeto;
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
