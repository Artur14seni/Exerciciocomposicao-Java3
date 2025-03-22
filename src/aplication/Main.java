package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import enums.StatusdoPedido;

public class Main {

	public static void main(String[] args) throws ParseException {
        final SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do cliente: ");
		String clientName = sc.nextLine();
		
		System.out.print("Email do cliente: ");
		String emailClient = sc.nextLine();
		
		System.out.print("Telefone do client: ");
		String telefoneClient = sc.nextLine();
		
		Client cliente = new Client(clientName, emailClient, telefoneClient);
		
		System.out.print("Digite o ID do pedido: ");
		Integer idItem = sc.nextInt();
		
		System.out.print("Data do pedido: ");
		Date dataPedido = date.parse(sc.next());
		
		System.out.print("Status do pedido: ");
		StatusdoPedido sp = StatusdoPedido.valueOf(sc.next());
		
		System.out.print("Quantidade de pedidos: ");
		int quantidadePedido = sc.nextInt();
		
		Pedido pd = new Pedido(idItem, dataPedido, sp, cliente);
		
		for(int i = 0; i < quantidadePedido; i++) {
			sc.nextLine();
			
			System.out.print("Nome do produto: ");
			String nomeProduto = sc.nextLine();
		
			System.out.print("Preço do produto: ");
			double precoProduto = sc.nextDouble();
			
			Produto produto = new Produto(nomeProduto, precoProduto);
			
			System.out.print("Quantidade de produtos: ");
			int quantidadeProduto = sc.nextInt();
			
			ItemPedido ip = new ItemPedido(quantidadeProduto, produto);
			
			pd.adicionarItem(ip);
		}
		
		System.out.println(pd);
		
		sc.close();
	}

}
