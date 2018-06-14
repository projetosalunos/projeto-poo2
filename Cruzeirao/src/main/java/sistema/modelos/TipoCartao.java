package sistema.modelos;

public enum TipoCartao {
	Amarelo(1), Vermelho(2);
	
	private int valor;
	
	TipoCartao(int valor){
		this.valor = valor;
	}
	
	public int getValor(){
		return valor;
	}
}
