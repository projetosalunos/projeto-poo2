package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Inscrito;
import sistema.service.InscritoService;

@ManagedBean
@SessionScoped
public class InscritoManagedBean {

	private Inscrito inscrito = new Inscrito();
	private List<Inscrito> inscritos;
	private InscritoService service = new InscritoService();

	public void salvar() {
		service.salvar(inscrito);

		if (inscritos != null)
			inscritos.add(inscrito);

		inscrito = new Inscrito();
	}

	public Inscrito getInscrito() {
		return inscrito;
	}

	public void setInscrito(Inscrito inscrito) {
		this.inscrito = inscrito;
	}

	public List<Inscrito> getInscritos() {
		if (inscritos == null)
			inscritos = service.getInscritos();

		return inscritos;
	}

	public void remover(Inscrito inscrito) {
		service.remover(inscrito);
		inscritos.remove(inscrito);

	}
}
