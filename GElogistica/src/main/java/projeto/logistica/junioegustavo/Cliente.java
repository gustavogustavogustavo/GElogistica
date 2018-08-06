package projeto.logistica.junioegustavo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente {

	@Column
	@Id
	private Integer idCliente;
	private String nomeCliente;
	private String contatoCliente;
	private String emailCliente;
	@OneToMany(mappedBy="destinatario")
	private Set<Pedido> pedidos;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getContatoCliente() {
		return contatoCliente;
	}

	public void setContatoCliente(String contatoCliente) {
		this.contatoCliente = contatoCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

}
