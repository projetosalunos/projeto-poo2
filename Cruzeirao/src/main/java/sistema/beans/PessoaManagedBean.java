package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import sistema.modelos.Pessoa;
import sistema.service.PessoaService;
 
@ManagedBean
@ViewScoped

public class PessoaManagedBean {
	
	
	
	private PessoaService service = new PessoaService();
	private Pessoa pessoa = new Pessoa();
	  
	private String[] selectedNiveis;
    private List<String> nivel;
	
    @PostConstruct
    public void init() {
    	nivel = new ArrayList<String>();
    	nivel.add("Administrador");
    	nivel.add("Organizador");
        nivel.add("Massagista");
        nivel.add("Juiz");
        nivel.add("Goleiro");
        nivel.add("Marcador");
        nivel.add("Centro Avante");
    	nivel.add("Diretor");
    	nivel.add("Ala Direita");
        nivel.add("Ala Esquerda");
        nivel.add("Pivô");
        nivel.add("Passador");
        nivel.add("Armador");
        nivel.add("Finalizador");

    }

	public List<String> getNivel() {
		return nivel;
	}

	public void setNivel(List<String> nivel) {
		this.nivel = nivel;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public void salvar()
	{   
   		 service.salvar(pessoa);
 	   	 pessoa = new Pessoa();
	     FacesMessage msg = new FacesMessage("Successful", "Welcome :" + pessoa.getNome());
	     FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public List<Pessoa> getPessoas() {
		return service.getPessoas();
	}

	public String[] getSelectedNiveis() {
		return selectedNiveis;
	}

	public void setSelectedNiveis(String[] selectedNiveis) {
		this.selectedNiveis = selectedNiveis;
	}
	
}
