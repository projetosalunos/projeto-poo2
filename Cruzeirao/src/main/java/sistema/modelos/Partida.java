package sistema.modelos;

import java.util.List;

public class Partida {

	private int PartidaID;

	private int numero;
	private Inscricao equipeMandante;
	private Inscricao equipeVisitante;
	private String data;
	private Local local;
	private Partida proxPartida;
	private List<Juiz> juizes;
	private Grupo grupo;
	private String relatoJuiz;

	public int getPartidaID() {
		return PartidaID;
	}

	public void setPartidaID(int partidaID) {
		PartidaID = partidaID;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Inscricao getEquipeMandante() {
		return equipeMandante;
	}

	public void setEquipeMandante(Inscricao equipeMandante) {
		this.equipeMandante = equipeMandante;
	}

	public Inscricao getEquipeVisitante() {
		return equipeVisitante;
	}

	public void setEquipeVisitante(Inscricao equipeVisitante) {
		this.equipeVisitante = equipeVisitante;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Partida getProxPartida() {
		return proxPartida;
	}

	public void setProxPartida(Partida proxPartida) {
		this.proxPartida = proxPartida;
	}

	public List<Juiz> getJuizes() {
		return juizes;
	}

	public void setJuizes(List<Juiz> juizes) {
		this.juizes = juizes;
	}

	public void addJuiz(Juiz juiz) {
		juizes.add(juiz);
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public String getRelatoJuiz() {
		return relatoJuiz;
	}

	public void setRelatoJuiz(String relatoJuiz) {
		this.relatoJuiz = relatoJuiz;
	}

	@Override
	public String toString() {
		return "Partida [PartidaID=" + PartidaID + ", numero=" + numero + ", equipeMandante=" + equipeMandante
				+ ", equipeVisitante=" + equipeVisitante + ", data=" + data + ", local=" + local + ", proxPartida="
				+ proxPartida + ", grupo=" + grupo + ", relatoJuiz=" + relatoJuiz + "]";
	}

}
