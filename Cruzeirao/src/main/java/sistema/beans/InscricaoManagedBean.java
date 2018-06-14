package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Inscricao;
import sistema.service.InscricaoService;

@ManagedBean
@SessionScoped
public class InscricaoManagedBean {
	
	private Inscricao inscricao = new Inscricao();
	private InscricaoService service = new InscricaoService();
	
	
	public void salvar()
	{
		service.salvar(inscricao);
		inscricao = new Inscricao();
		
	}

	public Inscricao getInscricao() {
		return inscricao;
	}

	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}

	public List<Inscricao> getInscricoes() {
		return service.getInscricoes();
	}
     
	

}
