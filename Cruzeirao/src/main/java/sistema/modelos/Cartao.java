package sistema.modelos;

public class Cartao {

	private int cartaoID;

	private Inscrito inscrito;
	private TipoCartao tipoCartao;
	private int tempo;

	public int getCartaoID() {
		return cartaoID;
	}

	public void setCartaoID(int cartaoID) {
		this.cartaoID = cartaoID;
	}

	public Inscrito getInscrito() {
		return inscrito;
	}

	public void setInscrito(Inscrito inscrito) {
		this.inscrito = inscrito;
	}

	public TipoCartao getTipoCartao() {
		return tipoCartao;
	}

	public void setTipoCartao(TipoCartao tipoCartao) {
		this.tipoCartao = tipoCartao;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	@Override
	public String toString() {
		return "Cartao [cartaoID=" + cartaoID + ", inscrito=" + inscrito + ", tipoCartao=" + tipoCartao + ", tempo="
				+ tempo + "]";
	}
	
}
