package projeto.logistica.junioegustavo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import projeto.logistica.junioegustavo.entities.Identificavel;

@Entity

public class Fornecedor implements Identificavel {
	@Column
	private String nomeFornecedor;
	@Id
	private Long id;
	private String email;
	private String telefone;
	private String endere�o;

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

}
