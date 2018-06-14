package sistema.modelos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Inscrito implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long InscritoID;

	private Tipo tipo;

	@ManyToOne
	private Usuario usuario;


	//private Inscricao inscricao;
	private boolean aceiteUsuario;
	private boolean InscricaoValidada;

	public Inscrito(long InscritoID) {
		super();
		this.InscritoID = InscritoID;
	}

	public Inscrito() {
	}

	public long getInscritoID() {
		return InscritoID;
	}

	public void setInscritoID(long inscritoID) {
		InscritoID = inscritoID;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
/*
	public Inscricao getInscricao() {
		return inscricao;
	}

	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}
*/
	public boolean isAceiteUsuario() {
		return aceiteUsuario;
	}

	public void setAceiteUsuario(boolean aceiteUsuario) {
		this.aceiteUsuario = aceiteUsuario;
	}

	public boolean isInscricaoValidada() {
		return InscricaoValidada;
	}

	public void setInscricaoValidada(boolean inscricaoValidada) {
		InscricaoValidada = inscricaoValidada;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (InscricaoValidada ? 1231 : 1237);
		result = prime * result + (int) (InscritoID ^ (InscritoID >>> 32));
		result = prime * result + (aceiteUsuario ? 1231 : 1237);
		//result = prime * result + ((inscricao == null) ? 0 : inscricao.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		Inscrito other = (Inscrito) obj;
		if (InscricaoValidada != other.InscricaoValidada)
			return false;
		if (InscritoID != other.InscritoID)
			return false;
		if (aceiteUsuario != other.aceiteUsuario)
			return false;
		if (tipo != other.tipo)
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Inscrito [tipo=" + tipo + ", usuario=" + usuario + ", aceiteUsuario="
				+ aceiteUsuario + ", InscricaoValidada=" + InscricaoValidada + "]";
	}

}
