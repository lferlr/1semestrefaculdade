package negocio;

public class Motorista extends Pessoa {
	//Propriedades da Classe
	private String habilitacao = "";

	//M�todos Construtores
	public Motorista() {
		super();
	}

	public Motorista(String nome, String endereco, String telefone, String cpf, String habilitacao) {
		super(nome, endereco, telefone, cpf);
		this.habilitacao = habilitacao;
	}

	//M�todos GET/SET
	public String getHabilitacao() {
		return habilitacao;
	}

	public void setHabilitacao(String habilitacao) {
		this.habilitacao = habilitacao;
	}

	
	

}
