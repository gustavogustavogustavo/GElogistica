package projeto.logistica.junioegustavo.beans;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import projeto.logistica.junioegustavo.Carga;

@ManagedBean
@ApplicationScoped
public class CargaBean {

	private ArrayList<Carga> cargas;
	private Carga carga;

	public ArrayList<Carga> getCargas() {
		return cargas;
	}

	public void setCargas(ArrayList<Carga> cargas) {
		this.cargas = cargas;
	}

	public Carga getCarga() {
		return carga;
	}

	public void setCarga(Carga carga) {
		this.carga = carga;
	}

	public void addCarga() {
		cargas.add(carga);
		carga = new Carga();
	}

	public void removeCarga(Integer idCarga) {
		for (Carga carga : cargas) {
			if (carga.getIdCarga() == idCarga) {
				cargas.remove(carga);
			}
		}
	}

	public String buscarCarga(Integer idCarga) {
		for (Carga carga : cargas) {
			if (carga.getIdCarga() == idCarga) {
				return carga.toString();
			}
		}
		return null;
	}
	
	public void atualizarCarga(Integer idCarga) {
		for (Carga carga : cargas) {
			if (carga.getIdCarga() == idCarga) {
				this.carga = carga;
	}
		}
	}

	public CargaBean() {
		carga = new Carga();
	}

}
