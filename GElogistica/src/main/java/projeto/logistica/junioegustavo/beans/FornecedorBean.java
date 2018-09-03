package projeto.logistica.junioegustavo.beans;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import projeto.logistica.junioegustavo.entities.Fornecedor;

@ManagedBean
@ApplicationScoped
public class FornecedorBean {
	private ArrayList<Fornecedor> fornecedores;
	private Fornecedor fornecedor;
	private Long idAtual;
	private boolean atualizando;

	public ArrayList<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(ArrayList<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public FornecedorBean() {
		fornecedor = new Fornecedor();
		fornecedores = new ArrayList<Fornecedor>();
		idAtual = 0l;
		atualizando = false;
	}

	public void addFornecedor() {
		if (atualizando) {
			for (Fornecedor fornecedor : fornecedores) {
				if (fornecedor.equals(this.fornecedor)) {
					fornecedor = this.fornecedor;
				}
			}
		} else {
			fornecedor.setId(idAtual);
			fornecedores.add(fornecedor);
			fornecedor = new Fornecedor();
			idAtual += 1;
		}
		atualizando=false;
	}

	public void removeFornecedor(Long id) {
		for (Fornecedor fornecedor : fornecedores) {
			if (fornecedor.getId().equals(id)) {
				fornecedores.remove(fornecedor);
				return;
			}
		}
	}

	public void atualizarFornecedor(Long id) {
		for (Fornecedor fornecedor : fornecedores) {
			if (fornecedor.getId().equals(id)) {
				this.fornecedor = fornecedor;
				atualizando = true;
			}
		}
	}

	public String buscarFornecedor(Long id) {
		for (Fornecedor fornecedor : fornecedores) {
			if (fornecedor.getId().equals(id)) {
				return fornecedor.toString();
			}
		}
		return null;
	}

}
