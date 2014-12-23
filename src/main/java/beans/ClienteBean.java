package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ClienteBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Cliente> clientes = new ArrayList<>();
	private Cliente cliente = new Cliente();
	
	public ClienteBean(){
		clientes.add(new Cliente("Fábio", "(11) 4056-1011"));
		clientes.add(new Cliente("Hideki", "(11) 4056-1243"));
		clientes.add(new Cliente("Lagôa", "(11) 4056-1234"));
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void incluir() {
		clientes.add(this.cliente);
		cliente = new Cliente();
	}
	
	public void excluir(){
		clientes.remove(cliente);
	}

}
