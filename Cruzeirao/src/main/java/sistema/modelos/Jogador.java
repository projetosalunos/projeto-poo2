package sistema.modelos;

public class Jogador extends Usuario{
	private String posicao;
	private int gools;
	private int cartoesAmarelos;
	private int cartoesVermelhos;
	
	public boolean ConfirmarInscricao(){
		return false;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public int getGools() {
		return gools;
	}

	public void setGools(int gools) {
		this.gools = gools;
	}

	public int getCartoesAmarelos() {
		return cartoesAmarelos;
	}

	public void setCartoesAmarelos(int cartoesAmarelos) {
		this.cartoesAmarelos = cartoesAmarelos;
	}

	public int getCartoesVermelhos() {
		return cartoesVermelhos;
	}

	public void setCartoesVermelhos(int cartoesVermelhos) {
		this.cartoesVermelhos = cartoesVermelhos;
	}

	@Override
	public String toString() {
		return "Jogador [posicao=" + posicao + ", gools=" + gools + ", cartoesAmarelos=" + cartoesAmarelos
				+ ", cartoesVermelhos=" + cartoesVermelhos + "]";
	}
	
}
