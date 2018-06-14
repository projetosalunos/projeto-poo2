package sistema.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FlowEvent;
import org.primefaces.event.RowEditEvent;

import sistema.modelos.Campeonato;
import sistema.service.CampeonatoService;

@ManagedBean
@SessionScoped
public class CampeonatoManagedBean {

	private Campeonato campeonato = new Campeonato();
	private List<Campeonato> campeonatos;
	private CampeonatoService service = new CampeonatoService();
	private boolean skip;
	
	public void onRowEdit(RowEditEvent event) {

		Campeonato c = ((Campeonato) event.getObject());
		service.alterar(c);
	}

	public void salvar() {
		service.salvar(campeonato);

		if (campeonatos != null)
			campeonatos.add(campeonato);

		campeonato = new Campeonato();
		
		FacesMessage msg = new FacesMessage("Successful", "Campeonato Cadastrado      ");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public List<Campeonato> getCampeonatos() {
		if (campeonatos == null)
			campeonatos = service.getCampeonatos();

		return campeonatos;
	}

	public void remover(Campeonato campeonato) {
		service.remover(campeonato);
		campeonatos.remove(campeonato);

	}
	
	public boolean isSkip() {
        return skip;
    }
 
    public void setSkip(boolean skip) {
        this.skip = skip;
    }
     
    public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        }
        else {
            return event.getNewStep();
        }
    }

}
