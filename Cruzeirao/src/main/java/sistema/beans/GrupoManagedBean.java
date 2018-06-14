package sistema.beans;

import java.util.List;

import sistema.modelos.Grupo;

import sistema.service.GrupoService;

public class GrupoManagedBean {

	private Grupo grupo = new Grupo();
	private GrupoService service = new GrupoService();

	public void salvar() {
		service.salvar(grupo);
		grupo = new Grupo();

	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public List<Grupo> getGrupos() {
		return service.getGrupos();
	}
}
