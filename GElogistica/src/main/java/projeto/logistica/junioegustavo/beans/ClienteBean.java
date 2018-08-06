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
	private Integer idAtual;
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

	public Integer getIdAtual() {
		return idAtual;
	}

	public void setIdAtual(Integer idAtual) {
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
		idAtual = 0;
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
			cliente.setIdCliente(idAtual);
			clientes.add(cliente);
			cliente = new Cliente();
			idAtual += 1;
		}
		atualizando = false;
	}

	public void removeCliente(Integer idCliente) {
		for (Cliente cliente : clientes) {
			if (cliente.getIdCliente().equals(idCliente)) {
				clientes.remove(cliente);
			}
		}
	}

	public void atualizarFornecedor(Integer idCliente) {
		for (Cliente cliente : clientes) {
			if (cliente.getIdCliente().equals(idCliente)) {
				this.cliente = cliente;
				atualizando = true;
			}
		}
	}

	public String buscarFornecedor(Integer idCliente) {
		for (Cliente cliente : clientes) {
			if (cliente.getIdCliente().equals(idCliente)) {
				return cliente.toString();
			}
		}
		return null;
	}

}
