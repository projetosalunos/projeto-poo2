package sistema.beans;

import java.util.List;

import sistema.modelos.Cartao;
import sistema.service.CartaoService;


public class CartaoManagedBean {
	private CartaoService service = new CartaoService();
	private Cartao cartao = new Cartao();



	public Cartao getCartao() {
		return cartao;
	}

	public void setPessoa(Cartao cartao) {
		this.cartao = cartao;
	}
	
	public void salvar()
	{   
   		 service.salvar(cartao);
 	   	 cartao = new Cartao();
	     //FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public List<Cartao> getCartoes() {
		return service.getCartoes();
	}
	
}
