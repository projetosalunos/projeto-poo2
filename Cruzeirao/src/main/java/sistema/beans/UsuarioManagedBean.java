package sistema.beans;

import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import java.io.Serializable;
import org.primefaces.event.FlowEvent;
import org.primefaces.event.RowEditEvent;

import sistema.modelos.Usuario;
import sistema.service.UsuarioService;

@SuppressWarnings("serial")
@ManagedBean
@SessionScoped
public class UsuarioManagedBean implements Serializable{

	private Usuario usuario = new Usuario();
	private List<Usuario> usuarios;
	private UsuarioService service = new UsuarioService();
	private Date dataNascimento;
	private boolean skip;
	private String option;
	private String password;
	
	 public void onRowEdit(RowEditEvent event) {

			Usuario u = ((Usuario) event.getObject());
			service.alterar(u);
		}

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getOption() {
		return option;
	}


	public void setOption(String option) {
		this.option = option;
	}


	public String Cadastra(){
		return "/cadastroPessoa.faces?faces-redirect=true";
	}
	
	
	   public Date getDataNascimento() {
	        return dataNascimento;
	    }
	 
	    public void setDataNascimento(Date dataNascimento) {
	        this.dataNascimento = dataNascimento;
	    }
	    
	public void salvar() {
		service.salvar(usuario);

		if (usuario != null)
			usuarios.add(usuario);

		usuario = new Usuario();
		
		FacesMessage msg = new FacesMessage("Successful", "Welcome      " + usuario.getNome()+"   Por gentileza Realize seu login");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		if (usuarios == null)
			usuarios = service.getUsuarios();

		return usuarios;
	}

	public void remover(Usuario usuario) {
		service.remover(usuario);
		usuarios.remove(usuario);

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
