package sistema.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FlowEvent;
import org.primefaces.event.RowEditEvent;

import sistema.modelos.Time;
import sistema.service.TimeService;


@SuppressWarnings("serial")
@ManagedBean
@SessionScoped

public class TimeManagedBean implements Serializable {

	private Time time = new Time();
	private List<Time> times;
	private TimeService service = new TimeService();
	private List<String> jogadores;
	private boolean skip;
	
	public void onRowEdit(RowEditEvent event) {

		Time t = ((Time) event.getObject());
		service.alterar(t);
	}
	
	 @PostConstruct
		 public List<String> getJogadores() {
				if (jogadores == null)
					jogadores = service.getJogadores();

				return jogadores;
			}
		 

	public void salvar() {
		service.salvar(time);

		if (times != null)
			times.add(time);

		time = new Time();
		
		FacesMessage msg = new FacesMessage("Successful", "Time Cadastrado ");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time= time;
	}

	public List<Time> getTimes() {
		if (times == null)
			times = service.getTimes();

		return times;
	}

	public void remover(Time time) {
		service.remover(time);
		times.remove(time);

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
