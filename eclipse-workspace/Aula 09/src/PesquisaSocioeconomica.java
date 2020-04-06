import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PesquisaSocioeconomica {
	public static void main (String args[]) throws Exception {
		//Declara��o de vari�veis
		String leitor = "";
		double rendaTotal = 0;
		double populacao = 0;
		double rendaMedia = 0;
		
		//Entrada de Dados
		leitor = "s";
		while (leitor.equals("s")) {
			System.out.println("Digite a renda familiar: ");
			leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			rendaTotal= Integer.parseInt(leitor);
			
			System.out.println("Digite a quantidade de filhos: ");
			leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			populacao= Integer.parseInt(leitor);
			
			System.out.println("Deseja continuar <s/n> ? ");
			leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		}
		
		//Processamento
		rendaMedia = rendaTotal / populacao;
		
		//Saida de dados 
		if (rendaMedia >= 10000) {
			System.out.println("A popula��o � classe A!!");
		}else if (rendaMedia >= 7500) {
			System.out.println("A popula��o � classe B!!");
		}else if (rendaMedia >= 5000) {
			System.out.println("A popula��o � classe C!!");
		}else if (rendaMedia >= 1000) {
			System.out.println("A popula��o � classe D!!");
		}else {
			System.out.println("A popula��o � classe E!!");
		}
	}
}
