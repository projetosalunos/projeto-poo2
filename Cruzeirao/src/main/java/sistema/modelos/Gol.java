package sistema.modelos;

public class Gol {

	private int golID;

	private Inscrito inscrito;
	private int tempo;
	private boolean penalti;

	public int getGolID() {
		return golID;
	}

	public void setGolID(int golID) {
		this.golID = golID;
	}

	public Inscrito getInscrito() {
		return inscrito;
	}

	public void setInscrito(Inscrito inscrito) {
		this.inscrito = inscrito;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public boolean isPenalti() {
		return penalti;
	}

	public void setPenalti(boolean penalti) {
		this.penalti = penalti;
	}

	@Override
	public String toString() {
		return "Gol [golID=" + golID + ", inscrito=" + inscrito + ", tempo=" + tempo + ", penalti=" + penalti + "]";
	}

}
