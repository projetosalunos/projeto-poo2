package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.modelos.Local;

public class LocalService {
	private ArrayList<Local> locais = new ArrayList<Local>();

	public LocalService() {

	}

	public void salvar(Local local) {
		locais.add(local);
	}

	public List<Local> getLocais() {

		return locais;

	}
}
