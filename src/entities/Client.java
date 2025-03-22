package entities;

public class Client {

	public String nome;
	public String email;
	public String telefone;
	
	public Client() {}
	
	public Client(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String toString() {
		return "Client: \nnome=" + nome + "\nemail=" + email + "\ntelefone=" + telefone;
	}
	
	
	
	
}
