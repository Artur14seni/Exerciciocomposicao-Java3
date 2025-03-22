package entities;

public class ItemPedido {

	private int quantidade;
	private Produto produto;
	
	public ItemPedido() {
	}
	
	public ItemPedido(int quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}

	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double calcularSubtotal() {
		return (double)quantidade * produto.getPreco();
	}

	public String toString() {
		return produto+", Quantidade: " +quantidade + String.format(", Subtotal: $ %.2f", calcularSubtotal());
	}
	
	
	
	
	
	
	
}
