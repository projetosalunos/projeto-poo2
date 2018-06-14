package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sistema.modelos.Endereco;
import sistema.service.EnderecoService;


 
@ManagedBean
@ViewScoped


public class EnderecoManagedBean {
	
	private EnderecoService service = new EnderecoService();
	private Endereco endereco = new Endereco();
	
	private String[] selectedLocais;
    private List<String> local;
	
    @PostConstruct
    public void init() {
    	local = new ArrayList<String>();
    	local.add("Estadio");
    	local.add("Time");
    	local.add("Usuario");
    	local.add("Campeonato");

    }
    
	public List<String> getLocal() {
		return local;
	}

	public void setLocal(List<String> local) {
		this.local = local;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void salvar()
	{   
   		 service.salvar(endereco);
 	   	 endereco = new Endereco();
	}
	
	public List<Endereco> getEnderecos() {
		return service.getEnderecos();
	}

	public String[] getSelectedLocais() {
		return selectedLocais;
	}

	public void setSelectedLocais(String[] selectedLocais) {
		this.selectedLocais = selectedLocais;
	}
}
