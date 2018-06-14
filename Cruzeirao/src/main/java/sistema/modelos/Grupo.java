package sistema.modelos;

import java.util.List;

public class Grupo {

	private int GrupoID;

	private String nome;
	private int numero;
	private Categoria categoria;
	private List<Partida> partidas;

	public int getGrupoID() {
		return GrupoID;
	}

	public void setGrupoID(int grupoID) {
		GrupoID = grupoID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Partida> getPartidas() {
		return partidas;
	}

	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}

	@Override
	public String toString() {
		return "Grupo [GrupoID=" + GrupoID + ", nome=" + nome + ", numero=" + numero + ", categoria=" + categoria
				+ ", partidas=" + partidas + "]";
	}

}
