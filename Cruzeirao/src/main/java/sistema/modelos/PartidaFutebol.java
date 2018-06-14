package sistema.modelos;

import java.util.List;

public class PartidaFutebol {

	private int partidaFutebolID;

	private List<Gol> golsMandante;
	private List<Gol> golsVisitante;
	private List<Gol> golsPenaltiMandante;
	private List<Gol> golsPenaltiVisitante;
	private List<Cartao> cartoesMandante;
	private List<Cartao> cartoesVisitante;

	public int getPartidaFutebolID() {
		return partidaFutebolID;
	}

	public void setPartidaFutebolID(int partidaFutebolID) {
		this.partidaFutebolID = partidaFutebolID;
	}

	public List<Gol> getGolsMandante() {
		return golsMandante;
	}

	public void setGolsMandante(List<Gol> golsMandante) {
		this.golsMandante = golsMandante;
	}

	public List<Gol> getGolsVisitante() {
		return golsVisitante;
	}

	public void setGolsVisitante(List<Gol> golsVisitante) {
		this.golsVisitante = golsVisitante;
	}

	public List<Gol> getGolsPenaltiMandante() {
		return golsPenaltiMandante;
	}

	public void setGolsPenaltiMandante(List<Gol> golsPenaltiMandante) {
		this.golsPenaltiMandante = golsPenaltiMandante;
	}

	public List<Gol> getGolsPenaltiVisitante() {
		return golsPenaltiVisitante;
	}

	public void setGolsPenaltiVisitante(List<Gol> golsPenaltiVisitante) {
		this.golsPenaltiVisitante = golsPenaltiVisitante;
	}

	public List<Cartao> getCartoesMandante() {
		return cartoesMandante;
	}

	public void setCartoesMandante(List<Cartao> cartoesMandante) {
		this.cartoesMandante = cartoesMandante;
	}

	public List<Cartao> getCartoesVisitante() {
		return cartoesVisitante;
	}

	public void setCartoesVisitante(List<Cartao> cartoesVisitante) {
		this.cartoesVisitante = cartoesVisitante;
	}

	@Override
	public String toString() {
		return "PartidaFutebol [partidaFutebolID=" + partidaFutebolID + ", golsMandante=" + golsMandante
				+ ", golsVisitante=" + golsVisitante + ", golsPenaltiMandante=" + golsPenaltiMandante
				+ ", golsPenaltiVisitante=" + golsPenaltiVisitante + ", cartoesMandante=" + cartoesMandante
				+ ", cartoesVisitante=" + cartoesVisitante + "]";
	}

}
