package sistema.modelos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Equipe implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long EquipeID;

	private String nome;
	private String dataFundacao;
	private String cidade;

	@ManyToMany(mappedBy = "equipes")
	private List<Usuario> diretores;

	
	public Equipe(long EquipeID, String nome) {
		super();
		this.EquipeID = EquipeID;
		this.nome = nome;
	}

	public Equipe() {
	}
	
	public long getEquipeID() {
		return EquipeID;
	}

	public void setEquipeID(long equipeID) {
		EquipeID = equipeID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(String dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public List<Usuario> getDiretores() {
		return diretores;
	}

	public void setDiretores(List<Usuario> diretores) {
		this.diretores = diretores;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (EquipeID ^ (EquipeID >>> 32));
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((dataFundacao == null) ? 0 : dataFundacao.hashCode());
		result = prime * result + ((diretores == null) ? 0 : diretores.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Equipe other = (Equipe) obj;
		if (EquipeID != other.EquipeID)
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (dataFundacao == null) {
			if (other.dataFundacao != null)
				return false;
		} else if (!dataFundacao.equals(other.dataFundacao))
			return false;
		if (diretores == null) {
			if (other.diretores != null)
				return false;
		} else if (!diretores.equals(other.diretores))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Equipe [nome=" + nome + ", dataFundacao=" + dataFundacao + ", cidade=" + cidade + ", diretores="
				+ diretores + "]";
	}

}
