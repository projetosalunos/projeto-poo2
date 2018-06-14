package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import javax.persistence.JoinColumn;

@Entity
@NamedQuery(name = "Usuario.pesquisarPorUserName", query = "select u from Usuario u where u.username = :username")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6360850095345609468L;
	
	public static final String PESQUISAR_POR_USERNAME = "Usuario.pesquisarPorUserName";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;

	private String email;
	private String nome;
	private String dataNascimento;
	
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	
	private String telefoneFixo;
	private String telefoneMovel;
	private String endereco;
	private String CPF;
	private String RG;
	
	@Enumerated(EnumType.STRING)
	private Roles role;
	
	public Roles getRole() {
		return role;
	}
	public void setRole(Roles role) {
		this.role = role;
	}


	
	private String sexo;

	private String password;
	private String username;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}



	@ManyToMany
	@JoinTable(name = "usuario_has_equipes", joinColumns = { @JoinColumn(name = "usuario_id") }, inverseJoinColumns = {
			@JoinColumn(name = "equipe_id") })
	private List<Equipe> equipes = new ArrayList<Equipe>();

	@OneToMany
	@JoinColumn(name = "usuario_id")
	private List<Inscrito> inscricoes = new ArrayList<Inscrito>();

	@OneToMany
	@JoinTable(name = "campeonato_has_usuarios", joinColumns = @JoinColumn(name = "usuario_id") , inverseJoinColumns = @JoinColumn(name = "campeonato_id") )
	private List<Campeonato> campeonatos = new ArrayList<Campeonato>();

	public Usuario(long ID, String nome) {
		super();
		this.ID = ID;
		this.nome = nome;
		this.role = Roles.NORMAL;
	}

	public Usuario() {
		this.role = Roles.NORMAL;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public List<Equipe> getEquipes() {
		return equipes;
	}

	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}

	public void addEquipes(Equipe equipe) {
		equipes.add(equipe);
	}

	public List<Inscrito> getInscricoes() {
		return inscricoes;
	}

	public void setInscricoes(List<Inscrito> inscricoes) {
		this.inscricoes = inscricoes;
	}

	public void addInscritos(Inscrito inscrito) {
		inscricoes.add(inscrito);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}

	public void addCampeonato(Campeonato campeonato) {
		campeonatos.add(campeonato);
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getTelefoneMovel() {
		return telefoneMovel;
	}

	public void setTelefoneMovel(String telefoneMovel) {
		this.telefoneMovel = telefoneMovel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo.toString();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CPF == null) ? 0 : CPF.hashCode());
		result = prime * result + (int) (ID ^ (ID >>> 32));
		result = prime * result + ((RG == null) ? 0 : RG.hashCode());
		result = prime * result + ((campeonatos == null) ? 0 : campeonatos.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((equipes == null) ? 0 : equipes.hashCode());
		result = prime * result + ((inscricoes == null) ? 0 : inscricoes.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((telefoneFixo == null) ? 0 : telefoneFixo.hashCode());
		result = prime * result + ((telefoneMovel == null) ? 0 : telefoneMovel.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Usuario other = (Usuario) obj;
		if (CPF == null) {
			if (other.CPF != null)
				return false;
		} else if (!CPF.equals(other.CPF))
			return false;
		if (ID != other.ID)
			return false;
		if (RG == null) {
			if (other.RG != null)
				return false;
		} else if (!RG.equals(other.RG))
			return false;
		if (campeonatos == null) {
			if (other.campeonatos != null)
				return false;
		} else if (!campeonatos.equals(other.campeonatos))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (equipes == null) {
			if (other.equipes != null)
				return false;
		} else if (!equipes.equals(other.equipes))
			return false;
		if (inscricoes == null) {
			if (other.inscricoes != null)
				return false;
		} else if (!inscricoes.equals(other.inscricoes))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (role != other.role)
			return false;
		if (sexo != other.sexo)
			return false;
		if (telefoneFixo == null) {
			if (other.telefoneFixo != null)
				return false;
		} else if (!telefoneFixo.equals(other.telefoneFixo))
			return false;
		if (telefoneMovel == null) {
			if (other.telefoneMovel != null)
				return false;
		} else if (!telefoneMovel.equals(other.telefoneMovel))
			return false;
		if (tipo != other.tipo)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [ID=" + ID + ", email=" + email + ", nome=" + nome + ", dataNascimento=" + dataNascimento
				+ ", tipo=" + tipo + ", telefoneFixo=" + telefoneFixo + ", telefoneMovel=" + telefoneMovel
				+ ", endereco=" + endereco + ", CPF=" + CPF + ", RG=" + RG + ", role=" + role + ", sexo=" + sexo
				+ ", password=" + password + ", username=" + username + ", equipes=" + equipes + ", inscricoes="
				+ inscricoes + ", campeonatos=" + campeonatos + "]";
	}

}
