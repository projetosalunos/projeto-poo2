package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Equipe;

import sistema.service.EquipeService;

@ManagedBean
@SessionScoped
public class EquipeManagedBean {

	private Equipe equipe = new Equipe();
	private List<Equipe> equipes;
	private EquipeService service = new EquipeService();

	public void salvar() {
		service.salvar(equipe);

		if (equipes != null)
			equipes.add(equipe);

		equipe = new Equipe();
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public List<Equipe> getEquipes() {
		if (equipes == null)
			equipes = service.getEquipes();

		return equipes;
	}

	public void remover(Equipe equipe) {
		service.remover(equipe);
		equipes.remove(equipe);

	}
}
