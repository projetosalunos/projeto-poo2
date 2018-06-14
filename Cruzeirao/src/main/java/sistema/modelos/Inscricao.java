package sistema.modelos;

import java.util.List;

public class Inscricao {

	private int InscricaoID;

	private boolean pagamento;
	private boolean validada;
	private List<Inscrito> inscritos;
	private Categoria categoria;
	private Partida partidas;
	private Equipe equipe;

	public int getInscricaoID() {
		return InscricaoID;
	}

	public void setInscricaoID(int inscricaoID) {
		InscricaoID = inscricaoID;
	}

	public boolean isPagamento() {
		return pagamento;
	}

	public void setPagamento(boolean pagamento) {
		this.pagamento = pagamento;
	}

	public boolean isValidada() {
		return validada;
	}

	public void setValidada(boolean validada) {
		this.validada = validada;
	}

	public List<Inscrito> getInscritos() {
		return inscritos;
	}

	public void setInscritos(List<Inscrito> inscritos) {
		this.inscritos = inscritos;
	}

	public void addInscritos(Inscrito inscrito) {
		inscritos.add(inscrito);
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Partida getPartidas() {
		return partidas;
	}

	public void setPartidas(Partida partidas) {
		this.partidas = partidas;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	@Override
	public String toString() {
		return "Inscricao [pagamento=" + pagamento + ", validada=" + validada + ", inscritos=" + inscritos
				+ ", categoria=" + categoria + ", partidas=" + partidas + "]";
	}

}
