package sistema.beans;

import java.util.List;

import sistema.modelos.Gol;
import sistema.service.GolService;

public class GolManagedBean {
	private GolService service = new GolService();
	private Gol gol = new Gol();
	
	public Gol getGol() {
		return gol;
	}

	public void setGol(Gol gol) {
		this.gol= gol;
	}
	
	public void salvar()
	{   
   		 service.salvar(gol);
 	   	 gol = new Gol();
	     //FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public List<Gol> getGols() {
		return service.getGols();
	}
}
