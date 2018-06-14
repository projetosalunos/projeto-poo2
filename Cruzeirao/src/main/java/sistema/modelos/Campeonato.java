package sistema.modelos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Campeonato implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;
	private String nome;
	
	private List<Local> locais;
	private List<Juiz> juizes;
	private List<Categoria> categorias;
	
	private String dataInicioInscricao;
	private String dataFimInscricao;
	private String dataInicioCampeonato;
	private String dataFimCampeonato;
	
	
	private double valorTaxa;

	public Campeonato(long ID, String nome) {
		super();
		this.ID = ID;
		this.nome = nome;
	}	
	

	public List<Local> getLocais() {
		return locais;
	}


	public void setLocais(List<Local> locais) {
		this.locais = locais;
	}


	public List<Juiz> getJuizes() {
		return juizes;
	}


	public void setJuizes(List<Juiz> juizes) {
		this.juizes = juizes;
	}


	public List<Categoria> getCategorias() {
		return categorias;
	}


	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}


	public double getValorTaxa() {
		return valorTaxa;
	}


	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}


	public Campeonato() {
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataInicioInscricao() {
		return dataInicioInscricao;
	}


	public void setDataInicioInscricao(String dataInicioInscricao) {
		this.dataInicioInscricao = dataInicioInscricao;
	}


	public String getDataFimInscricao() {
		return dataFimInscricao;
	}


	public void setDataFimInscricao(String dataFimInscricao) {
		this.dataFimInscricao = dataFimInscricao;
	}


	public String getDataInicioCampeonato() {
		return dataInicioCampeonato;
	}


	public void setDataInicioCampeonato(String dataInicioCampeonato) {
		this.dataInicioCampeonato = dataInicioCampeonato;
	}


	public String getDataFimCampeonato() {
		return dataFimCampeonato;
	}


	public void setDataFimCampeonato(String dataFimCampeonato) {
		this.dataFimCampeonato = dataFimCampeonato;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (ID ^ (ID >>> 32));
		result = prime * result + ((categorias == null) ? 0 : categorias.hashCode());
		result = prime * result + ((dataFimCampeonato == null) ? 0 : dataFimCampeonato.hashCode());
		result = prime * result + ((dataFimInscricao == null) ? 0 : dataFimInscricao.hashCode());
		result = prime * result + ((dataInicioCampeonato == null) ? 0 : dataInicioCampeonato.hashCode());
		result = prime * result + ((dataInicioInscricao == null) ? 0 : dataInicioInscricao.hashCode());
		result = prime * result + ((juizes == null) ? 0 : juizes.hashCode());
		result = prime * result + ((locais == null) ? 0 : locais.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valorTaxa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Campeonato other = (Campeonato) obj;
		if (ID != other.ID)
			return false;
		if (categorias == null) {
			if (other.categorias != null)
				return false;
		} else if (!categorias.equals(other.categorias))
			return false;
		if (dataFimCampeonato == null) {
			if (other.dataFimCampeonato != null)
				return false;
		} else if (!dataFimCampeonato.equals(other.dataFimCampeonato))
			return false;
		if (dataFimInscricao == null) {
			if (other.dataFimInscricao != null)
				return false;
		} else if (!dataFimInscricao.equals(other.dataFimInscricao))
			return false;
		if (dataInicioCampeonato == null) {
			if (other.dataInicioCampeonato != null)
				return false;
		} else if (!dataInicioCampeonato.equals(other.dataInicioCampeonato))
			return false;
		if (dataInicioInscricao == null) {
			if (other.dataInicioInscricao != null)
				return false;
		} else if (!dataInicioInscricao.equals(other.dataInicioInscricao))
			return false;
		if (juizes == null) {
			if (other.juizes != null)
				return false;
		} else if (!juizes.equals(other.juizes))
			return false;
		if (locais == null) {
			if (other.locais != null)
				return false;
		} else if (!locais.equals(other.locais))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(valorTaxa) != Double.doubleToLongBits(other.valorTaxa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Campeonato [ID=" + ID + ", nome=" + nome + ", locais=" + locais + ", juizes=" + juizes + ", categorias="
				+ categorias + ", dataInicioInscricao=" + dataInicioInscricao + ", dataFimInscricao=" + dataFimInscricao
				+ ", dataInicioCampeonato=" + dataInicioCampeonato + ", dataFimCampeonato=" + dataFimCampeonato
				+ ", valorTaxa=" + valorTaxa + "]";
	}

}
