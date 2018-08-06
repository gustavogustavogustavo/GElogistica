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
	private Integer idAtual;
	private boolean atualizando;
	
	public void addProduto() {
		if (atualizando) {
			for (Produto produto : produtos) {
				if (produto.equals(this.produto)) {
					produto = this.produto;
				}
			}
		} else {
			produto.setIdProduto(idAtual);
			produtos.add(produto);
			produto = new Produto();
			idAtual += 1;
		}
		atualizando=false;
	}

	public void removeProduto(Integer idTrajeto) {
		for (Produto produto : produtos) {
			if (produto.getIdProduto().equals(idTrajeto)) {
				produtos.remove(produto);
				return;
			}
		}
	}

	public void atualizarProdutos(Integer idProduto) {
		for (Produto produto : produtos) {
			if (produto.getIdProduto().equals(idProduto)) {
				this.produto = produto;
				atualizando = true;
			}
		}
	}

	public String buscarProduto(Integer idProduto) {
		for (Produto produto : produtos) {
			if (produto.getIdProduto().equals(idProduto)) {
				return produto.toString();
			}
		}
		return null;
	}
}
