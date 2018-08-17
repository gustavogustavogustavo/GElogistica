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

	public void removeCarga(Long id) {
		for (Carga carga : cargas) {
			if (carga.getId() == id) {
				cargas.remove(carga);
			}
		}
	}

	public String buscarCarga(Long id) {
		for (Carga carga : cargas) {
			if (carga.getId() == id) {
				return carga.toString();
			}
		}
		return null;
	}
	
	public void atualizarCarga(Long id) {
		for (Carga carga : cargas) {
			if (carga.getId() == id) {
				this.carga = carga;
	}
		}
	}

	public CargaBean() {
		carga = new Carga();
	}

}
