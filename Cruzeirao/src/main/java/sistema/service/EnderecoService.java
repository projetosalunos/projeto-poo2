package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.modelos.Endereco;

public class EnderecoService {
	
	private ArrayList <Endereco> enderecos = new ArrayList<Endereco>();
	
	public EnderecoService()
	{

	}
	
	public void salvar(Endereco endereco)
	{
		enderecos.add(endereco);
	}
	

	public List <Endereco> getEnderecos()
	{
		
		return enderecos;
		
	}
	
}
