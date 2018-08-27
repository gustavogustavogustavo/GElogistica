package projeto.logistica.junioegustavo.entities;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import projeto.logistica.junioegustavo.entities.Identificavel;

@Entity

public class Transporte implements Identificavel{
	@Id
	private Long id;
	@OneToMany(mappedBy="transporte")
	private Set<Funcionario> funcionario;
	@OneToOne
	@JoinColumn(name="cidades")
	private Trajeto trajeto;
	private Double volumeMaximo;
	private Double pesoMaximo;
	@OneToOne
	@JoinColumn(name="carga")
	private Carga carga;
	private Double custoEntrega;
	private Double lucro;

	public Double getCustoEntrega() {
		return custoEntrega;
	}

	public void setCustoEntrega(Double custoEntrega) {
		this.custoEntrega = custoEntrega;
	}

	public Double getLucro() {
		return lucro;
	}

	public void setLucro(Double lucro) {
		this.lucro = lucro;
	}

	public Double getVolumeMaximo() {
		return volumeMaximo;
	}

	public void setVolumeMaximo(Double volumeMaximo) {
		this.volumeMaximo = volumeMaximo;
	}

	public Double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(Double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public Carga getCarga() {
		return carga;
	}

	public void setCarga(Carga carga) {
		this.carga = carga;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Set<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

	public Trajeto getTrajeto() {
		return trajeto;
	}

	public void setTrajeto(Trajeto trajeto) {
		this.trajeto = trajeto;
	}

}
