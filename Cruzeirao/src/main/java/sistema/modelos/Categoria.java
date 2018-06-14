package sistema.modelos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;

	private String nome;
	private int nascidoApartirDe;
	private List<Inscricao> inscricoes;
	private Campeonato campeonato;
	private List<Grupo> grupos;
	private int minJogadores;
	private int maxJogadores;
	private String sexo;

	
	public Categoria(long ID, String nome) {
		super();
		this.ID = ID;
		this.nome = nome;
	}


	public Categoria() {
		
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

	public int getNascidoApartirDe() {
		return nascidoApartirDe;
	}

	public void setNascidoApartirDe(int nascidoApartirDe) {
		this.nascidoApartirDe = nascidoApartirDe;
	}

	public List<Inscricao> getInscricoes() {
		return inscricoes;
	}

	public void setInscricoes(List<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}

	public void addInscricoes(Inscricao inscricao){
		inscricoes.add(inscricao);
	}
	
	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	
	public void addGrupo(Grupo grupo){
		grupos.add(grupo);
	}

	public int getMinJogadores() {
		return minJogadores;
	}

	public void setMinJogadores(int minJogadores) {
		this.minJogadores = minJogadores;
	}

	public int getMaxJogadores() {
		return maxJogadores;
	}

	public void setMaxJogadores(int maxJogadores) {
		this.maxJogadores = maxJogadores;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo.toString();
	}

	
	//***********faltando implementar, gerar a chave************
	public void gerarChave() {

	}
	
	//***********faltando implementar, validar as equipes*********
	public int validarCategoria(){
		return 0;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (ID ^ (ID >>> 32));
		result = prime * result + ((campeonato == null) ? 0 : campeonato.hashCode());
		result = prime * result + ((grupos == null) ? 0 : grupos.hashCode());
		result = prime * result + ((inscricoes == null) ? 0 : inscricoes.hashCode());
		result = prime * result + maxJogadores;
		result = prime * result + minJogadores;
		result = prime * result + nascidoApartirDe;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
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
		Categoria other = (Categoria) obj;
		if (ID != other.ID)
			return false;
		if (campeonato == null) {
			if (other.campeonato != null)
				return false;
		} else if (!campeonato.equals(other.campeonato))
			return false;
		if (grupos == null) {
			if (other.grupos != null)
				return false;
		} else if (!grupos.equals(other.grupos))
			return false;
		if (inscricoes == null) {
			if (other.inscricoes != null)
				return false;
		} else if (!inscricoes.equals(other.inscricoes))
			return false;
		if (maxJogadores != other.maxJogadores)
			return false;
		if (minJogadores != other.minJogadores)
			return false;
		if (nascidoApartirDe != other.nascidoApartirDe)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Categoria [ID=" + ID + ", nome=" + nome + ", nascidoApartirDe=" + nascidoApartirDe + ", inscricoes="
				+ inscricoes + ", campeonato=" + campeonato + ", grupos=" + grupos + ", minJogadores=" + minJogadores
				+ ", maxJogadores=" + maxJogadores + ", sexo=" + sexo + "]";
	}
	
}
