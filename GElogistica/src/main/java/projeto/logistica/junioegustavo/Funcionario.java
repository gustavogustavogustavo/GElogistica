package projeto.logistica.junioegustavo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import projeto.logistica.junioegustavo.entities.Identificavel;

@Entity
 
public class Funcionario implements Identificavel {

	@Column
	private String nomeFuncionario;
	@Id
	private Long id;
	private String funcao;
	private Double salario;
	@ManyToOne
	@JoinColumn(name="transportador")
	private Transporte transporte; 
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
