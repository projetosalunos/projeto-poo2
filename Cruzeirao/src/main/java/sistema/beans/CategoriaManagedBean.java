package sistema.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.CellEditEvent;
import org.primefaces.event.FlowEvent;
import org.primefaces.event.RowEditEvent;

import sistema.modelos.Categoria;
import sistema.service.CategoriaService;



@SuppressWarnings("serial")
@ManagedBean
@SessionScoped
public class CategoriaManagedBean implements Serializable{
	

	private Categoria categoria = new Categoria();
	private List<Categoria> categorias;
	private CategoriaService service = new CategoriaService();
	private boolean skip;
	
	
	 public List<String> getSexos() {
	        return service.getSexos();
	}
	
	 
	 public void onRowEdit(RowEditEvent event) {

			Categoria c = ((Categoria) event.getObject());
			service.alterar(c);
		}
	 
	public void salvar()
	{
		service.salvar(categoria);
		
		if (categorias != null)
			categorias.add(categoria);

		
		categoria = new Categoria();
		
		FacesMessage msg = new FacesMessage("Successful", "Categoria cadastrada ");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Categoria> getCategorias() {
		return service.getCategorias();
	}
	
	public void remover(Categoria categoria) {
		service.remover(categoria);
		categorias.remove(categoria);

	}
	
	public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alteração realizada", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
	
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
