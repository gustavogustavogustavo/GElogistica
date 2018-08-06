package projeto.logistica.junioegustavo.beans;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import projeto.logistica.junioegustavo.Fornecedor;

@ManagedBean
@ApplicationScoped
public class FornecedorBean {
	private ArrayList<Fornecedor> fornecedores;
	private Fornecedor fornecedor;
	private Integer idAtual;
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
		idAtual = 0;
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
			fornecedor.setIdFornecedor(idAtual);
			fornecedores.add(fornecedor);
			fornecedor = new Fornecedor();
			idAtual += 1;
		}
		atualizando=false;
	}

	public void removeFornecedor(Integer idFornecedor) {
		for (Fornecedor fornecedor : fornecedores) {
			if (fornecedor.getIdFornecedor().equals(idFornecedor)) {
				fornecedores.remove(fornecedor);
				return;
			}
		}
	}

	public void atualizarFornecedor(Integer idFornecedor) {
		for (Fornecedor fornecedor : fornecedores) {
			if (fornecedor.getIdFornecedor().equals(idFornecedor)) {
				this.fornecedor = fornecedor;
				atualizando = true;
			}
		}
	}

	public String buscarFornecedor(Integer idFornecedor) {
		for (Fornecedor fornecedor : fornecedores) {
			if (fornecedor.getIdFornecedor().equals(idFornecedor)) {
				return fornecedor.toString();
			}
		}
		return null;
	}

}
