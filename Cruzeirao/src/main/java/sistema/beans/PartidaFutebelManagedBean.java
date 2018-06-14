package sistema.beans;

import java.util.List;

import sistema.modelos.PartidaFutebol;
import sistema.service.PartidaFutebolService;

public class PartidaFutebelManagedBean {
	private PartidaFutebol partidaFutebol = new PartidaFutebol();
	private PartidaFutebolService service = new PartidaFutebolService();

	public void salvar() {
		service.salvar(partidaFutebol);
		partidaFutebol = new PartidaFutebol();

	}

	public PartidaFutebol getPartidaFutebol() {
		return partidaFutebol;
	}

	public void setPartidaFutebol(PartidaFutebol partidaFutebol) {
		this.partidaFutebol = partidaFutebol;
	}

	public List<PartidaFutebol> getPartidasFutebol() {
		return service.getPartidasFutebol();
	}
}
