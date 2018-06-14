package sistema.modelos;

public class Local {

	private int LocalID;

	private String Endereco;
	private String Cidade;

	public int getLocalID() {
		return LocalID;
	}

	public void setLocalID(int localID) {
		LocalID = localID;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	@Override
	public String toString() {
		return "Local [Endereco=" + Endereco + ", Cidade=" + Cidade + "]";
	}

}
