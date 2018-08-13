package projeto.logistica.junioegustavo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import projeto.logistica.junioegustavo.entities.Identificavel;

@Entity

public class Pedido implements Identificavel {

	@Column
	@Id
	private Long id;
	@OneToMany(mappedBy = "produto")
	private Set<Produto> pedido;
	@ManyToOne
	@JoinColumn(name = "carregado")
	private Carga carga;
	@ManyToOne
	@JoinColumn(name="destino")
	private Cliente destinatario;
	private String enderecoPedido;
	private Double valorPedido;
	private Double volumePedido;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Cliente destinatario) {
		this.destinatario = destinatario;
	}

	public String getEnderecoPedido() {
		return enderecoPedido;
	}

	public void setEnderecoPedido(String enderecoPedido) {
		this.enderecoPedido = enderecoPedido;
	}

	public Double getValorPedido() {
		return valorPedido;
	}

	public void setValorPedido(Double valorPedido) {
		this.valorPedido = valorPedido;
	}

	public Double getVolumePedido() {
		return volumePedido;
	}

	public void setVolumePedido(Double volumePedido) {
		this.volumePedido = volumePedido;
	}

}
