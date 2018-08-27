package projeto.logistica.junioegustavo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import projeto.logistica.junioegustavo.entities.Identificavel;

@Entity

public class Produto implements Identificavel {

	@Column
	private String nomeProduto;
	private String desc;
	@Id
	private Long id;
	private Double precoProduto;
	private Double volumeOcupado;
	@ManyToOne
	@JoinColumn(name = "produtos")
	private Produto produto;
	@ManyToOne
	@JoinColumn(name = "fornece")
	private Fornecedor fornecedor;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPreco() {
		return precoProduto;
	}

	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public Double getVolumeOcupado() {
		return volumeOcupado;
	}

	public void setVolumeOcupado(Double volumeOcupado) {
		this.volumeOcupado = volumeOcupado;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double getPrecoProduto() {
		return precoProduto;
	}

}
