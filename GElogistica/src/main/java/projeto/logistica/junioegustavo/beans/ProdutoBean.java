package projeto.logistica.junioegustavo.beans;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import projeto.logistica.junioegustavo.Produto;

@ManagedBean
@ApplicationScoped

public class ProdutoBean {
	private ArrayList<Produto> produtos;
	private Produto produto;
	private Long idAtual;
	private boolean atualizando;
	
	public void addProduto() {
		if (atualizando) {
			for (Produto produto : produtos) {
				if (produto.equals(this.produto)) {
					produto = this.produto;
				}
			}
		} else {
			produto.setId(idAtual);
			produtos.add(produto);
			produto = new Produto();
			idAtual += 1;
		}
		atualizando=false;
	}

	public void removeProduto(Long id) {
		for (Produto produto : produtos) {
			if (produto.getId().equals(id)) {
				produtos.remove(produto);
				return;
			}
		}
	}

	public void atualizarProdutos(Integer id) {
		for (Produto produto : produtos) {
			if (produto.getId().equals(id)) {
				this.produto = produto;
				atualizando = true;
			}
		}
	}

	public String buscarProduto(Integer id) {
		for (Produto produto : produtos) {
			if (produto.getId().equals(id)) {
				return produto.toString();
			}
		}
		return null;
	}
}
