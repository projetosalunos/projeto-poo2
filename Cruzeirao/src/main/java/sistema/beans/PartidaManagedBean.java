package sistema.beans;

import java.util.List;

import sistema.modelos.Partida;
import sistema.service.PartidaService;

public class PartidaManagedBean {
	private Partida partida = new Partida();
	private PartidaService service = new PartidaService();

	public void salvar() {
		service.salvar(partida);
		partida = new Partida();

	}

	public Partida getPartida() {
		return partida;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public List<Partida> getPartidas() {
		return service.getPartidas();
	}

}
