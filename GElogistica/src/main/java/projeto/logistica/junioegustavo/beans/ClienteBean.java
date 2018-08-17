package projeto.logistica.junioegustavo.beans;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import projeto.logistica.junioegustavo.Cliente;

@ManagedBean
@ApplicationScoped
public class ClienteBean {

	private ArrayList<Cliente> clientes;
	private Cliente cliente;
	private Long idAtual;
	private boolean atualizando;

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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

	public ClienteBean() {
		cliente = new Cliente();
		clientes = new ArrayList<Cliente>();
		idAtual = 0l;
		atualizando = false;
	}

	public void addCliente() {
		if (atualizando) {
			for (Cliente cliente : clientes) {
				if (cliente.equals(this.cliente)) {
					cliente = this.cliente;
				}
			}
		} else {
			cliente.setId(idAtual);
			clientes.add(cliente);
			cliente = new Cliente();
			idAtual += 1;
		}
		atualizando = false;
	}

	public void removeCliente(Long id) {
		for (Cliente cliente : clientes) {
			if (cliente.getId().equals(id)) {
				clientes.remove(cliente);
			}
		}
	}

	public void atualizarFornecedor(Long id) {
		for (Cliente cliente : clientes) {
			if (cliente.getId().equals(id)) {
				this.cliente = cliente;
				atualizando = true;
			}
		}
	}

	public String buscarFornecedor(Long id) {
		for (Cliente cliente : clientes) {
			if (cliente.getId().equals(id)) {
				return cliente.toString();
			}
		}
		return null;
	}

}
