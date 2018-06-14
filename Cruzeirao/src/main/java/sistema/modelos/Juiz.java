package sistema.modelos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Juiz extends Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long JuizID;

	private Tipo tipo;
	private Usuario usuario;

	public Juiz(long JuizID) {
		super();
		this.JuizID = JuizID;
	}

	public Juiz() {
	}

	public long getJuizID() {
		return JuizID;
	}

	public void setJuizID(long juizID) {
		JuizID = juizID;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (int) (JuizID ^ (JuizID >>> 32));
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Juiz other = (Juiz) obj;
		if (JuizID != other.JuizID)
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
		return "Juiz [JuizID=" + JuizID + ", tipo=" + tipo + ", usuario=" + usuario + "]";
	}

}
