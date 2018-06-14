package sistema.modelos;

import java.util.ArrayList;

public class Tecnico extends Pessoa{
	
	private ArrayList<Partida> partidas;
	private ArrayList<Time> times;
	public ArrayList<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}
	public ArrayList<Time> getTimes() {
		return times;
	}
	public void setTimes(ArrayList<Time> times) {
		this.times = times;
	}

}
