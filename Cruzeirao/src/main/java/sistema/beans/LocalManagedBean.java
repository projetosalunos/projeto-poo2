package sistema.beans;

import java.util.List;

import sistema.modelos.Local;
import sistema.service.LocalService;



public class LocalManagedBean {
	private Local local = new Local();
	private LocalService service = new LocalService();
	
	
	public void salvar()
	{
		service.salvar(local);
		local = new Local();
		
	}

	public Local getLocal() {
		return local;
	}

	public void setLocaol(Local local) {
		this.local = local;
	}

	public List<Local> getLocais() {
		return service.getLocais();
	}
}
