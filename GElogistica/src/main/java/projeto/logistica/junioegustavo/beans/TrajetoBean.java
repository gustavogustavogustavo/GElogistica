package projeto.logistica.junioegustavo.beans;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import projeto.logistica.junioegustavo.Trajeto;

@ManagedBean
@ApplicationScoped
public class TrajetoBean {
	private ArrayList<Trajeto> trajetos;
	private Trajeto trajeto;
	private Integer idAtual;
	private boolean atualizando;

	public ArrayList<Trajeto> getTrajetos() {
		return trajetos;
	}

	public void setTrajetos(ArrayList<Trajeto> trajetos) {
		this.trajetos = trajetos;
	}

	public Trajeto getTrajeto() {
		return trajeto;
	}

	public void setTrajeto(Trajeto trajeto) {
		this.trajeto = trajeto;
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

	public TrajetoBean() {
		trajeto = new Trajeto();
		trajetos = new ArrayList<Trajeto>();
		idAtual = 0;
		atualizando = false;
	}

	public void addTrajeto() {
		if (atualizando) {
			for (Trajeto trajeto : trajetos) {
				if (trajeto.equals(this.trajeto)) {
					trajeto = this.trajeto;
				}
			}
		} else {
			trajeto.setIdTrajeto(idAtual);
			trajetos.add(trajeto);
			trajeto = new Trajeto();
			idAtual += 1;
		}
		atualizando = false;
	}

	public void removeTrajeto(Integer idTrajeto) {
		for (Trajeto trajeto : trajetos) {
			if (trajeto.getIdTrajeto().equals(idTrajeto)) {
				trajetos.remove(trajeto);
			}
		}
	}

	public void atualizarTrajeto(Integer idTrajeto) {
		for (Trajeto trajeto : trajetos) {
			if (trajeto.getIdTrajeto().equals(idTrajeto)) {
				this.trajeto = trajeto;
				atualizando = true;
			}
		}
	}

	public String buscarTrajeto(Integer idTrajeto) {
		for (Trajeto trajeto : trajetos) {
			if (trajeto.getIdTrajeto().equals(idTrajeto)) {
				return trajeto.toString();
			}
		}
		return null;
	}
}
