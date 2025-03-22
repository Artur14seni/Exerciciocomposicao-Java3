package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.StatusdoPedido;

public class Pedido {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer id;
	private Date date;
	private StatusdoPedido status;
	private Client cliente;
	private List<ItemPedido> itens = new ArrayList<>();
	
	public Pedido(Integer id, Date date, StatusdoPedido status, Client cliente) {
		this.id = id;
		this.date = date;
		this.status = status;
		this.cliente = cliente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public StatusdoPedido getStatus() {
		return status;
	}

	public void setStatus(StatusdoPedido status) {
		this.status = status;
	}

	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}
	
	public void adicionarItem(ItemPedido item) {
		itens.add(item);
	}
	
	public void removerItem(ItemPedido item) {
		itens.remove(item);
	}
	
	public double calcularTotal() {
		double totalPreco = 0;
		for(ItemPedido x: itens) {
			totalPreco += x.calcularSubtotal();
		}
		return totalPreco;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(cliente);
		sb.append("\nId do pedido: ");
		sb.append(id);
		sb.append("\nStatus do pedido: ");
		sb.append(status);
		sb.append("\nData do pedido: ");
		sb.append(sdf.format(date));
		
		for(ItemPedido x: itens) {
			sb.append("\n");
			sb.append(x);
			sb.append("\n----------------------------------------------------------------------------");
		}
		sb.append(String.format("\nPreço total: $ %.2f", calcularTotal()));
		return sb.toString();
	}
	
	
	
	
}
