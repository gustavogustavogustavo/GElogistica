package projeto.logistica.junioegustavo.entities;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import projeto.logistica.junioegustavo.entities.Identificavel;

@Entity

public class Carga implements Identificavel {

	@Column
	@Id
	private Long id;
	@OneToMany(mappedBy = "carga")
	private Set<Pedido> pedidos;
	private Double volumecarga;
	private Double precoCarga;
	@OneToOne
	@JoinColumn(name = "responsabilidade")
	private Funcionario responsavel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Double getVolumecarga() {
		return volumecarga;
	}

	public void setVolumecarga(Double volumecarga) {
		this.volumecarga = volumecarga;
	}

	public Double getPrecoCarga() {
		return precoCarga;
	}

	public void setPrecoCarga(Double precoCarga) {
		this.precoCarga = precoCarga;
	}

	public Funcionario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}

}
