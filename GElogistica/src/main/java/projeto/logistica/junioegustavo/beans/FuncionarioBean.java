package projeto.logistica.junioegustavo.beans;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import projeto.logistica.junioegustavo.Funcionario;

@ManagedBean
@ApplicationScoped

public class FuncionarioBean {

	private ArrayList<Funcionario> funcionarios;
	private Funcionario funcionario;
	private Long idAtual;
	private boolean atualizando;

	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Long getIdAtual() {
		return idAtual;
	}

	public void setIdAtual(Long idAtual) {
		this.idAtual = idAtual;
	}

	public boolean isAtualizando() {
		return atualizando;
	}

	public void setAtualizando(boolean atualizando) {
		this.atualizando = atualizando;
	}

public FuncionarioBean() {
	funcionario = new Funcionario();
	funcionarios = new ArrayList<Funcionario>();
	idAtual = 0l;
	atualizando = false;
}

	public void addFornecedor() {
		if (atualizando) {
			for (Funcionario funcionario : funcionarios) {
				if (funcionario.equals(this.funcionario)) {
					funcionario = this.funcionario;
				}
			}
		} else {
			funcionario.setId(idAtual);
			funcionarios.add(funcionario);
			funcionario = new Funcionario();
			idAtual += 1;
		}
		atualizando = false;
	}

	public void removeFornecedor(Integer id) {
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getId().equals(id)) {
				funcionarios.remove(funcionario);
			}
		}
	}

	public void atualizarFornecedor(Integer id) {
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getId().equals(id)) {
				this.funcionario = funcionario;
				atualizando = true;
			}
		}
	}

	public String buscarFuncionario(Integer id) {
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getId().equals(id)) {
				return funcionario.toString();
			}
		}
		return null;
	}

}
