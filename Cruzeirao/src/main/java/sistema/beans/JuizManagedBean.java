package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Juiz;
import sistema.service.JuizService;

@ManagedBean
@SessionScoped
public class JuizManagedBean {

	private Juiz juiz = new Juiz();
	private List<Juiz> juizes;
	private JuizService service = new JuizService();

	public void salvar() {
		service.salvar(juiz);

		if (juizes != null)
			juizes.add(juiz);

		juiz = new Juiz();
	}

	public Juiz getJuiz() {
		return juiz;
	}

	public void setJuiz(Juiz juiz) {
		this.juiz = juiz;
	}

	public List<Juiz> getJuizes() {
		if (juizes == null)
			juizes = service.getJuizes();

		return juizes;
	}

	public void remover(Juiz juiz) {
		service.remover(juiz);
		juizes.remove(juiz);

	}
}
