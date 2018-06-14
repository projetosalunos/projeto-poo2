package sistema.modelos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Time implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;
	private String nome;
	
	private String cidade;
	
	private String dataFundacao;

	
	
	public Time(long ID, String nome) {
		super();
		this.ID = ID;
		this.nome = nome;
	}

	public Time() {
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (ID ^ (ID >>> 32));
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((dataFundacao == null) ? 0 : dataFundacao.hashCode());
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
		Time other = (Time) obj;
		if (ID != other.ID)
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
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Time [ID=" + ID + ", nome=" + nome + ", cidade=" + cidade + ", dataFundacao=" + dataFundacao + "]";
	}

	public String getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(String dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	
	
}
