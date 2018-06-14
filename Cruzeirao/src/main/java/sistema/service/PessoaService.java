package sistema.service;

import java.util.ArrayList;
import java.util.List;
import sistema.modelos.Pessoa;

public class PessoaService{
	
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	
	public PessoaService()
	{
		
	}
	
	public void salvar(Pessoa pessoa)
	{
		pessoas.add(pessoa);
	}
	
	public List <Pessoa> getPessoas()
	{
		return pessoas;
	}



}
