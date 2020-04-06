package apresentacao;

import negocio.Autor;
import negocio.Livro;
import negocio.Prateleira;

public class Livraria {
	public static void main(String[] args) {
		Prateleira objPrateleira = new Prateleira(1,"Romance");
		
		Livro objLivro = new Livro("O C�digo da Vinci",
				                        "12345",
				                        "Elseiver", //Tem que estar na ordem das classes
				                        new Autor("Dan Brown", "Americano"),
				                        objPrateleira);
		
		System.out.println("O titulo do livro �: " + objLivro.getTitulo());
		System.out.println("O nome do autor �: " + objLivro.getObjAutor().getNome());
		objLivro.getObjAutor().getNome();
	}
}
