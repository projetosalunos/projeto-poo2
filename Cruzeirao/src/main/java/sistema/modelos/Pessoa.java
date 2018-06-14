package sistema.modelos;


public class Pessoa {
	
	private String cpf;
	private String nome;
	private String rg;
	private String dataNasc;
	private String email;
	private String genero;
	private String senha;
	private String inscricao;
	private String nivel = "Usuario";
	
	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + ", rg=" + rg + ", dataNasc=" + dataNasc + ", email=" + email
				+ ", genero=" + genero + ", senha=" + senha + ", inscricao=" + inscricao + "]";
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getInscricao() {
		return inscricao;
	}
	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
}
